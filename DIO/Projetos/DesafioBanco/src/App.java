import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");
        Cliente ana = new Cliente();
        ana.setNome("Ana");
        Conta cc = new ContaCorrente(carlos);
        Conta cp = new ContaPoupanca(ana);

        Cliente usuario = new Cliente();
        System.out.println("Bem vindo ao processo de criação de conta!");
        System.out.println("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        usuario.setNome(titular);

        System.out.println("\nEscolha o tipo de conta: 01 - Corrente | 02 - Poupança");
        Conta contaUsuario = null;
        int tipoConta = scanner.nextInt();
        scanner.nextLine(); // consumir \n pendente

        switch (tipoConta) {
            case 1 -> contaUsuario = new ContaCorrente(usuario);
            case 2 -> contaUsuario = new ContaPoupanca(usuario);
            default -> {
                System.out.println("Opção inválida, encerrando operação de criação de conta.");
                scanner.close();
                return;
            }
        }

        int opcao = -1;

        do {
            System.out.println("\n=== Menu Bancário ===");
            System.out.println("1 - Exibir Informações");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.println("======================");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> contaUsuario.exibirInformacoes();

                case 2 -> {
                    System.out.println("\nDigite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); 
                    contaUsuario.sacar(valorSaque);
                }

                case 3 -> {
                    System.out.println("\nDigite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); 
                    contaUsuario.depositar(valorDeposito);
                }

                case 4 -> {
                    System.out.println("\nDigite o valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.println("Escolha a conta destino: 01 - Carlos | 02 - Ana");
                    int escolhaConta = scanner.nextInt();
                    scanner.nextLine(); 

                    Conta contaDestino = null;
                    switch (escolhaConta) {
                        case 1 -> contaDestino = cc;
                        case 2 -> contaDestino = cp;
                        default -> {
                            System.out.println("Conta não encontrada, operação cancelada.");
                            continue;
                        }
                    }

                    contaUsuario.transferir(valorTransferencia, contaDestino);
                }

                case 0 -> System.out.println("Encerrando operação. Obrigado!");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
