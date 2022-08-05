package week1;

public class Pessoa {

	String retornaTexto(String texto) {

		String reverso = "";

		for (int i = (texto.length() - 1); i >= 0; i--) {
			reverso += texto.charAt(i);
		}
		return reverso;
	}
}
