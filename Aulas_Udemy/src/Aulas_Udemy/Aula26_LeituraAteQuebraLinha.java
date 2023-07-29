package Aulas_Udemy;

import java.util.Scanner;

public class Aula26_LeituraAteQuebraLinha {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3, s4;
		int x;
//		Aqui é feito a leitura da variavel até que seja pressionado o enter
//		graças ao "nextLine"
//		Quanto se quer escrever algo que não seja para o next line e depois fazer a
//		quebra da linha, coloca-se uma variavel intermediaria para que ela receba 
//		a quebra e não atrapalhe na execução do programa
		
		x = sc.nextInt();
		s4 = sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}
}
