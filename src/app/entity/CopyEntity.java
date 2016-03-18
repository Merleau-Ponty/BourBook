package app.entity;

public class CopyEntity extends Entity {
	
	private int idCopy;
	private int idBook;
	
	public int getIdCopy() {
		return idCopy;
	}
	
	public int getIdBook() {
		return idBook;
	}


	public CopyEntity(int idCopy) {
		this.idCopy = idCopy;
	}

}
