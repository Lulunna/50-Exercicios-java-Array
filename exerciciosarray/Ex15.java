package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * 2);



        }

         sc.close();
    }
}
