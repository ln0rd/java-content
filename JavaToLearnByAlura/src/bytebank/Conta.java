package bytebank;

public class Conta {

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected String titular;
    protected String cpf;
    protected String profissao;

    protected void deposita(double valor) {
        this.saldo += valor;
    }

    protected boolean saca(double valor) {
        if (valor > this.saldo){
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    protected boolean tranfere(double valor, Conta conta) {
        if (saca(valor)) {
            conta.deposita(valor);
            return true;
        }
        return false;


    }

}
