package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.database.Database;
import app.entity.CopyEntity;

public class CopyModel extends Model {

	public CopyModel(Database db) {
		super(db);
	}
	
	public ArrayList<CopyEntity> lister(){
		ArrayList<CopyEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from COPY ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new CopyEntity(res.getInt("ID"), res.getInt("ID_BOOK") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}

}
