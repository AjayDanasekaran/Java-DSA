package Hibernate_demo.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchTestClass {
 public static void main(String[] args) {
	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	 EntityManager manager = factory.createEntityManager();
	 manager.find(Student.class,2);
     Student s=manager.find(Student.class,2);
     System.out.println(s.getId()+ " " + s.getName()+" " +s.getAddress());
     
 }
}
