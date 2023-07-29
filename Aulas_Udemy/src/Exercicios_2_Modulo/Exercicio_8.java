package Exercicios_2_Modulo;

import java.util.*;

public class Exercicio_8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		
		double salario, diferenca;
		
		System.out.println("Digite o valor de seu salario: ");
		salario = sc.nextDouble();
		
		if (salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento de impsoto");
		}
		else if(salario <= 3000.00) {
			System.out.printf("Total de imposto a se pagar: %.2f", salario*0.08);
		}
		else if (salario <= 4500.00) {
			diferenca = salario - 3000;
			System.out.printf("Total de imposto a se pagar: %.2f", 1000*0.08 + diferenca*0.18);
		}
		else {
			diferenca = salario - 4500;
			System.out.printf("Total de imposto a se pagar: %.2f", 1000*0.08 + 1500*0.18 + diferenca*0.28);
		}
		
		sc.close();
	}
}
