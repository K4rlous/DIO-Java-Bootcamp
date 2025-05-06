package dio.Aulas.EstruturasDeControleJava;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        /*
         * Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números.
         * A execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão.
         * Números menores que o primeiro número devem ser ignorados.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inicial: ");
        int inicial = scanner.nextInt();
        int posterior;

        while (true) {
            System.out.println("Insira um número: ");
            posterior = scanner.nextInt();

            if (posterior < inicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue; // Continua o loop
            }

            if (posterior % inicial != 0) {
                System.out.println("Número não divisível por " + inicial + ". Encerrando...");
                break; // Para o loop
            }

            System.out.println("Número válido: " + posterior); // Continuação do loop
            scanner.close();
        }
    }
}
