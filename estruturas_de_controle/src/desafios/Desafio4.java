package estruturasDeControle;

import java.util.Scanner;

public class Desafio4 {

	// Escreva uma Programa que receba um conjunto de valores inteiros e positivos,
	// calcule e imprima o| maior |e o |menor |valor do conjunto

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		 System.out.print("Digite a quantidade de valores ");
	        int v = entrada.nextInt();

	        int[] a = new int[v];

	        for (int i = 0; i < v; i++) {
	            System.out.print("Insira o "  + (i + 1) + "°número (inteiro, positivo e não nulo): ");
	            a[i] = entrada.nextInt();

	        }

	        int maior = a[0];
	        int menor = a[0];

	        for (int i = 1; i < v; i++) {
	            if (a[i] > maior) {
	                maior = a[i];
	            }

	            if (a[i] < menor) {
	                menor = a[i];
	            }
	        }

	        System.out.println("Maior valor: " + maior);
	        System.out.println("Menor valor: " + menor);

	        entrada.close();
	    }
	}


