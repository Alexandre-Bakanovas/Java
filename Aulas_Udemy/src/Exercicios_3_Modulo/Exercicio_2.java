package Exercicios_3_Modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		while (true) {
			System.out.println("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.println("");

			System.out.println("Digite o valor de Y: ");
			y = sc.nextInt();
			System.out.println("");
			
			if(x == 0 || y ==0) {
				break;
			}
			else if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
				System.out.println();
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
				System.out.println("");
			}
			else if (x < 0 && y >0) {
				System.out.println("Segundo quadrante");
				System.out.println("");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
				System.out.println("");
			}
		}
		
		
		sc.close();
	}
}
