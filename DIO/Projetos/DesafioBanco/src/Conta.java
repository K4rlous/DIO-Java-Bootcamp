public abstract  class Conta implements Iconta { // <- HERANÇA e ABSTRAÇÃO (também notável nos métodos!)
    // Abstrata pra não ser instanciada, Instancie uma conta corrente ou poupança!

    private  static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected  int agencia; // <- ENCAPSULAMENTO
    protected  int numero;
    protected  double saldo;
    protected Cliente cliente; // <- Vamos receber um objeto cliente como parâmetro de criação de conta!


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO; // <- Padronizamos a agência
        this.numero = SEQUENCIAL++; // <- Um valor sequencial que será incrementado ao criar 'contas' (tipo uma pk em baco de dados!)
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       sacar(valor); // <- Saco (kkkkkk) o valor dessa conta e deposito o valor em outra conta!
       contaDestino.depositar(valor);
    }

     protected  void exibirInformacoes() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }
}
