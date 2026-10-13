package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }


        for (int i = numeros.length -1; i >= 0; i --) {
            System.out.println(numeros[i]);



        }

         sc.close();
    }
}
