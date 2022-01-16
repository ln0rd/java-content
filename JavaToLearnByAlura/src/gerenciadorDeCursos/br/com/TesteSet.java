package gerenciadorDeCursos.br.com;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

    public static void main(String[] args) {


        Set<String> alunos = new HashSet<>();
        alunos.add("Aluno1");
        alunos.add("Aluno2");
        alunos.add("Aluno3");

        System.out.println(alunos);

        // para percorrer o conteudo de um set
        // garante que so tem um unico elemento igual do tipo string

        for (String aluno : alunos) {
            System.out.println(aluno);
        }


    }

}
