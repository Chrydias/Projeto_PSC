package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Projeto_PSC");
		EntityManager em = emf.createEntityManager();
		/*Endereco endereco = new Endereco();
		endereco.setCep("123456");
		//em.persist(endereco);
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Carlos");
		funcionario.setEndereco(endereco);
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();*/
	}

}
