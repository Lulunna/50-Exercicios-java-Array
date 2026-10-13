package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i + 1));
            nomes[i] = sc.nextLine();
        }

        boolean encontrou = false;

        System.out.println("Nomes com mais de 5 letras:");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > 5) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum nome com mais de 5 letras");
        }

        sc.close();
    }
}