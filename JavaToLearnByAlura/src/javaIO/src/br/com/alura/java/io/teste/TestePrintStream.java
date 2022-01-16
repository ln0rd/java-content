package javaIO.src.br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStream {

    public static void main(String[] args) throws IOException {

        // class to read a file and write in this one
//        PrintStream ps = new PrintStream("Text4.txt");

        // the same function but isent use a stream
        PrintWriter ps = new PrintWriter("Text4.txt");

        ps.println("this line was added by PrintStream Class");
        ps.println();
        ps.println("This line was added by PrintStream Class too");

        ps.close();


    }


}
