package model;


import java.util.Set;


public class Client {
	   	private int id;
	    private String firstName;
	    private String secondName;
	    private String phoneNumber;
	    private Set<Account> accounts;
	    private Set<Operation> operations;
	
	    // Constructors
		public Client() {
			// Default constructor
		}
		
		public Client(String firstName, String secondName, String phoneNumber) {
			super();
			this.firstName = firstName;
			this.secondName = secondName;
			this.phoneNumber = phoneNumber;
		}
		public Client(int id, String firstName, String secondName, String phoneNumber) {
			super();
			this.firstName = firstName;
			this.secondName = secondName;
			this.phoneNumber = phoneNumber;
			this.id = id;
		}
		public Client(String firstName, String secondName, String phoneNumber, Set<Account> accounts, Set<Operation> operations) {
			super();
			this.firstName = firstName;
			this.secondName = secondName;
			this.phoneNumber = phoneNumber;
			this.accounts = accounts;
			this.operations = operations;
		}
		
		// Getters and setters
	    public Set<Account> getAccounts() {
				return accounts;
		}   
		public void setAccounts(Set<Account> accounts) {
			this.accounts = accounts;
		}
		
		public Set<Operation> getOperations() {
			return operations;
		}

		public void setOperations(Set<Operation> operations) {
			this.operations = operations;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getSecondName() {
			return secondName;
		}
		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public String toString() {
			return "Client [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", phoneNumber="
					+ phoneNumber + ", accounts = " + accounts + ", operation = " + operations + "]";
		}


}
