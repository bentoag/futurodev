package week1;

public class Pessoa {
	
	//com recursividade
	String retornaTexto(String texto) {

		String reverso = "", stringTemp = "";
		int tamanhoString = texto.length()-1;
		
			while (tamanhoString > 0) {
				reverso+=texto.charAt(tamanhoString); // ultimo caracter
				tamanhoString--;
				stringTemp = texto.substring(0, tamanhoString);
				retornaTexto(stringTemp);
			}
			
			if(tamanhoString==0) {
				reverso += texto.charAt(0);
			}
			return reverso;
	}
}
	
	
//metodo tradicional utilizar um for para percorrer a string e concatenar em outra variavel
//		for (int i = (texto.length() - 1); i >= 0; i--) {
//			reverso += texto.charAt(i);
//		}
	

