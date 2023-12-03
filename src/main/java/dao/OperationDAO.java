package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Operation;
import util.HibernateUtil;

public class OperationDAO {
	public OperationDAO(){
		
	}
	
	//Create operation
	public void createOperation(Operation newOperation) {
		Transaction transaction = null;
		Session session = HibernateUtil.currentSession();
		System.out.printf("%n Create new Operation stepp %n");
		try {
			transaction = session.beginTransaction();
			System.out.printf("%n beginTransaction %n");
			session.save(newOperation);
			transaction.commit();
			System.out.printf("%n Created new Operation %n");
		}catch(Exception err) {
			if(transaction != null) {
	          	  transaction.rollback();
	           }
			System.out.printf("%n Error %n", err);
		}finally {
            HibernateUtil.closeSession();
        }	
	}
	//Get all operations
	
	// Delete operation

}
