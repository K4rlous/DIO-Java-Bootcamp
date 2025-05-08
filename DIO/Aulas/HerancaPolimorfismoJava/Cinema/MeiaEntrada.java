package dio.Aulas.HerancaPolimorfismoJava.Cinema;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, String dubOuLeg) {
        super(valor, nomeFilme, dubOuLeg);
    }
    
    public double retornarValor(){
        double preco = valor / 2;
        return preco;
    }
}
