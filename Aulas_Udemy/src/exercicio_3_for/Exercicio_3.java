package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de notas que deseja calcular a média: ");
		int numero_notas = sc.nextInt();
		System.out.println("");
		
		for (int i = 1; i < numero_notas + 1; i++) {
			System.out.println("Digite as três notas do " + i + " aluno: ");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			System.out.printf("A média para o " + i + " aluno foi de: %.2f%n", ((2 * n1) + (3 * n2) + (5 * n3)) / 10);
			System.out.println("");
		}
		
		sc.close();
	}
}
