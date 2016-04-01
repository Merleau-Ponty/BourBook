package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.database.Database;
import app.entity.AuthorEntity;

public class AuthorModel extends Model{

	public AuthorModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<AuthorEntity> lister(){
		ArrayList<AuthorEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from AUTHOR ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new AuthorEntity(res.getInt("ID"), res.getString("NAME"), res.getString("FIRSTNAME") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}

}
