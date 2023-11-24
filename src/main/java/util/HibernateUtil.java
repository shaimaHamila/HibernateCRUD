
package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// Create instance of configuration 
	private static Configuration conf = new Configuration().configure("hibernate.cfg.xml");
	private static Session session;

	public static Session currentSession() throws HibernateException {
// Open new session if there isn't
		if ((session == null) || !session.isOpen()) {
			SessionFactory sessionFactory = conf.buildSessionFactory();
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static void closeSession() {
		if (session != null && session.isOpen()) {
		}
		session.close();
	}
}