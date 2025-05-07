package dio.Aulas.AbstracaoClasseEncapsulamento.Carro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para a esquerda");
            System.out.println("6 - Virar para a direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligarCarro();
                case 2 -> carro.desligarCarro();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> carro.virarEsquerda();
                case 6 -> carro.virarDireita();
                case 7 -> carro.verificarVelocidade();
                case 8 -> carro.trocarMarcha();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
