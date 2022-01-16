package errorHandling2;

public class TestaComExecaoChecked {

    public static void main(String[] args){

        Conta c = new Conta();

        try {
            c.deposita();
        } catch ( MinhaExecao ex) {
            System.out.println("Tratamento de erro");
        }

    }

}