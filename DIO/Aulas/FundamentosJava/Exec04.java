package dio.Aulas.FundamentosJava;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        /*
         * Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade2 = scanner.nextInt();

        // Workaround pro valor não ficar negativo kkkkkkk
        int calculo = idade1 - idade2;
        if (calculo < 0){
            calculo = idade2 - idade1;
        }

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de: " + calculo + " anos!");
        scanner.close();
    }
}
