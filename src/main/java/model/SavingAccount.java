package model;

public class SavingAccount extends Account {
	private double interestRate;
	
	public SavingAccount(double balance, Client client, double interestRate) {
		super(balance, client);
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		return "CurrentAccount [interestRate=" + interestRate + "]";
	}


}
