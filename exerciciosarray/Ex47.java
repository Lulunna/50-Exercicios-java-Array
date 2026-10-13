package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número multiplicador");

        int multiplicador = sc.nextInt();

        System.out.println("Matriz multiplicada:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] * multiplicador + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}