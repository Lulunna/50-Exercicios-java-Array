package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        boolean iguais = true;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array 1 - digite o valor " + (i + 1));
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array 2 - digite o valor " + (i + 1));
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
            }
        }

        if (iguais) {
            System.out.println("Os arrays são iguais");
        } else {
            System.out.println("Os arrays são diferentes");
        }

        sc.close();
    }
}