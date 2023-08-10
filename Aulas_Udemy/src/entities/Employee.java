package entities;

import java.util.Locale;
import java.util.Scanner;

import application.ProgramaEmployee;

public class Employee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProgramaEmployee employee = new ProgramaEmployee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println();
		
		System.out.println("Uptaded data: " + employee.name + ", $ " + employee.netSalary());
	}

}
