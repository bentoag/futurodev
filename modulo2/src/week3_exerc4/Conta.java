package week3_exerc4;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Conta {

	private static int proxNumero = 1;
	
	@Getter @Setter
	String titular;
	
	@Getter
	double saldo = 0.0;
	@Getter
	private int numero;

	public Conta() {
		this.numero = proxNumero++;
		// System.out.println("Conta Criada, cadastre o titular!");
	}

	public Conta(String titular) {
		this.numero = proxNumero++;
		this.titular = titular;
		// System.out.println("Conta Criada!");
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
