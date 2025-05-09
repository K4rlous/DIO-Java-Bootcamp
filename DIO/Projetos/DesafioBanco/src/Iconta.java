public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
    // Esse método recebe uma conta genérica, isso é, ela pode ser poupança ou corrente
    // Justamente porque ambas contas são "filhas" da Conta declarada aqui! - POLIMORFISMO

    void imprimirExtrato();
}
