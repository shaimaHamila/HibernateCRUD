package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Client;
import util.HibernateUtil;

public class ClientDAO {
	
	//Constructor
	public ClientDAO() {
	}
	
	// Add client
	public void addClient(Client newClient) {
	    Transaction transaction = null;
        Session session = HibernateUtil.currentSession();

        try {
            transaction = session.beginTransaction();
            session.save(newClient); 
            transaction.commit();
        } catch (Exception err) {
        	if(transaction != null) {
          	  transaction.rollback();
            }
            System.out.printf("Error", err);
            err.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }	
	}
	
	//Get all clients
    @SuppressWarnings("unchecked")
	public List<Client> getAllClients() {
    	Transaction transaction = null;
    	List<Client> clients = null;
    	Session session = HibernateUtil.currentSession();
    	try {
            transaction = session.beginTransaction();	     
            clients = session.createQuery("FROM Client").list();
            transaction.commit();
            
    	}catch(Exception err) {
    		if(transaction != null) {
          	  transaction.rollback();
            }
            System.out.printf("Error", err);
    	}finally {
            HibernateUtil.closeSession();
        }
        
    	return clients;
    }
    
    // Get client by id
    public Client getClientById(int id) {
    	Transaction transaction = null;
    	Client client = null;
    	Session session = HibernateUtil.currentSession();
    	try {
    		transaction = session.beginTransaction();
    		client = (Client) session.get(Client.class, id);
    		transaction.commit();
    	}catch(Exception err) {
    		if(transaction != null) {
          	  transaction.rollback();
            }
            System.out.printf("Error", err);
    	}finally {
            HibernateUtil.closeSession();
        }
    	return client;
    }
    
    //Update Client
    public void updateClient (Client updatedClient) {
    	Transaction transaction = null;
    	Session session = HibernateUtil.currentSession();
    	try {
    		transaction = session.beginTransaction();
    		// Retrieve the existing client from the database
    		Client existingClient = (Client) session.get(Client.class, updatedClient.getId());
    		// Check if the client exists
    		if(existingClient != null) {
    			System.out.println("Client is found for update.");
    			existingClient.setFirstName(updatedClient.getFirstName());
    			existingClient.setSecondName(updatedClient.getSecondName());
    			existingClient.setPhoneNumber(updatedClient.getPhoneNumber());
    			session.update(existingClient);
    			transaction.commit();
    			System.out.println("Client updated.");
    		}else {
                System.out.println("Client not found for update.");
            }
    	}catch(Exception err) {
    		if(transaction != null) {
            	  transaction.rollback();
              }
    		System.out.printf("Error", err);
    	}finally {
            HibernateUtil.closeSession();
        }
    	
    }
    
    // Delete client
    public void deleteClient(int id) {
        Transaction transaction = null;
        Session session = HibernateUtil.currentSession();
        
        try {
            transaction = session.beginTransaction();
            Client clientToDelete = (Client) session.get(Client.class, id);
            if (clientToDelete != null) {
                session.delete(clientToDelete);
                transaction.commit();
                System.out.println("Client with code " + id + " deleted succesfully.");
            } else {
                // Client with the specified code does not exist
                System.out.println("Client with code " + id + " does not exist.");
            }
        } catch (Exception err) {
          
              if(transaction != null) {
            	  transaction.rollback();
              }
              System.out.printf("Error", err);
          
        } finally {
            HibernateUtil.closeSession();
        }
    }
}
