package dio.Aulas.HerancaPolimorfismoJava.Relogio;

public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void atualizarRelogio(Relogio outro) {
        this.hora = outro.getHora();
        this.minuto = outro.getMinuto();
        this.segundo = outro.getSegundo();
    }
}
