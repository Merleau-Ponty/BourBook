package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import app.database.Database;
import app.entity.LoanEntity;

public class LoanModel extends Model{

	public LoanModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<LoanEntity> lister(){
		ArrayList<LoanEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from LOAN ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new LoanEntity(res.getInt("ID"), res.getInt("ID_USER"), res.getInt("ID_COPY"), res.getString("STARTDATE"),
						res.getString("ENDDATE"), res.getBoolean("WAITING")) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}

}
