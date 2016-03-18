package app.entity;

public class AdminEntity extends Entity{
	
	private int idAdmin;
	private int idUser;
	
	public int getIdAdmin() {
		return idAdmin;
	}
	
	public int getIdUser() {
		return idUser;
	}

	public AdminEntity(int idAdmin){
		this.idAdmin = idAdmin;
	}
	
}
