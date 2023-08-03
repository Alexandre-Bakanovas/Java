package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++)
			System.out.println("Valor: " + i + ", Quadrado: " + Math.pow(i, 2) + ", Cubo: " + Math.pow(i, 3));
		
		sc.close();
	}
}
