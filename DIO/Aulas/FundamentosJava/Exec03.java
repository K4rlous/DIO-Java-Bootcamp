package dio.Aulas.FundamentosJava;

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {
        /*
         * Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é de: " + area);
        scanner.close();
    }
}
