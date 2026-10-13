package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int quantidadeNumerosPares = 0;
        int quantidadeNumerosImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº números: ", i + 1);
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                quantidadeNumerosPares++;
            } else {
                quantidadeNumerosImpar++;
            }

            System.out.printf("""
                    Quantidade de números pares: %d
                    Quantidade de números impar: %d
                    """, quantidadeNumerosPares, quantidadeNumerosImpar);

            sc.close();

        }
    }
}