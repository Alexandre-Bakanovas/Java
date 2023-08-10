package outrosTopicos;

import java.util.Locale;
import java.util.Scanner;

public class Operadores_bitwise {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		int n1 = 89;
//		int n2 = 60;
//		
//		System.out.println(n1 & n2);
//		System.out.println(n1 | n2);
//		System.out.println(n1 ^ n2);
//		Explicação do exercício abaixo:
//		A mascara criada foi do 32, que possui como binário o seguinte:
//			0010 0000
//		o número que for testado com o operador &, independente de qual seja o número, será testado apenas a posição
//		6. Por que?
//				Por que como todo o resto do bit de 32 é 0 e esta se usando o operador &, não importa o que seja colocado
//				la, todos os números, com excessão do 6, serão 0. Exemplo:
//			0010 0000 (32)
//			0111 0001 (113)
//			
//			Note que no exemplo acima, todos irão dar zero, com excessão do 6, que irá dar 1.
//			
//			Agora, no exercício abaixo, foi feito um if para saber se o 6 número será 0 ou 1. Caso não seja, todos
//			os bits serão 0, logo, o if irá para o else.
//			Caso o if seja atendido, irá imprimir que o 6 é um 1.
		
		
		int mask = 0b00100000;
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is True!");
		} else {
			System.out.println("6th bit is false");
		}
		
		
		
		
		sc.close();
	}
}


//Operadores:
//	& - Operação "E" bit a bit
//	| - Operação "OU" bit a bit
//	^ - Operação "OU-exclusivo" bit a bit

//Demonstração:
//	(89) 0101 1001		&: 0001 1000 (24)
//					>   |: 0111 1101 (125)
//	(60) 0011 1100		^: 0110 0101 (101)
//	Esse tipo de programação de aplica a programação de baixo nível, micro controlador, arduino, interface de rede