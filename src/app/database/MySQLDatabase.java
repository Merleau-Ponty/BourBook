package app.database;

import app.database.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDatabase extends Database{
	
    private String db_user;
    private String db_password;
    private String db_url;
    private Connection connection;
    
	public MySQLDatabase(String db_user, String db_password, String db_url) throws ClassNotFoundException{
		super();

		this.db_user = db_user;
		this.db_password = db_password;
		this.db_url = db_url;
		
		/* Chargement du driver JDBC pour MySQL */
        System.out.println( "Chargement du driver..." );
        Class.forName( "com.mysql.jdbc.Driver" );
        System.out.println("Driver chargé !" );
	}

	private Connection getConnection(){
		if(connection == null){
			try {
				connection = DriverManager.getConnection(db_url, db_user, db_password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	
}
