package Estruturas_Condicionais_Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Aula39 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco;
		System.out.println("Digite o valor do produto: ");
		preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;		
		System.out.println("O desconto foi de: " + desconto);
		
		sc.close();
	}
}

//Expressão condicional ternária

//Exemplo:
//	double preco = 34.5
//	double desconto = (preco < 20.0) ? preco *0.1 : preco * 0.05;
//	A expressão acima é uma estrutura ternária, com o seguinte significado:
//		a variável desconto recebe a seguinte condição (preco < 20). SE (representado pela interrogação)
//		essa expressão for verdadeira, roda o que foi dito logo a seguir, a expressão a esquerda do ":"
//		Caso seja falso, roda a segunda espressão.