/**
 * ENCONTRE O PROBLEMA E MOSTRE COMO AJUSTAR
 * import java.util.Scanner;

 * class HelloWorld {
 *     public static void main(String[] args) {

 *         String nome = "";
 *         int idade = 0;
 *         double peso = 0.0;

 *         Scanner scanner = new Scanner(System.in);

 *         System.out.println("Informe seus dados:  ");
 *         idade = scanner.nextInt();
 *         peso = scanner.nextDouble();
 *         nome = scanner.nextLine();

 *         scanner.close();

 *         System.out.println("Nome "+ nome);
 *         System.out.println("idade "+ idade);
 *         System.out.println("peso "+ peso);
 *     }
 * }
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double peso;

        System.out.println("Informe seus dados:  ");

        // Para a declaração de idade, podemos utilizar uma estrutura try-catch para resolver o caso de InputMismatchException.
        System.out.println("Idade: ");
        while(true) {
            try {
                idade = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por gentileza, insira um valor válido.");
                System.out.println("Idade: ");
                scanner.nextLine();
            }
        }

        // O mesmo se dá para a declaração da variável peso.
        System.out.println("Peso: ");
        while(true) {
            try {
                peso = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por gentileza, insira um valor válido.");
                System.out.println("Peso: ");
                scanner.nextLine();
            }
        }

        // Por fim, utilizamos uma linha de quebra "scanner.nextLine();" antes da leitura da variável nome, para consumir
        // o valor adicional imputado ao ler um valor "String" logo após um valor "double" ou "int".
        System.out.println("Nome: ");
        scanner.nextLine(); // Consumir a linha pendente.
        nome = scanner.nextLine();

        scanner.close();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
