import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas vezes deseja converter? ");
            int vezes = sc.nextInt();

        System.out.print("Digite o valor do dólar atual: ");
            double valorDolar = sc.nextDouble();

            for (int contador = 1; contador <= vezes; contador++) {

                System.out.println("Digite o valor em reias para converter: ");
                    double valorReal = sc.nextDouble();

                    double convertido = valorReal / valorDolar;

                    System.out.printf("Valor convertido em dolar é U$ %.2f%n ",  convertido);
            }
        System.out.println("CONVERSÃO FINALIZADA!");
            sc.close();
    }
}