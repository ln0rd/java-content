package bytebankPackage.br.com.bytebank.banco.modelo;

public class GuardadorContas {

    private Conta[] referencias;
    private int ultimo;

    public GuardadorContas() {
        this.referencias = new Conta[10];
        this.ultimo = 0;
    }

    public void adicionar(Conta ref) {
        this.referencias[ultimo] = ref;
        ultimo++;
    }

    public int mostrarNumero(int posicao) {
        System.out.println(referencias[posicao].getNumero());
        return referencias[posicao].getNumero();
    }

    public int getQuantidadeElementos(){
        System.out.println(ultimo);
        return ultimo;
    }

}
