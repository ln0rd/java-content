package Arrays;

import bytebankPackage.br.com.bytebank.banco.modelo.Conta;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankPackage.br.com.bytebank.banco.modelo.GuardadorContas;

public class TesteGuardaConta {

    public static void main(String[] args) {

        GuardadorContas guardador = new GuardadorContas();

        ContaCorrente cc = new ContaCorrente(22,333);
        ContaCorrente cc2 = new ContaCorrente(55,123);

        guardador.adicionar(cc);

        guardador.mostrarNumero(0);

        guardador.adicionar(cc2);

        guardador.mostrarNumero(0);
        guardador.mostrarNumero(1);

        guardador.getQuantidadeElementos();

    }

}
