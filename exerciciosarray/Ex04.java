package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double media, soma = 0;

        for(int i = 0; i < notas.length; i ++){
            System.out.printf("Digite a %dº nota: ", i + 1);
            notas[i] = sc.nextDouble();

            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.printf("%.2f / %d = %.2f", soma, notas.length, media);

        sc.close();

    }

}
