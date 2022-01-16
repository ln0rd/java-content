package javaIO.src.br.com.alura.java.io.teste;

import java.io.*;

public class TesteFileWriter {

    public static void main(String[] args) throws IOException {

//
//        InputStream fis = System.in; //new FileInputStream("lorem.txt");
//        Reader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//        OutputStream fos = new FileOutputStream("Teste3.txt"); //new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("Text3.txt");

        fw.write("Esse é uma linha adicionada atraves do metodo Writer");
        fw.write("\n"); // quebra de linha
        fw.write(System.lineSeparator()); // quebra de linha
        fw.write("Nova linha feita atravez da classe FileWriter");

        fw.close();

    }

}
