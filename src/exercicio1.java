import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        
        // 1. Conecta o Scanner ao teclado (System.in)
        Scanner sc = new Scanner(System.in);

        // 2. ENTRADA DE DADOS
        System.out.println("=== SISTEMA DE CADASTRO ===");
        
        System.out.print("Digite o código do produto (inteiro): ");
        int codigo = sc.nextInt();

        System.out.print("Digite o preço unitário (ex: 2,98): ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        // Limpeza do buffer (consome o ENTER pendente)
        sc.nextLine();

        System.out.print("Digite a categoria do produto: ");
        String categoria = sc.nextLine();

        // 3. PROCESSAMENTO (Cálculo com as variáveis numéricas)
        double total = preco * quantidade;

        // 4. SAÍDA DE DADOS (System.out)
        System.out.println("\n=================================");
        System.out.println("        RESUMO DA COMPRA         ");
        System.out.println("=================================");
        System.out.println("Código: " + codigo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço Unitário: R$ %.2f%n", preco);
        System.out.printf("Total a Pagar:   R$ %.2f%n", total);
        System.out.println("=================================");

        // 5. Encerra a leitura
        sc.close();
    }
}