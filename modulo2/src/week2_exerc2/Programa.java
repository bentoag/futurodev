package week2_exerc2;

public class Programa {
	public static void main(String[] args) {
		ValeAlimentacao va = new ValeAlimentacao();
		va.setBandeira("Sodexo");
		va.setSaldo(100.0);
		va.setValorTaxa(2.0);
		System.out.println("---- VALE ALIMENTA��O ----");
		System.out.println("Bandeira: " + va.getBandeira());
		System.out.printf("Saldo descontado: %.2f", va.getSaldo());
		System.out.printf("\nTaxa do cart�o %.2f", va.getValorTaxa());
		
		ValeRefeicao vr = new ValeRefeicao();
		vr.setBandeira("MataFome");
		vr.setSaldo(510.0);
		vr.setValorTaxa(5.5);
		System.out.println("\n---- VALE REFEI��O ----");
		System.out.println("Bandeira: " + vr.getBandeira());
		System.out.printf("Saldo descontado: %.2f", vr.getSaldo());
		System.out.printf("\nTaxa do cart�o %.2f", vr.getValorTaxa());
		
		ValeTransporte vt = new ValeTransporte();
		vt.setBandeira("Consorcio F�nix");
		vt.setSaldo(275.0);
		vt.setValorTaxa(1.5);
		System.out.println("\n---- VALE TRANSPORTE ----");
		System.out.println("Bandeira: " + vt.getBandeira());
		System.out.printf("Saldo descontado: %.2f", vt.getSaldo());
		System.out.printf("\nTaxa do cart�o %.2f", vt.getValorTaxa());
		
		
	}
}
