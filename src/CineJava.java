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
			
			System.out.println("Escolha o filme: ");
			int indice = scanner.nextInt();
			
			if (indice >= 0 && indice < quantidadeFilmes) {
				
				System.out.println("Preço da inteira: R$ ");
				double inteira = scanner.nextDouble();
				
				System.out.println("Preço da meia: R$ ");
				double meia = scanner.nextDouble();
				
				if (inteira > 0 && meia <= inteira) {
					precosInteira[indice] = inteira;
					precosMeia[indice] = meia;
					
					System.out.println("Preços cadastrados com sucesso!");
				} else {
					System.out.println("Preços inválidos!");
					
		
				}
			}
			break;
		
		case 3:
			System.out.println("Listar filmes");
			break;
		
		case 4:
			System.out.println("Comprar ingresssos");
			break;
			
		case 0:
			System.out.println("Saindo do sistema...");
			
		default:
			System.out.println("Opção inválida!");
		}
		} while (opcao != 0);
		
		scanner.close();
	}

}
