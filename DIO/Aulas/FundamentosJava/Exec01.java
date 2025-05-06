package dio.Aulas.FundamentosJava;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        /*
         * Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
         */
        int anoAtual = 2025;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Em que ano você nasceu?: ");
        int anoNascimento = scanner.nextInt();
        int calculo = anoAtual - anoNascimento;
        System.out.println("Olá, " + nome + ", você tem " + calculo + " anos.");
        scanner.close();
    }
}
