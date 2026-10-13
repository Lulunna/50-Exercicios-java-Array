package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double maiorTotal = 0;
        int melhorVendedor = 0;

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.println("Digite o valor da venda " + (j + 1) + " do vendedor " + (i + 1));
                vendas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < vendas.length; i++) {
            double total = 0;
            for (int j = 0; j < vendas[i].length; j++) {
                total += vendas[i][j];
            }

            System.out.println("Total do vendedor " + (i + 1) + ": R$ " + total);

            if (total > maiorTotal) {
                maiorTotal = total;
                melhorVendedor = i;
            }
        }

        System.out.println("O vendedor que mais vendeu foi o vendedor "
                + (melhorVendedor + 1) + " com R$ " + maiorTotal);

        sc.close();
    }
}