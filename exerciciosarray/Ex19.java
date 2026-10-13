package flamingo.aprendendo.basico.exerciciosarray;
import java.util.Scanner;


public class Ex19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        System.out.println("Antes da troca:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int temporario = numeros[0];

        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = temporario;

        System.out.println("Depois da troca:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

