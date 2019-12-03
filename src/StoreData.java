

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		// creating configuration object...
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		// creating session
		
		SessionFactory sessFact = cfg.buildSessionFactory();
		
		Session session =sessFact.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("mohneesh");
		emp.setLastName("parkhi");
		
		session.persist(emp);
		tx.commit();
		session.close();
		
		System.out.println("Successfully saved record");
		
	}
}
