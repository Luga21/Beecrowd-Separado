package br.java;
import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int prod = A * B;
		
		System.out.println("PROD = " + prod);
	}
}
