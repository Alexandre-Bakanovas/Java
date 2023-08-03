package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para calcular o seu fatorial");
		int numero = sc.nextInt();
		int numero1 = numero;

		if (numero1 > 0) {
			for (int i = 1; i < numero1; i++) {
				numero *= i;

			}
			System.out.println("O fatorial de " + numero1 + " é igual a: " + numero);
		}
		else {
			System.out.println("O fatorial de 0 é igual a 1");
		}
		
		sc.close();
	}
}
