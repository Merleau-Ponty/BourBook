package app.model;

import app.database.Database;
import app.database.MySQLDatabase;

public class Model {

    protected MySQLDatabase db;
    protected String table;
    
    protected Model(Database db){
    	this.db = (MySQLDatabase) db;
    	if(table == null){
    		table = this.getClass().getSimpleName().replace("Model", "").toUpperCase();
    	}
    }

}
