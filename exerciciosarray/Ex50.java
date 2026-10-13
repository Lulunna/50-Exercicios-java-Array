package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] estoque = new int[3][5];
        int maiorTotal = 0;
        int melhorLoja = 0;

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.println("Digite a quantidade do produto " + (j + 1) + " na loja " + (i + 1));
                estoque[i][j] = sc.nextInt();
            }
        }

        System.out.println("Total de produtos por loja:");

        for (int i = 0; i < estoque.length; i++) {
            int totalLoja = 0;
            for (int j = 0; j < estoque[i].length; j++) {
                totalLoja += estoque[i][j];
            }

            System.out.println("Loja " + (i + 1) + ": " + totalLoja);

            if (totalLoja > maiorTotal) {
                maiorTotal = totalLoja;
                melhorLoja = i;
            }
        }

        System.out.println("Total de cada produto somando todas as lojas:");

        for (int j = 0; j < estoque[0].length; j++) {
            int totalProduto = 0;
            for (int i = 0; i < estoque.length; i++) {
                totalProduto += estoque[i][j];
            }
            System.out.println("Produto " + (j + 1) + ": " + totalProduto);
        }

        System.out.println("A loja com mais produtos no estoque é a loja "
                + (melhorLoja + 1) + " com " + maiorTotal + " unidades");

        sc.close();
    }
}