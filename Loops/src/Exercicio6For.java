import java.util.Scanner;

public class Exercicio6For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gostaria de saber os divisores de qual número?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
