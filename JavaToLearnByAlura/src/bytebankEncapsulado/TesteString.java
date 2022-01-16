package bytebankEncapsulado;

public class TesteString {

    public static void main(String[] args) {

        int a = 3; // esta atribuicao é um primitivo

        String nome = "leo"; // esta atribuicao é um literal

        String nome2 = new String("leo");  // pessima pratica

        nome.replace("l", "L"); // imutabilidade o nome n sera alterado

        nome = nome.replace("l", "L");

        nome.toLowerCase(); // letra minuscula
        nome.toUpperCase(); //  letra maiuscula

        String frase = "  Frase de TesteArrayList";
        String frase2 = frase.trim(); // remove espaco no inicio e final

        String emptyFrase = " ";
        String emptyfrase2 = emptyFrase.trim();


        System.out.println(nome.charAt(2)); // pega a letra na posição

        System.out.println("contem o conjunto de letras [este]: " + frase.contains("este"));
        System.out.println("contem o conjunto de letras [leo]: " + frase.contains("leo"));
        System.out.println("é vazio? " + emptyfrase2.isEmpty());
        System.out.println("remover espacos iniciais e finais:" + frase2); // remove espacos

        System.out.println(nome);

    }

}
