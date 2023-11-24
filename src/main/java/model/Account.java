package model;

import java.util.Date;

public class Account {
	private String id;
	private String accountNumber;
	private Date createdDate;
	private double balance;
    private Client client;

	public Account(double balance, Client client) {
		super();
		this.balance = balance;
		this.client = client;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

 
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", created_date=" + createdDate
				+ ", balance=" + balance + ", client=" + client.toString() + "]";
	}
}
