package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex03 {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº", i + 1);
            numeros[i] = sc.nextInt();

            soma += numeros[i];
        }

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}

