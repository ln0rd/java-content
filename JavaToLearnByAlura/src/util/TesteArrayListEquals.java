package util;

import bytebankPackage.br.com.bytebank.banco.modelo.Conta;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 345);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(55,902);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 345);
        lista.add(cc3);

        System.out.println(lista.contains(cc2));

        cc.ehIgual(cc2);
        cc.ehIgual(cc3);

        System.out.println("-------------");

        cc.equals(cc2);
        cc.equals(cc3);


    }

}
