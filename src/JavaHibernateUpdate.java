import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JavaHibernateUpdate {
public static void main(String[] args) {
	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
 
   Transaction tx = session.beginTransaction();
   
   //Employee emp = new Employee();
   
   //emp.setFirstName("Avneesh");
    
  Employee emp = session.get(Employee.class,new Long(1));
  emp.setLastName("sinha");
  
   session.save(emp);
   tx.commit();
   session.close();
  System.out.println("Updated susscessfully");

}
}
