package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula54 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		while (true) {
//			System.out.println("Digite a temperatura em C°");
//			double C = sc.nextDouble();
//			double F = 9.0 * C / 5.0 +32.0;
//			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//			System.out.print("Deseja repetir? (s/n) ");
//			char resp = sc.next().charAt(0);
//			System.out.println(resp);
//			if (resp == 'n') {
//				break;
//			}
//		}
		char resp;
		do {
			System.out.println("Digite a temperatura em C°");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 +32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir? (s/n) ");
			resp = sc.next().charAt(0);
			System.out.println(resp);
		} while (resp != 'n');
		
		sc.close();
	}
}


//Estrutura repetitiva "faça-enquanto" (do-while)
//O Bloco de comando executa pelo menos uma vez, pois a condição é verificada no final.

//Estrutura:
//	do {
//		comando 1
//		comando 2
//	} while (condição); Aqui, primeiro é "foçado" a entrar no comando por culpa do do e, depois de executar tudo
//é verificado a condição. Caso não sejaa atendida, sai do comando.
