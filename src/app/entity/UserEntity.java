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
	
	
	public UserEntity(int idUser, String login, String password, String name, String firstname, String phone, 
			String mail, String service) {
		super();
		this.idUser = idUser;
		this.login = login;
		this.password = password;
		this.name = name;
		this.firstname = firstname;
		this.phone = phone;
		this.mail = mail;
		this.service = service;
	}
	
	
	public UserEntity(String login, String password, String name, String firstname, String phone, 
			String mail, String service) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
		this.firstname = firstname;
		this.phone = phone;
		this.mail = mail;
		this.service = service;
	}
	
	public UserEntity(String name, String firstname) {
		super();
		this.name = name;
		this.firstname = firstname;
	}
	
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

	@Override
	public String toString() {
		return "UserEntity [idUser=" + idUser + ", login=" + login
				+ ", password=" + password + ", name=" + name + ", firstname="
				+ firstname + ", phone=" + phone + ", mail=" + mail
				+ ", service=" + service + "]";
	}
	
}
