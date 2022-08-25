package week3_exerc2;

public class Banco {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		System.out.println(conta1.getNumero());
		conta1.setTitular(1, "Bento");
		System.out.println(conta1.getTitular());

		Conta conta2 = new Conta();
		System.out.println(conta2.getNumero());
		System.out.println(conta2.getTitular()); // null nao setei

		Conta conta3 = new Conta("Pedro");
		System.out.println(conta3.getNumero());
		System.out.println(conta3.getTitular());// pedro passado pro parametro

	}

}
