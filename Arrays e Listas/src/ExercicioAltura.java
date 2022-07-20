import java.util.Locale;
import java.util.Scanner;

public class ExercicioAltura {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, menores;
        double alturaTotal, alturaM, percentual;

        System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da pessoa %d:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        menores = 0;
        alturaTotal = 0;

        for (int i = 0; i < n; i++) {
	        if (idades[i] < 16) {
	            menores++;
	        }
	        alturaTotal = alturaTotal + alturas[i];
	    }

        alturaM = alturaTotal / n;
	    percentual = ((double) menores / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturaM);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
;

        for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}