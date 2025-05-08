package dio.Aulas.InterfaceLambda.Formas;

public class Quadrado implements Forma {
    protected double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double retornarArea() {
        return lado * lado;
    }
}
