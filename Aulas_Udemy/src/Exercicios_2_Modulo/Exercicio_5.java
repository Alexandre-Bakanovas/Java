package Exercicios_2_Modulo;

import java.util.*;

public class Exercicio_5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		
		System.out.println("Digite o código do seu pedido: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade desejada: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f", quantidade * 4.00);
		}
		else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f", quantidade * 4.5);
		}
		else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f", quantidade * 5.00);
		}
		else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f", quantidade * 2.00);
		}
		else if (codigo == 5) {
			System.out.printf("Total: R$ %.2f", quantidade * 1.50);
		}
		sc.close();
	}
}
