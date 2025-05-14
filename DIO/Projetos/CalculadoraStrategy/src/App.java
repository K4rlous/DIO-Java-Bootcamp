public class App {
    public static void main(String[] args) throws Exception {

        CalculadoraContexto calculadora = new CalculadoraContexto(null);

        calculadora.setEstrategia(new Soma());
        System.out.println(calculadora.executarOperacao(12, 21));

        calculadora.setEstrategia(new Multiplicacao());
        System.out.println(calculadora.executarOperacao(20, 5));




        };
    }

