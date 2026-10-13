package flamingo.aprendendo.basico.exerciciosarray;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome do aluno");

            nomes[i] = sc.nextLine();
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        sc.close();
    }

}
