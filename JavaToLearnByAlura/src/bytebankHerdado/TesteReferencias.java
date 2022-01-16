package bytebankHerdado;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente leo = new Gerente();

        leo.setNome("Leonardo");
        leo.setSalario(3000.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(leo);

        System.out.println(controle.getSoma());

//        Funcionario ichigo = new Funcionario();
//        ichigo.setSalario(3000.00);
//        controle.registra(ichigo);

        System.out.println(controle.getSoma());


    }

}