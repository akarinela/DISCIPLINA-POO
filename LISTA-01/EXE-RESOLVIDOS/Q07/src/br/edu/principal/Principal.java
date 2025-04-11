import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double sal = scanner.nextDouble();

        double imp = sal * 0.10;

        double salReceber = sal + 50 - imp;

        System.out.printf("Salário a receber:" + salReceber);

        scanner.close();
    }
}
