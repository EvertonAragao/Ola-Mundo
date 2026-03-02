import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner teclado = new
        Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade + " anos");
    }
}