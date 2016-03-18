package app;

import app.database.Database;
import app.database.MySQLDatabase;

public class App {

	private static App _instance;
	private Database db_instance;
	
	public App getInstance(){
		if(_instance == null){
			_instance = new App();
		}
		return _instance;
	}
	
	public Database getDb(){
		if(db_instance == null){
			Config config = Config.getInstance("config.properties");
			try {
				db_instance = new MySQLDatabase(config.getProperty("user"), config.getProperty("password"), config.getProperty("url"));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return db_instance;
	}

}
