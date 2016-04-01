package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.database.Database;
import app.entity.CategoryEntity;

public class CategoryModel extends Model{

	public CategoryModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<CategoryEntity> lister(){
		ArrayList<CategoryEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from CATEGORY ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new CategoryEntity(res.getInt("ID"), res.getString("LABEL") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}

}
