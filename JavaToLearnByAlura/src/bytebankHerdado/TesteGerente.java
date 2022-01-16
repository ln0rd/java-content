package bytebankHerdado;

public class TesteGerente {

    public static void main(String[] args) {

        Gerente leo = new Gerente();
        leo.setNome("Leonardo");
        leo.setSalario(3000.00);
        leo.setCpf("2345423454324");
        leo.setSenha(123);

        System.out.println(leo.autentica(123));
        System.out.println(leo.getBonificacao());
        System.out.println(leo.getNome());

    }

}