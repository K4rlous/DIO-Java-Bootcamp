public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() { // <- Poderiamos implementar no pai: "Conta" (opcionalmente, já que o pai é abstrato então ele não obriga a implementação!)
        System.out.println("=== Extrato Conta Poupança ===");
        exibirInformacoes();
    }
   
}