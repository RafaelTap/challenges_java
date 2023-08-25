package desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		// 1. Faça uma Programa que receba um número inteiro, calcule e imprima a
		// tabuada desse número.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número.");
		int num = entrada.nextInt();

		for (int i = 0; i <= 10; i++) {
			int prod = num * i;
			System.out.println(num + " X " + i + " = " + prod);
		}

		entrada.close();
	}
}