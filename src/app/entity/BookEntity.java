package app.entity;

public class BookEntity extends Entity{

	private int idBook;
	private int idAuthor;
	private int idCategory;
	private String resume;
	private String isbn;
	private String title;
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
	public String getTitle() {
		return title;
	}
	public int getNbPages() {
		return nbPages;
	}
	
	public int getIdAuthor() {
		return idAuthor;
	}

	public int getIdCategory() {
		return idCategory;
	}
	
	/**
	 * Renvoie un extrait du résumé du livre
	 * @return String 
	 */
	public String getExtract(){
		int lgLimit = 150;
		int nbWords = 0;
		String extract = "";
		String[] words = resume.split(" ");
		
		while (extract.length() < lgLimit && nbWords < words.length-1){
			String word = words[nbWords];
			extract += word + " ";
			nbWords++;
		}
		return extract;
	}

}
