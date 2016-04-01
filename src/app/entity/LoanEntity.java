package app.entity;

public class LoanEntity extends Entity {

	private int idLoan;
	private int idUser;
	private int idCopy;
	private String startDate;
	private String endDate;
	private boolean waiting;
	
	
	public LoanEntity(int idLoan, int idUser, int idCopy, String startDate, String endDate, boolean waiting) {
		super();
		this.idLoan = idLoan;
		this.idUser = idUser;
		this.idCopy = idCopy;
		this.startDate = startDate;
		this.endDate = endDate;
		this.waiting = waiting;	
	}
	
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

	@Override
	public String toString() {
		return "LoanEntity [idLoan=" + idLoan + ", idUser=" + idUser
				+ ", idCopy=" + idCopy + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", waiting=" + waiting + "]";
	}
	
	
}
