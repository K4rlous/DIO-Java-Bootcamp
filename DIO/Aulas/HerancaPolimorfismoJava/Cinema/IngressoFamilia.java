package dio.Aulas.HerancaPolimorfismoJava.Cinema;

public class IngressoFamilia extends Ingresso {
    protected int qtdPessoas;

    public IngressoFamilia(double valor, String nomeFilme, String dubOuLeg, int qtdPessoas) {
        super(valor, nomeFilme, dubOuLeg);
        this.qtdPessoas = qtdPessoas;
    }

    public double retornarValor(){
        double total = valor * qtdPessoas;
        if(qtdPessoas > 3){
            total -= total * 0.05;
        }
        return total;
    }
    
}
