import java.util.Scanner;

/**
 *  3. Verificação de login:
 *  Crie um programa Java que pede ao usuário para inserir seu nome de usuário e senha.
 *  Se o nome de usuário for "usuario" e a senha for "senha123", o programa deve imprimir "Login bem-sucedido".
 *  Caso contrário, deve imprimir "Nome de usuário ou senha incorretos".
 */

public class Atividade4-3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String senha;
        try {
            System.out.println("Usuario: ");
            nome = scanner.nextLine();
            System.out.println("Senha: ");
            senha = scanner.nextLine();
          
            if (nome.equals("Usuario") && senha.equals("S2024")) {
                System.out.println("Login finalizado!");
            } else {
                System.out.println("Nome de usuário ou senha incorretos!");
            }
        } finally {
            scanner.close();
        }
    }
}
