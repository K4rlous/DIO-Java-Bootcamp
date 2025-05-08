package dio.Aulas.HerancaPolimorfismoJava.Relogio;

public class RelogioAmericano extends Relogio {
    private boolean isAM;

    public RelogioAmericano(int hora, int minuto, int segundo, boolean isAM) {
        super(hora % 12 == 0 ? 12 : hora % 12, minuto, segundo);
        this.isAM = isAM;
    }

    @Override
    public String verHoras() {
        String periodo = isAM ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, periodo);
    }

    @Override
    public void atualizarRelogio(Relogio outro) {
        int h = outro.getHora();
        this.isAM = h < 12;
        this.hora = h % 12 == 0 ? 12 : h % 12;
        this.minuto = outro.getMinuto();
        this.segundo = outro.getSegundo();
    }
}
