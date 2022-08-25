package entidades;

public class Brinquedo extends Plastico{
	private String classificacaoBrinquedo, faixaEtaria;
	
	public Brinquedo() { }
	
	public Brinquedo (String classificacao, String fxetaria) {
		this.classificacaoBrinquedo = classificacao;
		this.faixaEtaria = fxetaria;
	}
	
	public String getClassificacaoBrinquedo() {
		return this.classificacaoBrinquedo;
	}

	public void setClassificacaoBrinquedo(String classificacao) {
		this.classificacaoBrinquedo = classificacao;
	}

	public String getFaixaEtaria() {
		return this.faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	
	public void brincar() {
		System.out.println("Brincando...");
	}
	
	public void descartar() {
		System.out.println("Descartando...");
	}
}
