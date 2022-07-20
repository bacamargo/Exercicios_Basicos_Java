import java.util.Scanner;

public class Exercicio5For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que gostaria de saber o fatorial:");
        int x = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= x; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
