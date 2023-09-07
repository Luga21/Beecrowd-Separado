package br.java;
import java.io.IOException;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int raio = sc.nextInt();
		
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("A=%.4f\n", area);
	}
}
