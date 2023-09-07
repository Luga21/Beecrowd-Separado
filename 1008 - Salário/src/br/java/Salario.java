package br.java;

import java.io.IOException;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double salaryHour = sc.nextDouble();
		
		double salary = salaryHour * hours; 
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n", salary);
	}
}
