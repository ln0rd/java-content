package br.com.financas.testes;

import br.com.financas.modelo.Conta;
import br.com.financas.util.*;

import javax.persistence.EntityManager;

/**
 * Created by leonardocordeiro on 24/02/17.
 */
public class TesteBuscaConta {

    public static void main(String[] args) {

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class, 1);

        em.getTransaction().commit();
        em.close();
    }

}
