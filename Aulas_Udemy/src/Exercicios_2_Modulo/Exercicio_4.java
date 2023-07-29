package Exercicios_2_Modulo;

import java.util.*;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, termino,calculo;
		
		System.out.println("Digite o horario em que se iniciou o jogo: ");
		inicio = sc.nextInt();
		System.out.println("Digite o horario em que o jogo terminou: ");
		termino = sc.nextInt();
		
		if (inicio > termino) {
			calculo = 24 - inicio;
			System.out.printf("O jogo durou %d HORA(S)", calculo + termino);
		}
		else if (termino == inicio) {
			System.out.println("O jogo durou 24 HORAS");
		}
		else {
			System.out.printf("O jogo durou %d HORA(S)", termino - inicio);
		}
		
		
		sc.close();
	}
}
