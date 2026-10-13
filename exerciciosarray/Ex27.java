package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i + 1));
            nomes[i] = sc.nextLine();
        }

        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            if (Character.toUpperCase(nomes[i].charAt(0)) == 'A') {
                contador++;
            }
        }

        System.out.println("Nomes que começam com A: " + contador);

        sc.close();
    }
}