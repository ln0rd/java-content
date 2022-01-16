package Arrays;

import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteGuardaReferencia {

    public static void main(String[] args) {


        GuardadorReferencias guardador = new GuardadorReferencias();

        Object cc = new ContaCorrente(22,333);
        Object cc2 = new ContaCorrente(55,123);

        guardador.adicionar(cc);

        guardador.mostrarNumero(0);

        guardador.adicionar(cc2);

        guardador.mostrarNumero(0);
        guardador.mostrarNumero(1);

        guardador.getQuantidadeElementos();


    }

}
