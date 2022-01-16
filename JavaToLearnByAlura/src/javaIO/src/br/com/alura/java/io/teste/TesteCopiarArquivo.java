package javaIO.src.br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        // fluxo de entrada de um arquivo
        InputStream fis = System.in; //new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // fluxo de saida de um arquivo
        OutputStream fos = new FileOutputStream("Teste3.txt"); //new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }

}
