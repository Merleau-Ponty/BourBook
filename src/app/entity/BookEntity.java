package app.entity;

public class BookEntity extends Entity {

	private int id;
	private int idCategory;
	private String resume;
	private String isbn;
	private String title;
	private int nbPages;
	public AuthorEntity author;

	// Constructeur v1
	public BookEntity(int id, AuthorEntity author, int idCategory, String resume,
					String isbn, String title, int nbPages) {
		super();
		this.id = id;
		this.author = author;
		this.idCategory = idCategory;
		this.resume = resume;
		this.isbn = isbn;
		this.title = title;
		this.nbPages = nbPages;
		// TODO Auto-generated constructor stub
	}

	public BookEntity(AuthorEntity author, String resume,
					String isbn, String title, int nbPages) {
		super();
		this.author = author;
		this.resume = resume;
		this.isbn = isbn;
		this.title = title;
		this.nbPages = nbPages;
		// TODO Auto-generated constructor stub
	}

	// Constructeur v2
	public BookEntity(String title, String resume, int nbPages) {
		super();
		this.title = title;
		this.resume = resume;
		this.nbPages = nbPages;
		// TODO Auto-generated constructor stub
	}

	// Constructeur v3 
	public BookEntity(String title, AuthorEntity author, String resume, int nbPages) {
		super();
		this.title = title;
		this.author = author;
		this.resume = resume;
		this.nbPages = nbPages;
	}

	public BookEntity(String resume, String isbn, String title, int nbPages) {
		super();
		this.resume = resume;
		this.isbn = isbn;
		this.title = title;
		this.nbPages = nbPages;
	}

	public int getId() {
		return id;
	}

	public String getResume() {
		return resume;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getNbPages() {
		return nbPages;
	}

	public int getIdAuthor() {
		return author.getIdAuthor();
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", idAuthor=" + this.getIdAuthor()
						+ ", idCategory=" + idCategory + ", resume=" + resume + ","
						+ "title=" + title + ", isbn=" + isbn + ", nbPages=" + nbPages
						+ "]";
	}

	/**
	 * Renvoie un extrait du résumé du livre
	 *
	 * @return String
	 */
	public String getExtract() {
		int lgLimit = 150;
		int nbWords = 0;
		String extract = "";
		String[] words = resume.split(" ");

		while (extract.length() < lgLimit && nbWords < words.length - 1) {
			String word = words[nbWords];
			extract += word + " ";
			nbWords++;
		}
		return extract;
	}

}
