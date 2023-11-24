package model;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	
	public CurrentAccount(double balance, Client client, double overdraftLimit) {
		super(balance, client);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraftLimit=" + overdraftLimit + "]";
	}


}
