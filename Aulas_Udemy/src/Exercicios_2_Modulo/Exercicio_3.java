package Exercicios_2_Modulo;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		double C,D;
		
		System.out.println("Digite o valor de A");
		A = sc.nextInt();
		System.out.println("Digite o valor de B");
		B = sc.nextInt();
		
		C = A % B;
		D = B % A;
		
		if (C == 0 || D == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}
}
