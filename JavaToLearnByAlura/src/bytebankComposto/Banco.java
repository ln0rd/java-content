package bytebankComposto;

public class Banco {

    public static void main(String[] args) {

        Cliente bakugou = new Cliente();
        bakugou.nome = "Katsuki Bakugou";
        bakugou.cpf = "12345678912";
        bakugou.profissao = "heroi";

        Conta contaBakugou = new Conta();
        contaBakugou.deposita(100);

        contaBakugou.titular = bakugou;

        System.out.println(contaBakugou.titular.profissao);


    }

}