package Arrays;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[3];

        ContaCorrente cc1 = new ContaCorrente(200,12302);
        ContaCorrente cc2 = new ContaCorrente(301,98342);
        ContaCorrente cc3 = new ContaCorrente(220,13590);
        ContaPoupanca cp1 = new ContaPoupanca(200, 12030);

        contas[0] = cc1;
        contas[1] = cc2;
        contas[2] = cc3;
        // não pode conta poupanca o array é do tipo conta corrente
        // contas[1] = cp1;

        System.out.println(contas[1].getNumero());

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Numero da conta cadastrado: " + contas[i].getNumero());
        }

    }

}
