package week3;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor  //cria construtor com todos os argumentos
@NoArgsConstructor //cria o construtor padrao
public class Aluno {
	@Getter @Setter  //cria os getrs e setters
	private String nome;
	@Getter
	private LocalDate dataDeNascimento;
	
	
}
