import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        double salary = sc.nextDouble();

        double taxa;

        if (salary > 0.00 && salary <= 2000.00) {
            System.out.println("Isento");
        } else if (salary > 2000.01 && salary <= 3000.00) {
            taxa = (salary - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n", taxa);
        } else if (salary > 3000.01 && salary <= 4500.00) {
            taxa = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f\n", taxa);
        } else {
            taxa = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", taxa);
        }

        sc.close();
    }
}
