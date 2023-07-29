package Aulas_Udemy;

import java.util.Locale;
import java.util.Scanner;


public class Aula1_entrada_usuario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
	}
}

//Forma para se fazer a leitura de uma variavel string
//Scanner sc = new Scanner(System.in);
//
//String x;
//x = sc.next();
//
//System.out.printf("Você digitou: " + x);
//
//sc.close();


//Forma para se fazer a leitura de uma variavel do tipo int
//Scanner sc = new Scanner(System.in);
//
//int x;
//x = sc.nextInt();
//
//System.out.println("Você digitou: " + x);
//
//sc.close();


//Forma para se fazer a leitura de uma variavel do tipo double
//Locale.setDefault(Locale.US);
//
//Scanner sc = new Scanner(System.in);
//
//double x;
//x = sc.nextDouble();
//
//System.out.printf("Você digitou: %.2f%n", x);
//
//sc.close();
//O println é independente da localização, ou seja, caso seja utilizado
//ele para fazer o print de algum double, ele erá imprimir com .
//Enquanto que, ao se utilizar o printf, ele fará a impressão de acordo
//com o que estiver no computador. Para correção disso, utilizar a
//biblioteca Locale.setDefault(Locale.US);
//Importar verificar se foi importado a biblioteca import java.util.Locale;


//Forma para se capturar apenas o primeiro caracter digitado da palavra:
//	Scanner sc = new Scanner(System.in);
//
//	char x;
//	x = sc.next().charAt(0);
//	System.out.println("Você digitou: " + x);
//	
//	sc.close();