package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz digitada:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}