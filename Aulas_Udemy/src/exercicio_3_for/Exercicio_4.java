package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas vezes deseja realizar a conta: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i < numero + 1; i++) {
			System.out.println("Digite o primeiro numero: ");
			double primeiro = sc.nextInt();
			System.out.println("");
			
			System.out.println("Digite o segundo numero: ");
			double segundo = sc.nextInt();
			System.out.println("");
			
			if (segundo == 0) {
				System.out.println("Divisão impossível");
				System.out.println("");
			}
			else {
				System.out.printf("Resultado da divisão: %.2f%n", primeiro/segundo);
				System.out.println("");
			}
		}
		
		sc.close();
	}
}
