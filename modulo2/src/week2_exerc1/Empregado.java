package week2_exerc1;

public class Empregado {

	private int id;
	private String nome;
	
	//ID
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//Nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando...");
	}
	
	public void irEmbora() {
		System.out.println("Saindo! Indo embora.");
	}
	
	public void tirarFolga() {
		System.out.println("Estou de folga!");
	}
}
