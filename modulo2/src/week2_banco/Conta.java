package week2_banco;

public class Conta {

	String numero;
	String titular;
	double saldo=0.0;

	double getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	boolean saque(Double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente.");
			return false;
		}
		System.out.println("Saque liberado de: " + valor);
		this.saldo -= valor;
		return true;
	}

	boolean deposito(Double valor) {
		if (valor <= 0) {
			return false;
		}
		this.saldo += valor;
		return true;
	}
}
