package exercicio_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de vezes que gostaria de rodar o programa: ");
		int entrada = sc.nextInt();
		System.out.println("");
		
		int in = 0;
		int out = 0;
				
		for(int i = 0; i < entrada; i++) {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			System.out.println("");
			
			if (numero >= 10 && numero <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println("Número de vezes em que se digitou dentro do intervalo: " + in);
		System.out.println("Número de vezes em que se digitou fora do intervalo: " + out);
		
		sc.close();
	}
}
