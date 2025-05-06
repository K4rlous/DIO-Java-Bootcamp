package dio.Aulas.EstruturasDeControleJava;

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {
        /*
         * Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e ímpar,
         * com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, 
         * incluindo os números informados e em ordem decrescente;
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite um número maior que o número anterior: ");
        int n2 = scanner.nextInt();

        System.out.println("Escolha: 0 - PAR | 1 - IMPAR");
        int escolha = scanner.nextInt();

        if (escolha == 0) {
            // Exibir números pares em ordem decrescente
            for (int i = n2; i >= n1; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            // Exibir números ímpares em ordem decrescente
            for (int i = n2; i >= n1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
