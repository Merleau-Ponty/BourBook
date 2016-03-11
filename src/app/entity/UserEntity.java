package app.entity;

public class UserEntity extends Entity{

	private int idUser;
	private String login;
	private String password;
	private String name;
	private String firstname;
	private String phone;
	private String mail;
	private String service;
	
	public int getIdUser() {
		return idUser;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getPhone() {
		return phone;
	}
	public String getMail() {
		return mail;
	}
	public String getService() {
		return service;
	}
	
}
