package Exerciocios_1_Modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, numero_pecas1, numero_pecas2;
		double valor_unitario1, valor_unitario2, total;

		
		codigo1 = sc.nextInt();
		numero_pecas1 = sc.nextInt();
		valor_unitario1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		numero_pecas2 = sc.nextInt();
		valor_unitario2 = sc.nextDouble();
		
		total = numero_pecas1 * valor_unitario1 + numero_pecas2 * valor_unitario2;

		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		
	}
}
