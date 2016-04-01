package app.entity;

public class CopyEntity extends Entity {
	
	private int idCopy;
	private int idBook;

	public CopyEntity(int idCopy, int idBook) {
		super();
		this.idCopy = idCopy;
		this.idBook = idBook;
	}
	
	public int getIdCopy() {
		return idCopy;
	}
	
	public int getIdBook() {
		return idBook;
	}

	public void setIdCopy(int idCopy) {
		this.idCopy = idCopy;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	@Override
	public String toString() {
		return "CopyEntity [idCopy=" + idCopy + ", idBook=" + idBook + "]";
	}
	
	

}
