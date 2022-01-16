package bytebankPackage.br.com.bytebank.banco.especial;

import bytebankPackage.br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double value) {
        super.saldo += value + 2;
    }

}
