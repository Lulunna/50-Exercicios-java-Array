package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[4][3];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1));
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }

            double media = soma / notas[i].length;

            System.out.println("Média do aluno " + (i + 1) + ": " + media);
        }

        sc.close();
    }
}