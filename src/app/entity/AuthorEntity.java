package app.entity;

public class AuthorEntity extends Entity{

	private int idAuthor;
	private String name;
	private String firstname;
	
	// Constructeur v1
	public AuthorEntity(int idAuthor, String name, String firstname) {
		super();
		this.idAuthor = idAuthor;
		this.name = name;
		this.firstname = firstname;
	
	}
	
	// Constructeur v2
	public AuthorEntity(String name, String firstname) {
		super();
		this.name = name;
		this.firstname = firstname;
	
	}

	public int getIdAuthor() {
		return idAuthor;
	}
	
	public int getAuthor() {
		return idAuthor;
	}
	public void setAuthor(int author) {
		idAuthor = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Override
	public String toString() {
//		return "AuthorEntity [idAuthor=" + idAuthor + ", name=" + name
//				+ ", firstname=" + firstname + "]";
		return name + ", " + firstname;
	}
	

}
