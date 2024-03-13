package Hibernate_demo.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTestClass {

public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction =manager.getTransaction();
	Student s =manager.find(Student.class, 1);
	if(s!=null) {
		s.setAddress("chennai");
		transaction.begin();
		manager.merge(s);
		transaction.commit();
	}
	else {
		System.out.println("ID not found");
	}
}	
}

