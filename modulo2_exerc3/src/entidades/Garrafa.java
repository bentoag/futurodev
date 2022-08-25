package entidades;

public class Garrafa extends Plastico{

	private int tamanho, ml; 
	
	public Garrafa () { }
	
	public Garrafa(int t, int ml) {
		this.tamanho = t;
		this.ml = ml;
	}
	
	public Garrafa(int t, int ml, String densidade) {
		this.tamanho = t;
		this.ml = ml;
		super.setDensidade(densidade);
	}
	
	public int getML() {
		return this.ml;
	}

	public void setML(int ml) {
		this.ml = ml;
	}

	public void encher() {
		System.out.println("Enchendo...");		
	}
	
	public void colocarAGelar() {
		System.out.println("Gelando...");
	}
}
