package test;

import java.util.List;


import dao.ClientDAO;
import dao.OperationDAO;
import model.Client;
import model.Operation;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client newClient = new Client("Shai545maa", "Das5jks", "0999999999457");
		Client newClient2 = new Client("SHihkjTA", "Hamihjkla", "2000000000516583");
		Client newClient3 = new Client("Papa", "dfgdfgdfgdfgdfe", "9456546864585685");
		Client newClient4 = new Client("Haya", "dfdfdgdv4e", "0000033685685");
	 
	    ClientDAO clientDAO = new ClientDAO();

	    clientDAO.addClient(newClient);
		clientDAO.addClient(newClient2);
		clientDAO.addClient(newClient3);
		clientDAO.addClient(newClient4);
	    System.out.print(newClient.toString());
	    // Fetch all clients
	    List<Client> clients = clientDAO.getAllClients();
		for(int i = 0 ; i < clients.size() ; i++){
			Client client = clients.get(i);
			System.out.printf("%n Client V1 %d: %s", i + 1, client.toString());
		};
		
		// Get client by id
		Client targetClient = clientDAO.getClientById(1);
		System.out.printf("%n Target Client:  %s", targetClient.toString());
		
		//Update Client
		Client updatedClient = new Client(3, "Fatma", "Baye", "27558669");
		clientDAO.updateClient(updatedClient);
		
		//Delete Client
//		clientDAO.deleteClient(3);
		
	    // Fetch all clients
		List<Client> clients2 = clientDAO.getAllClients();
		for(int i = 0 ; i < clients2.size() ; i++){
			Client client = clients2.get(i);
			System.out.printf("%n Client V2 %d: %s", i + 1, client.toString());
		};
		
		
		// Create operation
		Operation newOperation = new Operation("Withdrawal", 1000);
		OperationDAO operationDAO = new OperationDAO();
		newOperation.setClient(newClient);
		operationDAO.createOperation(newOperation);
		System.out.printf("%n newOperation : %s", newOperation.toString());

	}

}
