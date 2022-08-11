package week2_exerc2;

public abstract class Cartao {
	private String bandeira;
	private double saldo, valorTaxa;
	
	
	//Bandeira
	public String getBandeira() {
		return this.bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	//Saldo
	public double getSaldo() {
		double saldoDescontadoTaxa, taxa;
		taxa = verificarValorTaxaCartao();
		saldoDescontadoTaxa = this.saldo - taxa;
		return saldoDescontadoTaxa;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Taxas
	public double getValorTaxa() {
		return this.valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	
	public double verificarValorTaxaCartao() {
		double desconto = ((this.valorTaxa/100.0)*this.saldo);
		return desconto;
	}

}
