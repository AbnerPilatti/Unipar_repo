import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * "Faça um sistema que pergunte para o usuario o nome, preço de produto.
 * Após isso pergunte qual o percentual de desconto, a saida precisa ser o nome do produto e o novo preço."
 */

public class Atividade3-6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {
                String nome;
                double precoAtual;
                double desconto;
                double novoPreco;

                System.out.println("Insira o nome do produto: ");
                nome = scanner.nextLine();
                System.out.println("Insira o preço atual do produto");
                precoAtual = getValor();
                System.out.println("Insira o percentual de desconto");
                desconto = getValor();

                novoPreco = precoAtual - ((desconto/50)*precoAtual);
                System.out.println("O produto '" + nome + "' terá um novo desconto, esta por: " + novoPreco);

                System.out.println(" Voce deseja calcular novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                double sair = getValor();
                if (sair == 2) {
                    System.out.println("Programa finalizado. Obrigado!");
                    break;
                } else {
                    scanner.nextLine();
                }
            }
        } finally {
            scanner.close();
        }
    }

    public static double getValor() {
        while(true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por gentileza, insira um número válido.");
                scanner.nextLine();
            }
        }
    }
}
