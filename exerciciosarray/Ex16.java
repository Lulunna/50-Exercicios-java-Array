package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] dobros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {
            dobros[i] = numeros[i] * 2;
            System.out.println("Dobro: " + dobros[i]);

        }

         sc.close();
    }
}
