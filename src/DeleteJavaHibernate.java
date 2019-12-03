//import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteJavaHibernate {
public static void main(String[] args) {
	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
    
	
	// deprecetated method.
//	Query<Employee> q = session.createQuery("Delete from Employee Where id= '0'");
	
	
	session.createQuery("Delete from Employee Where id=2").executeUpdate();
	
	//q.executeUpdate();
	
	tx.commit();
	session.close();
	System.out.println("Deleted Record Successfully");

}
}
