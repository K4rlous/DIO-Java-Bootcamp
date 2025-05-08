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

/*
 * Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
 */
