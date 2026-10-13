package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int contador = 0;


        System.out.print("Digite o numeros para pesquisar: ");
        int numeroPesquisa = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeroPesquisa == numeros[i]) {
                contador ++;

        }
        }

        System.out.println("O numero aparece " + contador + " vezes.");


        sc.close();
    }
}
