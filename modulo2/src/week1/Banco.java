package week1;

public class Banco {

	public static void main(String[] args) {
		
		boolean deuCerto; 
		
		
		System.out.println("--- Criei a Conta 1 ---");
		Conta conta1 = new Conta("1234", 270);		
		System.out.println(conta1.getSaldo()); //espero 270
		System.out.println("--- Depositei na Conta 1 1500 ---");
		conta1.depositar(conta1, 1500);
		System.out.println(conta1.getSaldo());//espero 1770
		
		System.out.println("--- Criei a Conta 2 ---");
		Conta conta2 = new Conta("0987");
		System.out.println(conta2.getSaldo());//espero zero
		conta2.depositar(conta2, 705.50);
		System.out.println(conta2.getSaldo());//espero 705.5
		
		System.out.println("\n--- Transferi 150 da conta 1 para conta 2 ---");
		deuCerto = conta1.transfereValor(conta1, conta2, 150);
		System.out.println("Conta 1: " + conta1.getSaldo()); //1770 - 150 = 1620
		System.out.println("Conta 2: " + conta2.getSaldo());//705 + 150 = 855
		System.out.println(deuCerto); //true
//		
		System.out.println("--- Criei a Conta 3 ---");
		Conta conta3 = new Conta("0001");
		System.out.println("--- Depositei na Conta 3 ---");
		conta3.depositar(conta3, 2655.50);
		System.out.println(conta3.getSaldo());
		
		
		System.out.println("--- Criei a Conta 4 ---");
		Conta conta4 = new Conta("1111", 5000.0);
		System.out.println(conta4.getSaldo());
		System.out.println("--- Depositei na Conta 4 ---");
		conta4.depositar(conta4, 150.00);
		System.out.println(conta4.getSaldo());		
		
		
		
		System.out.println("\n--- Transferi da conta 4 para conta 3 ---");
		deuCerto = conta4.transfereValor(conta4, conta3, 655.50);
		System.out.println("Conta 3: " + conta3.getSaldo());//2655.5 + 655.5 = 3311
		System.out.println("Conta 4: " + conta4.getSaldo());//5150 - 655.5 = 4494.5
		System.out.println(deuCerto);//true
		
		System.out.println("\n--- Transferi da conta 4 para conta 1 ---");
		deuCerto = conta4.transfereValor(conta4, conta1, 7000.0);
		System.out.println("Conta 4: " + conta4.getSaldo());
		System.out.println("Conta 1: " + conta1.getSaldo());
		System.out.println(deuCerto);//false
		
		System.out.println("\n--- Transferi da conta 2 para conta 4 ---");
		deuCerto = conta2.transfereValor(conta2, conta4, 955.50);
		System.out.println("Conta 2: " + conta2.getSaldo());
		System.out.println("Conta 4: " + conta4.getSaldo());
		System.out.println(deuCerto);//false
		
		System.out.println("\n--- Transferi da conta 2 para conta 4 ---");
		deuCerto = conta4.transfereValor(conta4, conta2, 955.50);
		System.out.println("Conta 2: " + conta2.getSaldo()); //1811
		System.out.println("Conta 4: " + conta4.getSaldo());//3539
		System.out.println(deuCerto);//true
	}

}
