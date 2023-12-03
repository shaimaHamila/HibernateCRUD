package model;

public class Operation {
	private int id;
	private String designation;
	private double amount;
	private Client client;
	
	// Constructors
	public Operation(String designation, double amount, Client client) {
		super();
		this.designation = designation;
		this.amount = amount;
		this.client = client;
	}
	//Getters and setters
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Operation [id=" + id + ", designation=" + designation + ", amount="
				+ amount + ", client=" + client.toString() + "]";
	}

	
}
