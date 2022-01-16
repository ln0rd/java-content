package javaIO.src.br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

public static void main(String[]args) throws FileNotFoundException, IOException {

        // Read a file
        OutputStream fos = new FileOutputStream("Text2.txt");

        // Read a captured file
        Writer osw = new OutputStreamWriter(fos);

        // Help to read every words
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("new text added inside this file");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("other new text added inside this file");

        bw.close();


    }


}
