import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	int tipo;
	Scanner input = new Scanner(System.in);
	
	do {
		System.out.println("Selecione seu combo");
		System.out.println("1. Combo Master");
		System.out.println("2. Super Combo");
		System.out.print("Sua escolha: ");
		tipo = input.nextInt();
		
		if(tipo != 1 && tipo != 2) {
			System.out.println("\nopção Invalida!\n");
		}
		
	}while(tipo != 1 && tipo != 2);
		
		Combo combo = new Combo();
		combo.criarCombo(tipo);
		System.out.println(combo);
		System.out.println("\n Bom apetite!!");
				
	}
}