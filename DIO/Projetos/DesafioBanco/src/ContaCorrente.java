public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() { // <- Poderiamos implementar no pai: "Conta" (opcionalmente, já que o pai é abstrato então ele não obriga a implementação!)
        System.out.println("=== Extrato Conta Corrente ===");
        exibirInformacoes();
    }

   
   
}
