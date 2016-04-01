package app.entity;

public class AdminEntity extends Entity{
	
	private int idAdmin;
	private int idUser;
	
	public AdminEntity(int idAdmin, int idUser) {
		super();
		this.idAdmin = idAdmin;
		this.idUser = idUser;
	}

	public int getIdAdmin() {
		return idAdmin;
	}
	
	public int getIdUser() {
		return idUser;
	}

	public AdminEntity(int idAdmin){
		this.idAdmin = idAdmin;
	}
	
	@Override
	public String toString() {
		return "AdminEntity [idAdmin=" + idAdmin + ", idUser=" + idUser + "]";
	}
}
