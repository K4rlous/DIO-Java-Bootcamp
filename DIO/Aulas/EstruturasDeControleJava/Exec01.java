package dio.Aulas.EstruturasDeControleJava;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        /*
         * Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " X " + numero + " = " + (i*numero));
        }
        scanner.close();
    }
}


