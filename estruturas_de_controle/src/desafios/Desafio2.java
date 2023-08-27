package estruturasDeControle;

import java.util.Scanner;

public class Desafio2 {

	// 2.Escreva uma Programa que receba a idade de 10 pessoas, calcule e imprima a
	// quantidade de pessoas maiores de idade (idade >= 18 anos)

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0;
		int quantidade = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite a idade da pessoa " + i);
			idade = entrada.nextInt();

			if (idade >= 18) {
				quantidade++;
			}
		}

		System.out.println("Quantidade de pessoas maiores de idade: " + quantidade);

		entrada.close();
	}

}
