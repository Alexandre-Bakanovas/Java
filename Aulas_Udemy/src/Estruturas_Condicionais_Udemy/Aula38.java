package Estruturas_Condicionais_Udemy;

import java.util.*;

public class Aula38 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String dia;
		
		System.out.println("Digite o dia da semana: ");
		numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		System.out.println("O dia selecionado foi: " + dia);
		
		sc.close();
	}
}

//Estrutura switch-case
//É necessário sempre que se tenha o sistema de break após os case, para que ele possa sair da estrutura.
//e por padrão, o último resultado, o default, ele é rodado caso não se atenda nenhuma das condições previamente
//estalecidas.