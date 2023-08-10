package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n",  retangulo.area());
		System.out.println("PERIMETER: " + retangulo.perimeter());
		System.out.println("DIAGONAL: " + retangulo.diagonal());

		sc.close();
	}

}
