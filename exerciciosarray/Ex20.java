package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        boolean repetido = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }
        }

        if (repetido) {
            System.out.println("Existe número repetido");
        } else {
            System.out.println("Não existe número repetido");
        }

        sc.close();
    }
}
