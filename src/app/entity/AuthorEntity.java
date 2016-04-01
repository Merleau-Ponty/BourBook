package app.entity;

public class AuthorEntity extends Entity{

	private int idAuthor;
	private String name;
	private String firstname;
	
	
	public AuthorEntity(int idAuthor, String name, String firstname) {
		super();
		this.idAuthor = idAuthor;
		this.name = name;
		this.firstname = firstname;
	
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
		return "AuthorEntity [idAuthor=" + idAuthor + ", name=" + name
				+ ", firstname=" + firstname + "]";
	}
	

}
