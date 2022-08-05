package week1;

public class PessoaMain {
	static String invertido;
	public static void main(String[] args) {
		Pessoa francisco = new Pessoa();
		Pessoa bento = new Pessoa();
		
		
		
		System.out.println("--- Francisco ---");
		invertido = francisco.retornaTexto("Francisco");
		System.out.println(invertido);
		System.out.println("--- Bento ---");
		invertido = bento.retornaTexto("Bento");
		System.out.println(invertido);
		
		
	}

	
}

