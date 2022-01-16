package variablesAndFlows;

public class Condicao {
    public static void main(String[] args) {
        int idade = 20;
        int quantidade = 2;

        if (idade > 18 || quantidade >= 2) {
            System.out.println("Maior que 18 ou esta acompanhado");
        } else if(idade == 20 && quantidade == 2) {
            System.out.println("Tem vinte e esta acompanhado");
        } else {
            System.out.println("Menor que 18");
        }

        // Usando boolean
        boolean acompanhado = true;

        if (acompanhado == true) {
            System.out.println("Esta acompanhado");
        }




    }

}