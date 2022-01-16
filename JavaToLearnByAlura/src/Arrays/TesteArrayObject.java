package Arrays;

import bytebankHerdado.Funcionario;
import bytebankPackage.br.com.bytebank.banco.modelo.Cliente;
import bytebankPackage.br.com.bytebank.banco.modelo.Conta;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayObject {

    public static void main(String[] args){

        // aceita so contas como tipo conta, corrente e poupanca
        Conta[] contas = new Conta[3];
        // aceita todos os tipo de objeto(classe)
        Object[] objetos = new Object[1];

        ContaCorrente cc1 = new ContaCorrente(200, 2202);
        ContaCorrente cc2 = new ContaCorrente(100, 4301);
        ContaPoupanca cp1 = new ContaPoupanca(020, 01020);

        contas[0] = cc1;
        contas[1] = cc2;
        contas[2] = cp1;

        Conta ref = contas[1];
        ContaCorrente refTypeCast = (ContaCorrente) contas[1];

        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
        System.out.println(contas[1].getNumero());
        System.out.println(refTypeCast.getNumero());

        Cliente cl1 = new Cliente();

        objetos[0] = cc1;
        objetos[1] = cp1;
        objetos[2] = cl1;


    }

}
