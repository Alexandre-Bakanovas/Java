package Estruturas_Condicionais_Udemy;

import java.util.Scanner;

public class Aula34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas: ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora >=12 && hora <= 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		sc.close();
	}
}
//		if (hora < 12) {
//			System.out.println("Bom dia");
//		}
//		else {
//			System.out.println("Boa tarde");
//		}
		
//		if (x > 6) { //Neste comando, só será impresso se x>6
//			System.out.println("Boa tarde"); //endentação é de suma importância
//		}
//		System.out.println("Boa noite");
		
//expressões lógicas: Estes símbolos são utilizados nas linguagens C, C++, Java e C#
//	&& -> Significado de E
//	|| -> Significado de OU
//	! -> Significado de NÂO

//Estruturas condicionais:
//	if (<condição>) {
//		<comando1>
//		<comando2>
//	}

//Estrutura If-Else:
//	if (<condição>) {
//		<condição1>
//		<condição2>
//	}
//	else {
//		
//	}
