package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double[] notas = new double[8];

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota do aluno: ");
                notas[i] = sc.nextDouble();
            }

            int aprovados = 0;
            int reprovados = 0;

            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= 7) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

        System.out.println("Aprovados: " + aprovados + "\nReprovados: " + reprovados);

        sc.close();
        }
    }