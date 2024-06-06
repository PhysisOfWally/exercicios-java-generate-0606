package main;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que 
		 * leia números inteiros via teclado, 
		 * até que o número zero seja digitado. 
		 * Ao final, mostre na tela a soma de 
		 * todos os números digitados, que 
		 * sejam positivos. Veja o exemplo abaixo:*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando as variaveis
		int numero, somaPositivos = 0;
		
		//parte logica
		do {
			//entrada de dados
			System.out.print("Informe um número: ");
			numero = sc.nextInt();
			
			if(numero > -1) {
				somaPositivos += numero;
			}
			
		}while(numero != 0);
		
		System.out.print("A soma dos números positivos é: " + somaPositivos);
		
		sc.close();
	}

}
