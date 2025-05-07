package dio.Aulas.AbstracaoClasseEncapsulamento.ContaBancaria;

import java.util.Scanner;

public class Conta {
    private double saldo;
    private final double chequeEspecial;
    private double taxa;

    public Conta(double saldo) {
        if (saldo <= 500) {
            chequeEspecial = 50;
        } else {
            chequeEspecial = saldo / 2;
        }
        this.saldo = saldo;
        this.taxa = 0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque especial disponível: R$ " + chequeEspecial);
    }

    public void depositarDinheiro(Scanner scanner) {
        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            saldo += valor;
            if (taxa > 0) {
                if (saldo >= taxa) {
                    saldo -= taxa;
                    System.out.println("Taxa de R$ " + taxa + " foi descontada após depósito.");
                    taxa = 0;
                } else {
                    System.out.println("Depósito insuficiente para cobrir a taxa de R$ " + taxa);
                }
            }
            System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Operação cancelada! Valor inválido.");
        }
    }

    public void sacarDinheiro(Scanner scanner) {
        System.out.print("Digite o valor a ser sacado: ");
        double valor = scanner.nextDouble();

        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            if (saldo < 0) {
                taxa = -saldo * 0.2;
                System.out.println("Você utilizou o cheque especial. Taxa de R$ " + taxa + " será cobrada futuramente.");
            }
            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente! Operação cancelada.");
        }
    }

    public void pagarBoleto(Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Digite o código do boleto: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite o valor do boleto: ");
        double valor = scanner.nextDouble();

        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            if (saldo < 0) {
                taxa = -saldo * 0.2;
                System.out.println("Você utilizou o cheque especial. Taxa de R$ " + taxa + " será cobrada futuramente.");
            }
            System.out.println("Boleto " + codigo + " de R$ " + valor + " pago com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
    }

    public void verificarChequeEspecial() {
        if (saldo < 0) {
            System.out.println("Você está utilizando o cheque especial. Taxa atual: R$ " + taxa);
        } else {
            System.out.println("Você não está utilizando o cheque especial.");
        }
    }
}
