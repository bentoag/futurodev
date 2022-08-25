package aplicacao;

import entidades.Brinquedo;
import entidades.Garrafa;
import entidades.Plastico;

public class Programa {

	public static void main(String[] args) {

		Brinquedo toy = new Brinquedo();

		toy.setClassificacaoBrinquedo("Bonecos");
		toy.setFaixaEtaria("3 a 5 anos");
		toy.brincar();
		toy.descartar();
		System.out.println("Classificação: " + toy.getClassificacaoBrinquedo());
		System.out.println("Faixa Etaria: " + toy.getFaixaEtaria());

		System.out.println("####  GARRAFAS ####");
		Garrafa gpequena = new Garrafa();
		Garrafa gmedia = new Garrafa(1500, 1500, "media");

		gpequena.setML(600);

		gpequena.encher();
		System.out.println("Garrafa 600ml " + gpequena.getML());

		System.out.println("Garrafa 1,5L " + gmedia.getML());
		System.out.println("Densidade gmedia: " + gmedia.getDensidade());
		System.out.println("Colocar para gelar");
		gmedia.colocarAGelar();
		
		Plastico plasticoBolha = new Plastico("fina", 100);
		System.out.println("#### PLASTICO ####");
		System.out.println(plasticoBolha.getDensidade());
		System.out.println(plasticoBolha.getMetros());
	}

}
