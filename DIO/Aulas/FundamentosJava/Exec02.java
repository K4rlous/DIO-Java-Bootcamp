package dio.Aulas.FundamentosJava;

import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
        /*
         * Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        double calculo = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é: " + calculo);
        scanner.close();
    }
}
