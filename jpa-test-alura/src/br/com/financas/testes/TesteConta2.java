package br.com.financas.testes;

import br.com.financas.modelo.Conta;
import br.com.financas.util.*;
import br.com.financas.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteConta2 {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setId(1);
        conta.setTitular("Danilo");
        conta.setBanco("Banco do Brasil");
        conta.setAgencia("123");
        conta.setNumero("456");

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

//        em.persist(conta);
//        conta.setBanco("Bradesco");

        conta = em.find(Conta.class, conta.getId());
        em.remove(conta);

        em.getTransaction().commit();
        em.close();

        EntityManager em2 = new JPAUtil().getEntityManager();
        em2.getTransaction().begin();

        conta.setTitular("Leonardo");
        em2.merge(conta);

        em2.getTransaction().commit();
        em2.close();
    }
}
