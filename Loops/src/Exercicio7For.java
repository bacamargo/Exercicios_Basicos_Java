import java.util.Scanner;

public class Exercicio7For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int first = i;
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d %d %d\n", first, second, third);
        }

        sc.close();
    }
}
