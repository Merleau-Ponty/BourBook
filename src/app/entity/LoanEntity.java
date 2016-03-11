package app.entity;

public class LoanEntity extends Entity {

	private int idLoan;
	private String startDate;
	private String endDate;
	private boolean waiting;
	
	public int getIdLoan() {
		return idLoan;
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
