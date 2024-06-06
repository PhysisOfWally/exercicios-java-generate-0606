package main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		/* 1)	Escreva um algoritmo em Java, que leia 2 números inteiros
		 *  via teclado, onde o primeiro número deve ser menor do que o 
		 *  segundo número. Caso contrário, deve ser exibida uma mensagem na 
		 *  tela informando que o intervalo é inválido e sair do programa. No 
		 *  intervalo informado, mostre na tela todes os números que são 
		 *  múltiplos de 3 e 5*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarcao de variaveis
		int n1, n2;
		
		//entrada de dados
		System.out.print("Digite o número 1: ");
        n1 = sc.nextInt();
        
        System.out.print("Digite o número 2: ");
        n2 = sc.nextInt();
		
		//parte lógica do código
		if(n1 < n2) {
			System.out.printf("\nNo Intervalo entre %d e %d:\n\n", n1, n2);
			for(int i = n1; i <= n2; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
		}else {
			System.out.println("o intervalo é inválido");
		}
		
		sc.close();
	}

}
