package bytebank;

public class CriarConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.saldo = 200;

        System.out.println(conta.saldo);

        conta.saldo += 100;
        System.out.println(conta.saldo);

        Conta contaDois = new Conta();
        contaDois.saldo = 50;

        System.out.println("Saldo conta dois: " + contaDois.saldo);

    }

}