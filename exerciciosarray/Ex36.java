package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Digite o valor da posição [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;

            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }

            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }

        sc.close();
    }
}