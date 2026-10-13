package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.next();
        }

        System.out.print("Digite o nome para pesquisar: ");
        String nomePesquisado = sc.next();

        for (int i = 0; i < nomes.length; i++) {
            if (nomePesquisado.equals(nomes[i])) {
                System.out.println("Encontrado");
                sc.close();
                return;
        }
        }

        System.out.println("Não encontrado");


        sc.close();
    }
}
