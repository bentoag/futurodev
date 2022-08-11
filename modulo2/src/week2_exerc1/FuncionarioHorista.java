package week2_exerc1;

public class FuncionarioHorista extends Empregado{
	private String cnpj;
	private double taxa;
	
	//CNPJ
	public String getCNPJ() {
		return this.cnpj;
	}
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	//taxa
	public double getTaxa() {
		return this.taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularTaxas() {
		return this.taxa;
	}
	
	public String emitirNota() {
		
		return "Funcionário Horista: "  + getNome() + "\n" + "CNPJ: " +getCNPJ() + "\n" + "Total de taxas: " + getTaxa();
	}

}
