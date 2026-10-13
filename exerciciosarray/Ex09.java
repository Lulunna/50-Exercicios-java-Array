package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.printf("""
                Quantidade números positivos: %d
                Quantidade números negativos: %d
                Quantidade Zeros: %d
                """, positivos, negativos, zeros);

        sc.close();
    }
}



