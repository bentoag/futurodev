package week2_banco;

public class ContaPJ extends Conta {
	Double limiteEmprestimo = 1000.0;

	boolean saque(Double valor) {
		if(valor<=0) {
			return false;
		}
		if(valor < (this.saldo + limiteEmprestimo)){
			this.saldo -= valor;
			limiteEmprestimo+=this.saldo;
			this.saldo = 0.0;					
		}
		return true;	
	}

	boolean emprestimo(Double valor) {

		if (valor <= 0 || (valor > limiteEmprestimo)) {
			return false;
		}

		this.saldo += valor;
		this.limiteEmprestimo -= valor;
		return true;

	}

}
