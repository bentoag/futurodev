package week3_exerc4;

import week3_exerc2.Conta;

public class Banco {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		System.out.println(conta1.getNumero());
		conta1.setTitular(1, "Bento");
		System.out.println(conta1.getTitular());

		Conta conta2 = new Conta();
		System.out.println(conta2.getNumero());
		conta2.setTitular(2, "Maria");
		System.out.println(conta2.getTitular()); 

		Conta conta3 = new Conta("Pedro");
		System.out.println(conta3.getNumero());
		System.out.println(conta3.getTitular());// pedro passado pro parametro


	}

}
