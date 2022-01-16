package variablesAndFlows;

public class Encadeados {

    public static void main(String[] args) {

        for( int i = 0; i <= 10; i++ ) {
            for (int a = 0; a <= 10; a++) {
                System.out.print(" " + i * a);
            }
            System.out.println(" ");
        }

    }
}