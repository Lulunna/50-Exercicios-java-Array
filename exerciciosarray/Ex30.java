package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidades = new int[5];
        boolean encontrou = false;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1));
            produtos[i] = sc.nextLine();
            System.out.println("Digite a quantidade em estoque de " + produtos[i]);
            quantidades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Produtos com estoque abaixo de 5 unidades:");

        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println(produtos[i] + " - " + quantidades[i] + " unidade(s)");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto com estoque baixo");
        }

        sc.close();
    }
}