import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Por favor, digite o tipo de combustível:");

        int tipo = sc.nextInt();

        while (tipo != 4) {

            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }

            System.out.println("Por favor, digite o tipo de combustível:");
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");

        System.out.printf("Álcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
        sc.close();
    }
}
