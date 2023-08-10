package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class Aula63 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangule X: ");
		double number1x = sc.nextDouble();
		double number2x = sc.nextDouble();
		double number3x = sc.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		double number1y = sc.nextDouble();
		double number2y = sc.nextDouble();
		double number3y = sc.nextDouble();
		
		double p1 = (number1x + number2x + number3x)/2;
		double p2 = (number1y + number2y + number3y)/2;
		
		double area1 = Math.sqrt(p1 * (p1 - number1x) * (p1 - number2x) * (p1 - number3x));
		double area2 = Math.sqrt(p2 * (p2 - number1y) * (p2 - number2y) * (p2 - number3y));
		
		System.out.printf("Triangule X area: %.4f%n", area1);
		System.out.printf("Triangule Y area: %.4f%n", area2);
		
		if (area1 > area2) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}

//Exercício proposto:
//	Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida, mostrar 
//	o valor das áreas dos dois triângulos e dize qual dos dois triângulos possui a maior área
