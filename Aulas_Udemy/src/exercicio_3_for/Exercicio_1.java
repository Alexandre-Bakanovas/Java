package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.println("Por favor, digite um número: ");
			int numero = sc.nextInt();
			if (numero >= 1 && numero <= 1000) {

				System.out.println("Aqui estão os números ímpares, até o número selecionado: " + numero);
				System.out.println("");

				for (int i = 0; i <= numero; i++) {
					if (i % 2 == 0) {
						continue;
					} else if (i % 2 != 0) {
						System.out.println(i);
					}
				}
			break;
			}
			else {
				System.out.println("Você deve digitar um número entre 1 e 1000. Por favor, tente novamente.");
			}
		}
		
		sc.close();
	}
}
