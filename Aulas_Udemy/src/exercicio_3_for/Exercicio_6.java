package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para ver os seus divisores: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println("O número " + numero + " é divisivel por " + i);
			}
		}
		
		sc.close();
	}
}
