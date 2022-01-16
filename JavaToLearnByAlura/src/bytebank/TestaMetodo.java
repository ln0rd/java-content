package bytebank;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaLeo = new Conta();
        Conta contaMidorya = new Conta();

        contaMidorya.deposita(1000);

        System.out.println(contaLeo.saldo);
        contaLeo.deposita(200.0);
        System.out.println(contaLeo.saldo);

        contaLeo.saca(50);
        System.out.println(contaLeo.saldo);

        System.out.println(contaLeo.saca(200));
        System.out.println(contaLeo.saldo);

        System.out.println("Antes de tranferir:" + contaLeo.saldo);
        System.out.println("Antes de tranferir:" + contaMidorya.saldo);

        contaMidorya.tranfere(300.0, contaLeo);

        System.out.println("Apos de tranferir:"+contaLeo.saldo);
        System.out.println("Apos de tranferir:"+contaMidorya.saldo);


    }

}