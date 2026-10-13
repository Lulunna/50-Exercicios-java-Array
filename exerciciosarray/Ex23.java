package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        System.out.println("Digite o número multiplicador");

        int multiplicador = sc.nextInt();

        System.out.println("Valores multiplicados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " x " + multiplicador + " = " + numeros[i] * multiplicador);
        }

        sc.close();
    }
}