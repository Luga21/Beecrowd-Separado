package br.java;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) throws IOException {
		
			Scanner sc = new Scanner(System.in);
			int codigo1 = sc.nextInt();
			int qtd1 = sc.nextInt();
			double valor1 = sc.nextDouble();
					
			int codigo2 = sc.nextInt();
			int qtd2 = sc.nextInt();
			double valor2 = sc.nextDouble();
			
			double valorPagar = ((qtd1 * valor1) + (qtd2* valor2));
			
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
			
	}
}
