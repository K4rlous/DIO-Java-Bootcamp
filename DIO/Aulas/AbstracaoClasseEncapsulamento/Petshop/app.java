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

/*
 * Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
Dar banho no pet;
Abastecer com água;
Abastecer com shampoo;
verificar nivel de água;
verificar nivel de shampoo;
verificar se tem pet no banho;
colocar pet na maquina;
retirar pet da máquina;
limpar maquina.
Siga as seguintes regras para implementação

A maquina de banho deve permitir somente 1 pet por vez;
Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
 */
