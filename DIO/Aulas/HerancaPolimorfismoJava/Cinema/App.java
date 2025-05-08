package dio.Aulas.HerancaPolimorfismoJava.Cinema;

public class App {
    public static void main(String[] args) {

        MeiaEntrada meia = new MeiaEntrada(20, "Algo bom", "DUB");
        System.out.println(meia.retornarValor());

        IngressoFamilia familia = new IngressoFamilia(20, "Algo ruim", "LEG", 4);
        System.out.println(familia.retornarValor());
    }
}
