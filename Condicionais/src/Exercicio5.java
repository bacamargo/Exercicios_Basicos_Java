import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double price;

        System.out.println("Digite o código do produto:");
        int code = sc.nextInt();

        System.out.println("Digite a quantidade:");
        int quantity = sc.nextInt();

        if (code == 1) {
            price = quantity * 4.0;
        } else if (code == 2) {
            price = quantity * 4.5;
        } else if (code == 3) {
            price = quantity * 5.0;
        } else if (code == 4) {
            price = quantity * 2.0;
        } else {
            price = quantity * 1.5;
        }

        System.out.printf("Total: R$ %.2f\n", price);

        sc.close();
    }
}
