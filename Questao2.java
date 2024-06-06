package main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		/*
		 * 2) Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		 * mostre na tela quantos números são pares e quantos número são ímpares. Veja o
		 * exemplo abaixo:
		 */

		// imports
		Scanner sc = new Scanner(System.in);

		// declarcao de variaveis
		int numero;
		int pares = 0;
		int impares = 0;

		// parte lógica do código
		for (int i = 1; i <= 10; i++) {
			//entrada de dados
			System.out.printf("Digite o %d° número: ", i);
			numero = sc.nextInt();
			
			//contagem de pares e impares
			if (numero % 2 == 0) {
				++pares;
			} else {
				++impares;
			}
		}
		
		System.out.print("\nTotal de números pares: " + pares + "\n");
		System.out.print("Total de números ímpares: " + impares);
		
		sc.close();
	}

}
