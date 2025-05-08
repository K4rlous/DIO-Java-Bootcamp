package dio.Aulas.HerancaPolimorfismoJava.Relogio;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 23.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto deve estar entre 0 e 59.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo deve estar entre 0 e 59.");
        }
    }

    public String verHoras() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Método abstrato a ser implementado nas subclasses
    public abstract void atualizarRelogio(Relogio outro);
}
