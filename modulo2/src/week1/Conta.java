package week1;

public class Conta {

	String numeroConta;
	private double saldo;

	Conta(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	Conta(String numeroConta) {
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}

	// retornar o saldo
	public double getSaldo() {
		return this.saldo;
	}
	public double saldo(Conta nConta) {
		return nConta.saldo;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	// metodos para alterar o saldo, sacar e um depositar
	void depositar(Conta nConta, double valor) {
		if (valor> 0) {
			this.saldo += (valor > 0) ? valor : 0;
		} else {
			System.out.println("Conta inválida.");
		}
	}

	void sacar(Conta nConta, double valor) {
		if (valor>0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
			} else {
				System.out.println("Saldo insuficiente: ");
			}
		} else {
			System.out.println("Conta inválida.");
		}
	}
	
	boolean transfereValor(Conta contaDeOrigem, Conta contaDestino, double valor) {
		
		if ((valor > 0 && (contaDeOrigem.saldo(contaDeOrigem) >= valor))) {			
			sacar(contaDeOrigem, valor);
			contaDestino.depositar(contaDestino, valor);
			return true;
		}else {			
			return false;	
		}
	
	}
	
	
//	boolean transfereValor(String contaDeOrigem, Conta contaDestino, double valor) {
//			
//						
//		if(valor > 0 && (getSaldo()>= valor)) {
//			if(numeroConta.equals(contaDeOrigem)) {			
//					this.sacar(contaDeOrigem, valor);
//					contaDestino.depositar(contaDestino.numeroConta, valor);
//					return true;				
//			}
//			return false;
//			}
//		return false;			
//		}
	

	

	public boolean equals(Conta outraConta) {
		
		if(!this.numeroConta.equals(outraConta.getNumeroConta())) {
			return false;
		}
		return true;
	}

}
