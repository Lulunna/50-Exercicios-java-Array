package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double media, soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %dº nota: ", i + 1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.println("Media do aluno = " + media);

        for (int i = 0; i < notas.length; i++){
            if (notas[i] >= media){
                System.out.println("Na media : " + notas[i]);
            } else {
                System.out.println("Fora da media: " + notas[i]);
            }
        }

        sc.close();
    }
}
