import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
    
        // Conectamos o Scanner ao fluxo de entrada do teclado (System.in)
        Scanner leitor = new Scanner(System.in);

        // --- 2. USO DO System.out (Saída na Tela) ---
        // Exibimos mensagens solicitando dados do usuário
        System.out.println("=== CADASTRO DE PRODUTO ===");
        
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = leitor.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = leitor.nextInt();

        System.out.print("Digite o preço unitário (R$): ");
        double preco = leitor.nextDouble();

        // --- 3. EXIBIÇÃO FORMATADA COM System.out ---
        System.out.println("\n---------------------------------");
        System.out.println("Resumo do Cadastro:");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Estoque: " + quantidade + " unidades");
        
        // Uso do System.out.printf para formatar 2 casas decimais (R$)
        System.out.printf("Preço Unitário: R$ %.2f%n", preco);
        System.out.println("---------------------------------");

        // Fechamos a leitura
        leitor.close();
    }
}
