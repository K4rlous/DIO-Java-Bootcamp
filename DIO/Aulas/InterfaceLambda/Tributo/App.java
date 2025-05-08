package dio.Aulas.InterfaceLambda.Tributo;

public class App {
    public static void main(String[] args) {
        Tributo alimentacao = new Alimentacao();
        Tributo saudeBemEstar = new SaudeBemEstar();
        Tributo vestuario = new Vestuario();
        Tributo cultura = new Cultura();

        double valorProduto = 100;

        System.out.println("Imposto em alimentação (em porcentagem): " + alimentacao.retornarImposto(valorProduto));
        System.out.println("Imposto em saude e bem estar (em porcentagem): " + saudeBemEstar.retornarImposto(valorProduto));
        System.out.println("Imposto em vestuário (em porcentagem): " + vestuario.retornarImposto(valorProduto));
        System.out.println("Imposto em cultura (em porcentagem): " + cultura.retornarImposto(valorProduto));
    }
}

/*
 * Escreva um código que calcule o valor de tributos de produtos, os produtos disponíveis devem ser dos seguintes tipos: Alimentação, Saude e bem estar, Vestuário e Cultura. Todos os produtos devem ter um método para retornar o seu valor de imposto, de acordo com seu tipo:

Alimentação 1%;
Saude e bem estar 1.5%;
Vestuário 2.5%;
Cultura 4%.
 */