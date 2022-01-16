package util;

import bytebankPackage.br.com.bytebank.banco.modelo.Cliente;
import bytebankPackage.br.com.bytebank.banco.modelo.Conta;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        // generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        // n funciona pois o tipo do arraylist e conta ele so guarda um tipo de objeto, ou
//        Cliente cliente = new Cliente();
//        lista.add(cliente);

        ContaCorrente cc = new ContaCorrente(22,333);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(55,123);
        lista.add(cc2);


        System.out.println(lista.size());
        System.out.println(lista.get(0));

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());

        for (int i = 0; i < lista.size(); i++) {
            Conta oRef = (Conta) lista.get(i);
            System.out.println(oRef.getNumero());
        }

        System.out.println("_____________");

        for (Object oRef : lista) {
            Conta oRefc = (Conta) oRef;
            System.out.println(oRefc.getNumero());
        }

    }


}
