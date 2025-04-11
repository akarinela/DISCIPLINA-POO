import java.util.Scanner;

public class RendimentoDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: ");
        double dep = scanner.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        double taxa = scanner.nextDouble();

        double rend = dep * taxa / 100;
        double total = dep + rend;

        System.out.printf("Rendimento:" + rend);
        System.out.printf("Total após rendimento:" + total);

        scanner.close();
    }
}
