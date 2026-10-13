package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1));
            nomes[i] = sc.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Digite a nota " + (j + 1) + " de " + nomes[i]);
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("Boletim:");

        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;

            System.out.print("Aluno: " + nomes[i] + " | Notas: ");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }

            double media = soma / notas[i].length;
            String situacao;

            if (media >= 7) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("| Média: " + media + " | Situação: " + situacao);
        }

        sc.close();
    }
}