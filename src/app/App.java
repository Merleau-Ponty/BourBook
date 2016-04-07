package app;

import java.util.ResourceBundle;

import javax.swing.JFrame;

import app.controller.MainController;
import app.database.Database;
import app.database.MySQLDatabase;
import app.view.MenuBar;

public class App {

	private static App _instance;
	private static Database db_instance;
	private static MainController mainController;
	
	private App(){
		super();
	}
	
	public static Database getDb(){
		if(db_instance == null){
//			Config config = Config.getInstance("config.properties");
			ResourceBundle config = ResourceBundle.getBundle("config.config");
			try {
				db_instance = new MySQLDatabase(config.getString("user"), config.getString("password"), config.getString("url"));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return db_instance;
	}
	
	public static MainController getMainController(){
		return App.mainController;
	}
	
	public static void loadFrame(){
		JFrame frame = new MenuBar();
		App.mainController = new MainController(frame);
	}

}
