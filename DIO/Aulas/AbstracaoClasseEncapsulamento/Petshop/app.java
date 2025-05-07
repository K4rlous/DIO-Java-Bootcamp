package dio.Aulas.AbstracaoClasseEncapsulamento.Petshop;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        MaquinaDeBanho maquina = new MaquinaDeBanho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Colocar pet na máquina");
            System.out.println("2 - Retirar pet da máquina");
            System.out.println("3 - Dar banho no pet");
            System.out.println("4 - Limpar máquina");
            System.out.println("5 - Abastecer água (2L)");
            System.out.println("6 - Abastecer shampoo (2L)");
            System.out.println("7 - Verificar nível de água");
            System.out.println("8 - Verificar nível de shampoo");
            System.out.println("9 - Verificar se há pet na máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> maquina.colocarPet();
                case 2 -> maquina.retirarPet();
                case 3 -> maquina.darBanho();
                case 4 -> maquina.limparMaquina();
                case 5 -> maquina.abastecerAgua();
                case 6 -> maquina.abastecerShampoo();
                case 7 -> maquina.verificarNivelAgua();
                case 8 -> maquina.verificarNivelShampoo();
                case 9 -> maquina.verificarPetNaMaquina();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
