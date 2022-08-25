package week3_exerc2;

public class Conta {
	private static int proxNumero = 1;
	private int numero;
	String titular;
	double saldo = 0.0;

	public Conta() {
		this.numero = proxNumero++;
		// System.out.println("Conta Criada, cadastre o titular!");
	}

	public Conta(String titular) {
		this.numero = proxNumero++;
		this.titular = titular;
		// System.out.println("Conta Criada!");
	}

	// getters nº da conta e saldo
	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	// set
	public void setTitular(int numeroConta, String titular) {
		if (this.numero == numeroConta) {
			this.titular = titular;
		} else {
			System.out.println("Conta não encontrada!");
		}
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
