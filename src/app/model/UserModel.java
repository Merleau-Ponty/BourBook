package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.database.Database;
import app.entity.BookEntity;
import app.entity.UserEntity;

public class UserModel extends Model{

	public UserModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<UserEntity> lister(){
		ArrayList<UserEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from USER ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new UserEntity(res.getInt("ID"), res.getString("LOGIN"), res.getString("PASSWORD"), res.getString("NAME"), 
						res.getString("FIRSTNAME"), res.getString("PHONE"), res.getString("MAIL"), res.getString("SERVICE") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList<UserEntity> checkLog(String login, String password){
		ArrayList<UserEntity> identity = new ArrayList();
		
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select NAME, FIRSTNAME from USER "
					+ "where LOGIN = '"+ login+"'"
					+ "AND PASSWORD = '"+ password +"';";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				identity.add(new UserEntity(res.getString("NAME"), 
						res.getString("FIRSTNAME") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return identity;
		
	}
	
	/**
	 * Insertion en Bdd d'un utilisateur
	 * @param UserEntity user
	 */
	public void insertUser(UserEntity user){
		try {
			Statement statement = db.getConnection().createStatement();
			String req = "INSERT INTO USER (`LOGIN`, `PASSWORD`, `NAME`, `FIRSTNAME`, `PHONE`, `MAIL`, `SERVICE`) VALUES ("
					+ "'"+ user.getLogin()+"', '"+ user.getPassword()+"', '"+ user.getName()+"', '"+ user.getFirstname()+"', '"+ user.getPhone()+"', '"+ user.getMail()+"', '"+ user.getService()+"');";
			statement.executeUpdate(req);
		} catch (SQLException e){
			System.err.println("Erreur d'insertion dans la BDD : "+e);
		}
	}

}
