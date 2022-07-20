import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário de início da partida:");

        int inicio = sc.nextInt();

        System.out.println("Digite o horário de término da partida:");

        int fim = sc.nextInt();

        int duracao = fim - inicio;

        int duracaoVira = duracao + 24;

        if (duracao > 0) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoVira);
        }

        sc.close();
    }
}
