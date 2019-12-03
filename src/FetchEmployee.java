import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchEmployee {
public static void main(String[] args) {
	SessionFactory sessionFact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
	
	Session session = sessionFact.openSession();
	
		/*
		 * Query<Employee> q =session.createQuery("From Employee");
		 * 
		 * int i =q. if(i==1) { List<Employee > list=q.list();
		 * 
		 * list.forEach(emp ->{
		 * System.out.println(emp.getId()+" "+emp.getFirstName()+" "+emp.getLastName());
		 * });
		 * 
		 * }
		 */
	
	Employee emp = session.load(Employee.class,new Long(1));
	System.out.println(emp.getId()+" "+emp.getFirstName()+" "+emp.getLastName());
	
}
}
