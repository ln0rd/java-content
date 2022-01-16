package Arrays;

import bytebankPackage.br.com.bytebank.banco.modelo.Conta;

public class GuardadorReferencias {

    private Object[] referencias;
    private int ultimo;

    public GuardadorReferencias() {
        this.referencias = new Object[10];
        this.ultimo = 0;
    }

    public void adicionar(Object ref) {
        if (ultimo >= referencias.length) {
            System.out.println("Numero de itens no array excedido");
            return;
        }
        this.referencias[ultimo] = ref;
        ultimo++;
    }

    public int mostrarNumero(int posicao) {
        Conta item = (Conta) referencias[posicao];
        System.out.println("Numero da conta: "+item.getNumero());
        return item.getNumero();
    }

    public int getQuantidadeElementos(){
        System.out.println(ultimo);
        return ultimo;
    }

}
