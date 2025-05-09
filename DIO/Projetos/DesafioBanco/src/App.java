public class App {
    public static void main(String[] args) throws Exception {

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");
        Cliente ana = new Cliente();
        ana.setNome("Ana");
        
        Conta cc = new ContaCorrente(carlos); // <- O construtor já gera agência e numero mas precisa de um "cliente"!
        Conta cp = new ContaPoupanca(ana);

        cc.imprimirExtrato();
        cc.depositar(300);
        cc.transferir(46, cp);
        cc.imprimirExtrato();

        cp.imprimirExtrato();


    }
}
