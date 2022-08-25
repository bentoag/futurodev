package entidades;

public class Plastico {
	private String densidade;
	private int metros;
	
	
	public Plastico() { }
	
	public Plastico(String d, int m) {
		this.densidade = d;
		this.metros = m;
	}
	
	public String getDensidade() {
		return this.densidade;
	}

	public void setDensidade(String d) {
		this.densidade = d;
	}

	public int getMetros() {
		return this.metros;
	}

	public void setMetros(int m) {
		this.metros = m;
	}

	public void derreter() {
		System.out.println("Derretendo.");
	}
	
	public void preparar() {
		System.out.println("Preparando...");
	}
	
	

}
