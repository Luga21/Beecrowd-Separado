package br.java;

import java.io.IOException;
import java.util.Scanner;

public class SalarioCBonus {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		double salarioFixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double vendasCComissao = vendas * 0.15;
		double total = vendasCComissao + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}

}
