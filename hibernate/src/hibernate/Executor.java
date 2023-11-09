package hibernate;

import javax.persistence.EntityManagerFcatory;

import javax.persistence.Persistence;



public class Executor {
	
	public static void main(String[] args) {
		EntityManagerFactory factory;
		factory=Persistence.createEntityManagerFactory("PU");
		EntityManager em=factory.createEntityManager();
		book b2=new book();
		b2.setBookId(110);
		b2.setTitle("Aptitude");
		b2.setAuthor("RS Agrawal");
		b2.setPrice(980);
		em.getTransaction().begin();
		em.persist(b2);
		em.getTransaction().commit();	

	}


}
