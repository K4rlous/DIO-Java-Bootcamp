package dio.Aulas.HerancaPolimorfismoJava.Cinema;

public class App {
    public static void main(String[] args) {

        MeiaEntrada meia = new MeiaEntrada(20, "Algo bom", "DUB");
        System.out.println(meia.retornarValor());

        IngressoFamilia familia = new IngressoFamilia(20, "Algo ruim", "LEG", 4);
        System.out.println(familia.retornarValor());
    }
}

/*
 * Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.
 */