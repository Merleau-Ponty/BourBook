package app.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config{

	private Properties properties;
	private static Config _instance;

	private Config(String filePath) throws IOException {
		FileInputStream in = new FileInputStream(filePath);
		properties.load(in);
		in.close();
	}
	
	/**
	 * Renvoie l'instance unique de la classe Config
	 * @param filePath ex : config.properties
	 * @return Config
	 */
	public static Config getInstance(String filePath){
		if(_instance == null){
			try {
				_instance = new Config(filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return _instance;
	}
	
	/**
	 * Renvoie la propriété liée à la clé entrée en paramètre
	 * @param key String
	 * @return String
	 */
	public String getProperty(String key){
		return properties.getProperty(key);
	}

}
