package week4.exemplo1AssociacaoSimples;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco banco = new Banco("Banco FuturoDEV");
		Empregado empregado = new Empregado("Secretaria");
		
		System.out.println(empregado.getNome() + 
				" este empregado é do banco: " + banco.getNome());

	}

}
