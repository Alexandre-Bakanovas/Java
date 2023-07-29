package Exercicios_2_Modulo;

import java.util.*;

public class Exercicio_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double resto;
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		resto = numero % 2;
		
				
		if (resto == 0){
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
