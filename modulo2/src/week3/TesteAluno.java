package week3;

import java.time.LocalDate;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno bento = new Aluno();
		bento.setNome("Bento Gonzaga");
		System.out.println(bento.getNome());
		
		Aluno pedro = new Aluno("Pedro Alvares", LocalDate.now());
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getDataDeNascimento());
	}

}
