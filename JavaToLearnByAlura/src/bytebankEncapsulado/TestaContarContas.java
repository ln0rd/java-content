package bytebankEncapsulado;

public  class TestaContarContas {

    public static void main(String[] args){

        Conta conta1 = new Conta(123,1234);
        Conta conta2 = new Conta(213,1235);
        Conta conta3 = new Conta(322,2236);
        Conta conta4 = new Conta(431,2244);

        System.out.println("Total de contas criadas " + Conta.quantidaContas());

    }

}