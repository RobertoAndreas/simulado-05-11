package aplicacao;

import java.math.BigDecimal;
import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Banda;

public class Principal {
	public static void main(String[] args) throws ParseException{
		
		Banda banda1 = new Banda(null,"Beatles", new BigDecimal("12.00"));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(banda1);
		//em.persist(c2);
		

		em.getTransaction().commit();

		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}
	

}
