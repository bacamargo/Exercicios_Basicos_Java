package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class ExercicioPensionato {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vetor = new Aluguel[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int numeroQuarto = sc.nextInt();

            vetor[numeroQuarto] = new Aluguel(name, email);
        }

        System.out.println("Busy rooms: ");

        for(int i = 0; i < 10; i++){
            if(vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}
