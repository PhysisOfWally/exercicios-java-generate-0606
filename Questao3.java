package main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia a idade de 
		 * várias pessoas (números inteiros), via teclado e 
		 * mostre na tela o total de pessoas cuja idade seja 
		 * menor que 21 anos e o total de pessoas cuja idade 
		 * seja maior que 50 anos. A leitura dos dados deve ser 
		 * exemplo abaixo: */

		// imports
		Scanner sc = new Scanner(System.in);

		// declarcao de variaveis
		int idade = 0;
		int maior = 0;
		int menor = 0;

		// parte lógica do código
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			
			if(idade < 21 && idade > 0) {
				++menor;
			}else if(idade > 50){
				++maior;
			}
		}
		
		System.out.print("\nTotal de pessoas menores de 21 anos: " + menor + "\n");
		System.out.print("Total de pessoas maiores de 50 anos: " + maior);
		
		sc.close();
	}
}
