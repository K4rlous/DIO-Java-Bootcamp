package dio.Aulas.HerancaPolimorfismoJava.Sistema;

import java.util.Scanner;

public class Gerente extends Funcionario{
    private final boolean administrador = true;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    
    public void gerarRelatorio(){
        System.out.println("Relatório Gerado");
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas");
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

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setEmail(String novoEmail){
        email = novoEmail;
    }

    @Override
    public boolean administrador() {
        return administrador;
    }
}
