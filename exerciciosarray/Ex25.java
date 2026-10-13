package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Digite o número " + (i + 1));
                numeros[i] = sc.nextInt();
            }

            int somaImpares = 0;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 != 0) {
                    somaImpares += numeros[i];
                }
            }

            System.out.println("A soma dos números ímpares é " + somaImpares);

            sc.close();
        }
    }