package entities;

public class Holder {

	private int accNumber;
	private String accName;
	private double value;
	
	public Holder(int accNumber, String accName) {
		this.accNumber = accNumber;
		this.accName = accName;
	}

	public Holder(int accNumber, String accName, double initialValue) {
		this.accNumber = accNumber;
		this.accName = accName;
		deposit(initialValue);
	}
			
	public int getAccNumber() {
		return accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getValue() {
		return value;
	}

	public void deposit(double value) {
		this.value += value;
	}

	public void withdraw(double value) {
		this.value -= value + 5;
	}
	
	public String toString() {
		return "Account: "
				+ accNumber 
				+ ", Holder: " 
				+ accName 
				+ ", Balance: $ " 
				+ String.format("%.2f", value);
	}
}
