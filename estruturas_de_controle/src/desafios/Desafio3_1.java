package estruturasDeControle;

import java.util.Scanner;

public class Desafio3_1 {

	// Escreva uma Programa que receba a idade de 15 pessoas, calcule e imprima: a
	// quantidade de pessoas em cada faixa etária e a porcentagem de cada faixa
	// etária em relação ao total de pessoas e porcentagem de cada faixa etária:As
	// faixas etárias são •1 a 15 anos •16
	// a 30 anos •31 a 45 anos •46 a 60 anos = 61 anos

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int c = 15;
		int[] f_i = new int[5];

		
		for (int i = 0; i < c; i++) {
			System.out.println("Digite a " + (i +1) + "° idade:");
			int idade = entrada.nextInt();

			if (idade >= 1 && idade <= 15) {
				f_i[0]++;
			} else if (idade >= 16 && idade <= 30) {
				f_i[1]++;
			} else if (idade >= 31 && idade <= 45) {
				f_i[2]++;
			} else if (idade >= 46 && idade <= 60) {
				f_i[3]++;
			} else if (idade >= 61) {
				f_i[4]++;
			}
		}
		
		System.out.println("•1 a 15 anos " + f_i[0]
				+ "\n•16 a 30 anos " + f_i[1]
				+ "\n•31 a 45 anos " + f_i[2]
				+ "\n•46 a 60 anos " + f_i[3]
				+ "\n= 61 anos " + f_i[4]);
		
		for(int i = 0; i < f_i.length; i++) {
			double p = (f_i[i] * 100) / c;
			System.out.println((i + 1) + " a " + (i + 15) + " anos: " + p + "%");
		}
		

		entrada.close();

	}
}