package week2_exerc1;

public class Secretaria extends SalarioEmpregado{
	
	private int qtdAnosEmpresa;

	//Tempo de empresa
	
	public String getQtdAnosEmpresa() {
		return getNome() + ", você tem " + qtdAnosEmpresa + " anos de empresa";
	}

	public void setQtdAnosEmpresa(int qtdAnosEmpresa) {
		this.qtdAnosEmpresa = qtdAnosEmpresa;
	}
	
	public void atenderCliente() {
		System.out.println("Atendendo cliente! Aguarde...");
	}
	
	public void realizarLigacao() {
		System.out.println("Em ligação, aguarde...");
	}
}
