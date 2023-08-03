package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula44 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
		}
		
		System.out.println("A soma dos valores foi: " + soma);
		sc.close();		
	}
}


//Para o debuger, o F6 serve para ir para a próxima linha.

//Sintaxe do while:
//	while (condição) {
//		comando 1
//		comando 2
//	}