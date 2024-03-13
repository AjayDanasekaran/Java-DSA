package Hibernate_demo.com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class AddressUpdateClass {
	public static void main(String[] args) {
		  EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		  EntityManager manager=factory.createEntityManager();
		  EntityTransaction transaction =manager.getTransaction();
		  Query q = manager.createQuery("select s from Student s where address = ");
			List<Student> students= q.getResultList();
			for(Student s:students) {
				System.out.println(s.getId()+s.getAddress()+s.getName());
			}
	}
}
