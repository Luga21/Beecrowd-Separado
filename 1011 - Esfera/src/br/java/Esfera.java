package br.java;

import java.io.IOException;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		
		double volume = ((4/3.0) * 3.14159 * (raio*raio*raio));
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}
