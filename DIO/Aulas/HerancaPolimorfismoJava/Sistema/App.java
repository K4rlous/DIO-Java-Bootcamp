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
