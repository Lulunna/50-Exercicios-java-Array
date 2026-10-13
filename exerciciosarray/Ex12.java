package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o numeros para pesquisar: ");
        int numeroPesquisa = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeroPesquisa == numeros[i]) {
                System.out.println("Encontrado na posição: " + i);

                return;
        }
        }

        System.out.println("Não encontrado");


        sc.close();
    }
}
