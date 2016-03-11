package app.entity;

public class BookEntity extends Entity{

	private int idBook;
	private String resume;
	private String isbn;
	private String tile;
	private int nbPages;
	
	public int getIdBook() {
		return idBook;
	}
	public String getResume() {
		return resume;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTile() {
		return tile;
	}
	public int getNbPages() {
		return nbPages;
	}

}
