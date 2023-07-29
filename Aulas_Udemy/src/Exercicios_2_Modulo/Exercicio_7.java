package Exercicios_2_Modulo;

import java.util.*;

public class Exercicio_7 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite a coordenada X: ");
		x = sc.nextDouble();
		System.out.println("Digite a coordenada Y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else {
			System.out.println("Q3");
		}
		
		sc.close();
	}
}
