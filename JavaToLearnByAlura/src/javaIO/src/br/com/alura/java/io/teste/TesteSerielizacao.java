package javaIO.src.br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerielizacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "leonardo";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String catchnome = (String) ois.readObject();
        ois.close();
        System.out.println(catchnome);


    }

}
