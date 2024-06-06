package main;

import java.util.Scanner;

public class Questao6 {

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
		int numero, qntd = 0;
		double media = 0;
		
		//parte logica
		do {
			//entrada de dados
			System.out.print("Informe um número: ");
			numero = sc.nextInt();
			
			if(numero % 3 == 0 && numero != 0){
				qntd++;
				media += numero;
			}
			
		}while(numero != 0);
		
		media = media / qntd;
		
		System.out.print("A media dos números multiplos de 3 é: " + media);
		
		sc.close();
	}

}
