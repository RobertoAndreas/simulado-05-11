package aplicacao;

import java.math.BigDecimal;
import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.BandaDao;
import dao.DaoFactory;
import dao.EspetaculoDao;
import dao.ParticipacaoDao;
import dominio.Banda;

public class Principal {
	public static void main(String[] args) throws ParseException{
		
		BandaDao bandaDao = DaoFactory.criarBandaDao();
		EspetaculoDao espetaculoDao = DaoFactory.criarEspetaculoDao();
		ParticipacaoDao participacaoDao = DaoFactory.criarParticipacaoDao();
		
		Banda banda1 = new Banda(null,"Beatles", new BigDecimal("12.00"));
		Banda banda2 = new Banda(null,"Rolling Stones", new BigDecimal("10.00"));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(banda1);
		em.persist(banda2);

		em.getTransaction().commit();

		System.out.println("Pronto!");
		
		em.close();
		emf.close();
		
	}
	

}

