package outrosTopicos;

import java.util.Scanner;

public class Funcoes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); //função personalidade que retorna o maior valor
		
		showResult(higher);		
	
		sc.close();
	}
// Aqui vamos fazer a declaração da nossa Função. Estrutura básica é sempre começar com o public static
//	No caso, aqui utilizamos o int pois queremos que a função retorne um int.
// depois colocamos o nome da função (max) e fizemos a declaração de seus argumentos. Os argumentos não precisam ter os
//	mesmos nomes que la encima, precisam apenas ter nome.
	//Ao final, devemos colocar um return pois a nossa função retorna algum valor.
	public static int max(int x, int y, int z) {
		int aux; //variável local.
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	//Quando a função não tem que retornar nada, utilizamos o void
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}

/* Representam um processamento que possui um significado:
	Math.sqrt(double)
	system.out.println(string)
	
Principais vantagens: modularização, delegação e reaproveitamento

Dados de entrada e saída:
	Funções podem receber dados de entrada (parâmetros ou argumentos)
	Funções podem ou não retornar uma saída
	
Em orientação a objetiso, funções em classes recebem o nome de "métodos" */