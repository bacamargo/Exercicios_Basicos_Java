import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        if (value > 0.0 && value <= 25.0) {
            System.out.println("Intervalo [0, 25]");
        } else if (value > 25.0 && value <= 50.0) {
            System.out.println("Intervalo (25, 50]");
        } else if (value > 50.0 && value <= 75.0) {
            System.out.println("Intervalo (50, 75]");
        } else if (value > 75.0 && value <= 100.0) {
            System.out.println("Intervalo (75, 100]");
        } else {
            System.out.println("Fora do intervalo");
        }

        sc.close();
    }
}
