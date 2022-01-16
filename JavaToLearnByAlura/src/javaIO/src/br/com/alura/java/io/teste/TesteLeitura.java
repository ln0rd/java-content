package javaIO.src.br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

public static void main(String[]args) throws FileNotFoundException, IOException {

        // Read a file
        FileInputStream fis = new FileInputStream("Text.txt");

        // Read a captured file
        InputStreamReader isr = new InputStreamReader(fis);

        // Help to read every words
        BufferedReader br = new BufferedReader(isr);


        String linha = br.readLine();

//        linha = br.readLine();
//        System.out.println(linha);

        while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
        }

        br.close();


    }


}
