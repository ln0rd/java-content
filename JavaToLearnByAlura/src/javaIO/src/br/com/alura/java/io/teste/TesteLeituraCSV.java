package javaIO.src.br.com.alura.java.io.teste;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TesteLeituraCSV {

    public static void main(String[]args) throws Exception {


        Scanner scanner = new Scanner(new File("contas.csv"));

        // running every lines if has next line
        while (scanner.hasNext()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            String[] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
            System.out.println(valores[2]);


        }

        scanner.close();


    }

}
