package Exerciocios_1_Modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valor_hora;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valor_hora = sc.nextDouble();
		
		double salario = valor_hora * horas;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		
		sc.close();
		
	}
}
