import java.util.InputMismatchException;
import java.util.Scanner;

//"Faça um sistema que peça 2 valores e faça uma subtração."

public class Atividade3-2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double valor1;
        double valor2;
        double subtracao;

        try {
            while (true) {
                System.out.println("# Subtração básica #");
                System.out.println("Insira o primeiro valor: ");
                valor1 = getValor();
                System.out.println("Insira o segundo valor: ");
                valor2 = getValor();

                subtracao = valor1 - valor2;
                System.out.println("Subtração = " + subtracao);

                System.out.println(" Voce deseja subtrair novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                double sair = getValor();
                if (sair == 2) {
                    System.out.println("Programa finalizado. Obrigado!");
                    break;
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static double getValor() {
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
