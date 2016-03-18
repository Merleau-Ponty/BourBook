package app.entity;

public class LoanEntity extends Entity {

	private int idLoan;
	private int idUser;
	private int idCopy;
	private String startDate;
	private String endDate;
	private boolean waiting;
	
	public int getIdLoan() {
		return idLoan;
	}
	public int getIdUser() {
		return idUser;
	}
	public int getIdCopy() {
		return idCopy;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public boolean isWaiting() {
		return waiting;
	}
	
	
}
