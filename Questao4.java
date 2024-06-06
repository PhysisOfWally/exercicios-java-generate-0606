package main;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa interna 
		 * para conhecer os colaboradores da área de 
		 * Desenvolvimento e precisam de um sistema para 
		 * analisar os dados. Escreva um algoritmo em Java, 
		 * que leia via teclado as seguintes informações 
		 * de cada colaborador:*/
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declarando variaveis
		int idade = 0;
		int iG = 0;
		int pD = 0;
		String resposta = "S";
		int devBack = 0;
		int mulheresFront = 0;
		int homensMob40 = 0;
		int nbFull30 = 0;
		double mediaIdade = 0;
		int totalRespostas = 0;
        int somaIdades = 0;
		
		//parte logica do codigo
		while(!resposta.equalsIgnoreCase("N")) {
			//entrada de dados
			System.out.print("Informe a sua idade: ");
			idade = sc.nextInt();
			
			//MENU DE GENERO
	        System.out.println("---------------------------------");
	        System.out.println("Código do Gênero\t\tGênero");
	        System.out.println("1\t\t\tMulher Cis");
	        System.out.println("2\t\t\tHomem Cis");
	        System.out.println("3\t\t\tNão Binário");
	        System.out.println("4\t\t\tMulher Trans");
	        System.out.println("5\t\t\tHomem Trans");
	        System.out.println("6\t\t\tOutros");
	        System.out.println("---------------------------------");
	        
	        System.out.print("Digite o código do Gênero (1 a 6): ");
	        iG = sc.nextInt();
			
			//MENU DE FUNÇÕES
	        System.out.println("\n\n---------------------------------");
	        System.out.println("Código do Gênero\t\tGênero");
	        System.out.println("1\t\t\tBackend");
	        System.out.println("2\t\t\tFrontend");
	        System.out.println("3\t\t\tMobile");
	        System.out.println("4\t\t\tFullStack");
	        System.out.println("---------------------------------");
	        
	        System.out.print("Digite o código do Cargo (1 a 4): ");
	        pD = sc.nextInt();
	        
	        //parte lógica do código
	        totalRespostas++;
            somaIdades += idade;
            
	        if (pD == 1) {
	        	devBack++;
            } else if (pD == 2 && (iG == 1 || iG == 4)) {
            	mulheresFront++;
            } else if (pD == 3 && (iG == 2 || iG == 5) && idade > 40) {
            	homensMob40++;
            } else if (pD == 4 && iG == 3 && idade < 30) {
            	nbFull30++;
            }
	        
	        // Cálculo da média de idade
	         mediaIdade = (double) somaIdades / totalRespostas;
	        
			//verifica a saida do while
			System.out.print("\n\nDeseja continuar (S/N): ");
			resposta = sc.next();
		}
		
		// Exibição dos resultados
        System.out.println("Número de pessoas desenvolvedoras Backend: " + devBack);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFront);
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMob40);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + nbFull30);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + totalRespostas);
        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
        
		sc.close();
	}

}
