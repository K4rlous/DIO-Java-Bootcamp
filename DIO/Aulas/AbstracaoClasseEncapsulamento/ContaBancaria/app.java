package dio.Aulas.AbstracaoClasseEncapsulamento.ContaBancaria;

import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println("Digite o valor do deposíto inicial da conta: ");
        double valor = scanner.nextDouble();
        Conta conta = new Conta(valor);

        do { 
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> conta.depositarDinheiro(scanner);
                case 4 -> conta.sacarDinheiro(scanner);
                case 5 -> conta.pagarBoleto(scanner);
                case 6 -> conta.verificarChequeEspecial();
            }
        } while (opcao != 0);
        scanner.close();
    }
}
