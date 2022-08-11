package week2;

import java.time.LocalDate;

public class MainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		LocalDate dataNascDate;
		animal.altura = 1.28;
		animal.cor="Salmão";
		animal.peso = 50.79;
		
		System.out.println("O animal tem a altura de "+ animal.altura  + " ,é da cor " + animal.cor + " e pesa " + animal.peso + " quilos.");

		animal.andar();
		animal.comer();
		animal.dormir();
		animal.fazerBarulho();
		System.out.println();
		Cachorro cachorro = new Cachorro();
		
		cachorro.altura= 0.74;
		cachorro.cor="Caramelo";
		cachorro.peso=7.5;
		dataNascDate = LocalDate.of(2020, 8, 25);
		cachorro.dataNascimento = dataNascDate;
		System.out.println(cachorro.dataNascimento );
		cachorro.comer();
		System.out.println("O cachorro tem a altura de "+ cachorro.altura  + " ,é da cor " + cachorro.cor + " e pesa " + cachorro.peso + " quilos.");
	}

}
