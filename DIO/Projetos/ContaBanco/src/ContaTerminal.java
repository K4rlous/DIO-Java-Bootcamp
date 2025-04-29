import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem-vindo ao processo de abertura de conta no Banco!");
        System.out.println("Por favor, digite o seu nome! (Exemplo: MARIO ANDRADE)");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta! (EXEMPLO: 1021)");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência! (EXEMPLO: 067-8)");
        scanner.nextLine();
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo! (EXEMPLO: 237.48)");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo de " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
