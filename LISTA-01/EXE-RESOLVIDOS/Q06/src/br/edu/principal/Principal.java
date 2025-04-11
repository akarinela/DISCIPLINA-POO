import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double sal = scanner.nextDouble();
      
        double grat = sal * 0.05;
        double imp = sal * 0.07;

        double salReceber = sal + grat - imp;

        System.out.printf("Salário a receber:" + salReceber);

    }
}
