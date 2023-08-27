package estruturasDeControle;

import java.util.Scanner;

public class Desafio3 {

	// 3.Escreva uma Programa que |receba a idade de 15 pessoas,| |calcule e
	// imprima: a
	// quantidade de pessoas em cada faixa etária|:As faixas etárias são

	/*
	 * •1 a 15 anos •16 a 30 anos •31 a 45 anos •46 a 60 anos = 61 anos
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0;
		int quantidadeA = 0;
		int quantidadeB = 0;
		int quantidadeC = 0;
		int quantidadeD = 0;
		int quantidadeE = 0;
		
		for (int i = 1; i <= 15; i++) {
			System.out.println("Digite a idade da pessoa " + i);
			idade = entrada.nextInt();

			if (idade >= 1 && idade <= 15) {
				quantidadeA++;
			} else if (idade >= 16 && idade <= 30) {
				quantidadeB++;
			} else if (idade >= 31 && idade <= 45) {
				quantidadeC++;
			} else if (idade >= 46 && idade <= 60) {
				quantidadeD++;
			} else if (idade >= 61) {
				quantidadeE++;
			}

		}

		System.out.println("•1 a 15 anos: " + quantidadeA
				+ "\n•16 a 30 anos: " + quantidadeB
				+ "\n•31 a 45 anos: " + quantidadeC
				+ "\n•46 a 60 anos " + quantidadeD
				+ "\n= 61 anos: " + quantidadeE); 
		
		entrada.close();
	}

}
