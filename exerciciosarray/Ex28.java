package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String[] nomes = new String[5];
            double[] notas = new double[5];

            for (int i = 0; i < nomes.length; i++) {

                System.out.println("Digite o nome do aluno " + (i + 1));
                nomes[i] = sc.nextLine();

                System.out.println("Digite a nota de " + nomes[i]);
                notas[i] = sc.nextDouble();
                sc.nextLine();
            }

            System.out.println("Relatório de alunos:");

            for (int i = 0; i < nomes.length; i++) {

                String situacao;

                if (notas[i] >= 7) {
                    situacao = "Aprovado";
                } else {
                    situacao = "Reprovado";
                }

                System.out.println("Nome: " + nomes[i] + " | Nota: " + notas[i] + " | Situação: " + situacao);
            }

            sc.close();
        }
    }