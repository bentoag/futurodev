package week3_exerc1;

public class TesteAluno {

	public static void main(String[] args) {
		
		SuperAluno superAluno = new SuperAluno();
		SuperAluno superSubAluno = new SubAluno();
		SubAluno subAluno = new SubAluno();
		subAluno.exibir();
		superSubAluno.exibir();
		subAluno.exibir();

	}	

}
