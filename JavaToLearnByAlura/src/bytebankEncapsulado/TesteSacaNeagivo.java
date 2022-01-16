package bytebankEncapsulado;

public class TesteSacaNeagivo {
	public static void main(String[] args) {
		Conta conta = new Conta(123,123);
		conta.deposita(100);
		System.out.println(conta.saca(101));

		conta.saca(101);

		System.out.println(conta.getSaldo());

	}
}