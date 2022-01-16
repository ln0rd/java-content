package Arrays;

public class TesteArrays {

    public static void main(String[] args) {

        int idades[] = new int[5]; // inicializa com 0
        // ou
        // int[] idades;

//        System.out.println(idades[0]);

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }



    }

}
