package util;

import bytebankPackage.br.com.bytebank.banco.modelo.Conta;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;

public class TesteOrdenandoLista {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        ContaCorrente cc1 = new ContaCorrente(12,2);
        lista.add(cc1);
        ContaCorrente cc2 = new ContaCorrente(213,5);
        lista.add(cc2);
        ContaCorrente cc3 = new ContaCorrente(314,7);
        lista.add(cc3);
        ContaCorrente cc4 = new ContaCorrente(615,6);
        lista.add(cc4);
        ContaCorrente cc5 = new ContaCorrente(516,2);
        lista.add(cc5);
        ContaPoupanca cp1 = new ContaPoupanca(917,9);
        lista.add(cp1);
        ContaPoupanca cp2 = new ContaPoupanca(118,0);
        lista.add(cp2);
        ContaPoupanca cp3 = new ContaPoupanca(219,1);
        lista.add(cp3);
        ContaPoupanca cp4 = new ContaPoupanca(621,2);
        lista.add(cp4);


        for(int i = 0; i< lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        NumeroContaComparator comparator = new NumeroContaComparator();

        System.out.println("--------");

        lista.sort(comparator);

        for (Conta conta: lista) {
            System.out.println(conta);
        }

    }

    public static class NumeroContaComparator implements Comparator<Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {
            if (c1.getNumero() < c2.getNumero()){
                return -1;
            }
            if (c1.getNumero() > c2.getNumero()) {
                return 1;
            }
            return 0;
        }
    }

}
