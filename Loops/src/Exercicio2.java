import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite X:");
        int x = sc.nextInt();

        System.out.println("Digite Y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else {
                break;
            }

            System.out.println("Digite X:");
            x = sc.nextInt();
            System.out.println("Digite Y:");
            y = sc.nextInt();
        }

        sc.close();
    }
}
