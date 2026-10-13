package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número que deseja pesquisar");

        int pesquisado = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == pesquisado) {
                    encontrado = true;
                    System.out.println("Número encontrado na linha " + i + " e coluna " + j);
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado");
        }

        sc.close();
    }
}