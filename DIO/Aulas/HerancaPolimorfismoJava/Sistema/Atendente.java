package dio.Aulas.HerancaPolimorfismoJava.Sistema;

import java.util.Scanner;

public class Atendente extends Funcionario {
    private final boolean administrador = false;
    protected double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamento(double valor){
        valorEmCaixa += valor;
        System.out.println("Pagamento de: " + valor + " recebido com sucesso");
        System.out.println("Valor no caixa: " + valorEmCaixa);
    }

    public void fecharCaixa(){
        System.out.println("Caixa fechado");
    }

     public void realizarLogin(Scanner scanner){
        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();
        if(password.equals(senha)){
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Senha incorreta");
        }
    }

    public void realizarLogoff(){
        System.out.println("Logoff realizado com sucesso");
    }

    public void alterarDados(){
        System.out.println("Imagine um menu muito legal aqui :) ");
    }

    public void alterarSenha(Scanner scanner){
        System.out.println("Confirme sua senha: ");
        String password = scanner.nextLine();
        if(password.equals(senha)){
            System.out.println("Digite sua nova senha: ");
            String newPassword = scanner.nextLine();
            senha = newPassword;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha incorreta");
        }
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public double getValorEmCaixa(){
        return valorEmCaixa;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setEmail(String novoEmail){
        email = novoEmail;
    }

    public void setValorEmCaixa(double valor){
        valorEmCaixa = valor;
    }

    @Override
    public boolean administrador() {
        return administrador;
    }
    
}
