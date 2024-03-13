package Hibernate_demo.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTestClass {
public static void main(String[] args) {

	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	  EntityManager manager=factory.createEntityManager();
	  EntityTransaction transaction =manager.getTransaction();
	  Student st=new Student();
//	  st.setId(1);
//	  st.setName("Sathish");
//	  st.setAddress("banglore");
	  st.setId(2);
	  st.setName("Ajay");
	  st.setAddress("Chennai");
//	  st.setId(3);
//	  st.setName("Rohan");
//	  st.setAddress("banglore");
	  transaction.begin();
	  manager.persist(st);
	  transaction.commit();
}
}
