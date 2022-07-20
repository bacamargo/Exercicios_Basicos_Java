import java.util.Locale;
import java.util.Scanner;

public class Exercicio4For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de casos:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite dois valores:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("divisão impossível");
            } else {
                double divide = (double) a / b;
                System.out.printf("%.1f\n", divide);
            }

        }

        sc.close();
    }
}
