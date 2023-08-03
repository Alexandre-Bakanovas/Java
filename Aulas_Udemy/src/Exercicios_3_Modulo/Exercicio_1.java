package Exercicios_3_Modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int senha;
		
		while(true) {
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
			if (senha == 2002) {
				break;
			}
			else {
				System.out.println("Senha inválida.");
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}
