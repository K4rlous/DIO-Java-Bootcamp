package dio.Aulas.HerancaPolimorfismoJava.Cinema;

public class Ingresso {
    protected double valor;
    protected  String nomeFilme;
    protected String dubOuLeg;
    
    public Ingresso(double valor, String nomeFilme, String dubOuLeg) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dubOuLeg = dubOuLeg;
    }

}
