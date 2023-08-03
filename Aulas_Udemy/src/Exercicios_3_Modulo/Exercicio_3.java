package Exercicios_3_Modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero =0;
		int alcool, gasolina, diesel, fim;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		fim = 0;
		while (numero != 4) {
			numero = sc.nextInt();
			switch (numero){
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			default:
				fim += 1;
				break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		System.out.println("Você errou o cadastro " + fim + " vezes...");
		
		sc.close();
	}
}
