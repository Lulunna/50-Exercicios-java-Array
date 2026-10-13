package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int[] array1 = new int[5];
            int[] array2 = new int[5];
            int[] soma = new int[5];

            for (int i = 0; i < array1.length; i++) {
                System.out.println("Array 1 - digite o valor " + (i + 1));
                array1[i] = sc.nextInt();
            }
            for (int i = 0; i < array2.length; i++) {
                System.out.println("Array 2 - digite o valor " + (i + 1));
                array2[i] = sc.nextInt();
            }

            System.out.println("Soma das posições correspondentes:");
            for (int i = 0; i < soma.length; i++) {
                soma[i] = array1[i] + array2[i];
                System.out.println(array1[i] + " + " + array2[i] + " = " + soma[i]);
            }

            sc.close();
        }
    }