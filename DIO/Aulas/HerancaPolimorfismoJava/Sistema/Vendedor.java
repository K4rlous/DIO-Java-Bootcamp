package dio.Aulas.HerancaPolimorfismoJava.Sistema;

import java.util.Scanner;

public class Vendedor extends Funcionario {
    private final boolean administrador = false;
    protected int qtdVendas;

    public Vendedor(String nome, String email, String senha, int qtdVendas) {
        super(nome, email, senha);
        this.qtdVendas = qtdVendas;
    }

    public void realizarVenda(){
        qtdVendas++;
        System.out.println("Venda realizada!");
    }

    public int consultarVendas(){
        return qtdVendas;
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

    public int getQtdvendas(){
        return qtdVendas;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setEmail(String novoEmail){
        email = novoEmail;
    }

    public void setQtdvendas(int novoVendas){
        qtdVendas = novoVendas;
    }

    @Override
    public boolean administrador() {
        return administrador;
    }
    
}
