package bytebankPackage.br.com.bytebank.banco.teste;

import bytebankPackage.br.com.bytebank.banco.especial.ContaEspecial;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankPackage.br.com.bytebank.banco.modelo.ContaPoupanca;
import bytebankPackage.br.com.bytebank.banco.modelo.SaldoInsuficienteException;

/**
 * COMENTARIO DE DOCUMENTAÇÃO
 *
 * @author leonardo L B
 * @version 0.1
 * */

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		int a = 3;
		int b = a / 1;
		
		
//		ContaCorrente outra = null;
//		outra.deposita(200.0);

		ContaEspecial ce = new ContaEspecial(101, 999);
		ce.deposita(100.0);
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println("CE: " + ce.getSaldo());


	}

}
