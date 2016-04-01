package app.model;


import java.sql.*;
import java.util.ArrayList;

import app.database.Database;
import app.entity.BookEntity;
import app.entity.Entity;

public class BookModel extends Model {

	public BookModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<BookEntity> lister(){
		ArrayList<BookEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from BOOK ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new BookEntity(res.getInt("ID"), res.getInt("ID_AUTHOR"), res.getInt("ID_CATEGORY"), res.getString("RESUME"),		
				res.getString("ISBN"), res.getString("TITLE"), res.getInt("NBPAGES") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}
	
	

}
