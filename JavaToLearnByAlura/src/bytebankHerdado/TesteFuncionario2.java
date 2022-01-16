package bytebankHerdado;

public class TesteFuncionario2 {

    public static void main(String[] args) {

        Funcionario2 leo = new Funcionario2();

        leo.setSalario(3000.00);
        System.out.println(leo.getTipo());
        System.out.println(leo.getBonificacao());


        Funcionario2 leo2 = new Funcionario2();

        leo2.setSalario(5000.00);
        leo2.setTipo(1);
        System.out.println(leo2.getTipo());
        System.out.println(leo2.getBonificacao());
    }

}