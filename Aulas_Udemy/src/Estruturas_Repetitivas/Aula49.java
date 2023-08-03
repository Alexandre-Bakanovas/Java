package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula49 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}
}

//Utilizando o for.
//Utilizamos ele quando sabemos previamente a quantidade de vezes que queremos correr.
//Sintaxe:
//	for (inicio; condição; incremento) {
//		comando 1
//		comando 2
//	}