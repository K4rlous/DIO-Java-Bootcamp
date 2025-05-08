package dio.Aulas.HerancaPolimorfismoJava.Sistema;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        // Gerente gerente = new Gerente("Carlos", "Carlos@gmail.com", "11331");
        // gerente.gerarRelatorio();
        // gerente.consultarVendas();
        // gerente.realizarLogin(scanner);
        // gerente.alterarDados();
        // gerente.alterarSenha(scanner);
        // System.out.println(gerente.administrador());

        // Vendedor vendedor = new Vendedor("Fulano", "Fulano@gmail.com", "3311", 100);
        // vendedor.realizarVenda();
        // System.out.println(vendedor.consultarVendas());
        // vendedor.realizarLogin(scanner);
        // vendedor.realizarLogoff();
        // vendedor.alterarDados();
        // vendedor.alterarSenha(scanner);
        // System.out.println(vendedor.administrador());

        // Atendente atendente = new Atendente("Beltrana", "Beltrana@gmail.com", "331", 2000);
        // atendente.receberPagamento(300);
        // atendente.fecharCaixa();
        scanner.close();
    }
}

/*
 * Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:

Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro;
Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse útimo deve ser sempre falso;
Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.
Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos

A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;
 */