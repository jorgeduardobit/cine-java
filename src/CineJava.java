import java.util.Scanner;

public class CineJava {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		int capacidade = 10;
		int quantidadeFilmes = 0;
		
		String[] nomes = new String[capacidade];
		String[] generos = new String[capacidade];
		int[] classificacoes = new int[capacidade];
		
		double[] precosInteira = new double[capacidade];
		double[] precosMeia = new double[capacidade];
		
		
		do {
		
		System.out.println("===== CINE JAVA =====");
		System.out.println("1 - Cadastrar filme");
		System.out.println("2 - Cadastrar preço");
		System.out.println("3 - Listar filmes");
		System.out.println("4 - Comprar ingresssos");
		System.out.println("0 - Sair");
		System.out.print("Escolha uma opção: ");
		
		opcao = scanner.nextInt();
		scanner.nextLine();
		
		switch(opcao) {
		case 1:
			if  (quantidadeFilmes < capacidade) {
				
				System.out.println("\n=== CADASTRAR FILME ===");
				
				System.out.print("Nome do filme: ");
				nomes[quantidadeFilmes] = scanner.nextLine();
				
				System.out.print("Gênero: ");
				generos[quantidadeFilmes] = scanner.nextLine();
				
				System.out.print("Classificação indicativa: ");
				classificacoes[quantidadeFilmes] = scanner.nextInt();
				scanner.nextLine();
				
				precosInteira[quantidadeFilmes] = 0;
				precosMeia[quantidadeFilmes] = 0;
				
				quantidadeFilmes++;
				
			} else {
				System.out.println("Limite de filmes atingido!");
			}
			break;
		
		case 2:
			if (quantidadeFilmes == 0) {
				System.out.println("Cadastre um filme primeiro!");
				break;
			}
			
			System.out.println("\n=== CADASTRAR PREÇOS ===");
			
			for (int i = 0; i < quantidadeFilmes; i++) {
				System.out.println((i + 1) + " - " + nomes[i]);
			}
			
			System.out.print("Escolha o filme: ");
			int indice = scanner.nextInt() -1;
			
			if (indice >= 0 && indice < quantidadeFilmes) {
				
				System.out.print("Preço da inteira: R$ ");
				double inteira = scanner.nextDouble();
				
				System.out.print("Preço da meia: R$ ");
				double meia = scanner.nextDouble();
				
				if (inteira > 0 && meia <= inteira ) {
					precosInteira[indice] = inteira;
					precosMeia[indice] = meia;
					
					System.out.println("Preços cadastrados com sucesso!");
				} else {
					System.out.println("Preços inválidos!");
				}
				} else {
					System.out.println("Filme inválido!");
				}
			
			break;
		
		case 3:
			System.out.println("=== FILMES CADASTRADOS ===");
			
			if (quantidadeFilmes == 0) {
				System.out.println("Nenhum filme cadastrado.");
			} else {
				for (int i = 0; i < quantidadeFilmes; i++) {
					
					System.out.println("\nFilme " + (i+1));
					System.out.println("Nome: " + nomes[i]);
					System.out.println("Gênero :" + generos[i]);
					System.out.println("Classificação: " + classificacoes[i] + " anos");
					
					if (precosInteira[i] > 0) {
						System.out.printf("Inteira: R$ %.2f\n", precosInteira[i]);
						System.out.printf("Meia entrada: R$ %.2f\n", precosMeia[i]);
					} else {
						System.out.println("Preço ainda não cadastrado");
					}
				}
			}
			
			break;
		
		case 4:
			if (quantidadeFilmes == 0) {
				System.out.println("Cadastre um filme primeiro!");
				break;
			}
			
			System.out.println("\n=== COMPRAR INGRESSOS ===");
			
			for (int i = 0; i < quantidadeFilmes; i++) {
				System.out.println((i + 1) + " - " + nomes[i]);
			}
			 System.out.println("Escolha o filme: ");
			 int filmeEscolhido = scanner.nextInt() - 1;
			 
			 if (filmeEscolhido < 0 || filmeEscolhido > quantidadeFilmes) {
				 System.out.println("Filme inválido");
				 break;
			 }
			 
			 if (precosInteira[filmeEscolhido] < 0) {
				 System.out.println("Cadastre o preço do filme primeiro!");
				 break;
			 }
			 
			 System.out.println("1 - Inteira");
			 System.out.println("2 - Meia entrada");
			 System.out.print("Tipo de ingresso: ");
			 
			 int tipo = scanner.nextInt();
			 double preco = 0;
			 
			 switch (tipo) {
			 
			 case 1:
				 preco = precosInteira[filmeEscolhido];
				 break;
				 
			 case 2:
				 preco = precosMeia[filmeEscolhido];
				 break;
				 
			default:
				System.out.println("Tipo de ingresso inválido!");
			 }
			 
			 if (preco > 0 ) {
				 System.out.println("Quantidade de ingressos: ");
				 int quantidade = scanner.nextInt();
				 
				 if (quantidade > 0) {
					 double total = preco * quantidade;
					 
					 System.out.println("\n=== RESUMO DA COMPRA ===");
					 System.out.println("Filme: " + nomes[filmeEscolhido]);
					 System.out.println("Quantidade: " + quantidade);
					 System.out.printf("Preço unitário: R$ %.2f%n", preco);
					 System.out.printf("Total: R$ %.2f%n", total);
				 }
			 } 
			break;  
		case 0:
			System.out.println("Saindo do sistema...");
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
		} while (opcao != 0);
		
		scanner.close();
	}

}
