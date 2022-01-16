package br.com.financas.testes;

import br.com.financas.modelo.Conta;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setBanco("bradesco");
        conta.setAgencia("360");
        conta.setNumero("92102");
        conta.setTitular("leo");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
