package Exercicios_2_Modulo;

import java.util.*;

public class Exercicio_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro");
		numero = sc.nextShort();
		
		if (numero > 0) {
			System.out.println("NÂO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}
}
