package dio.Aulas.HerancaPolimorfismoJava.Sistema;

public abstract  class Funcionario {
    protected String nome;
    protected String email;
    protected String senha;

    public Funcionario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract boolean administrador();
}
