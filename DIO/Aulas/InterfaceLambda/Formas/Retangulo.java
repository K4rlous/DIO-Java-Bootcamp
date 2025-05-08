package dio.Aulas.InterfaceLambda.Formas;

public class Retangulo implements Forma {
    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double retornarArea() {
       return base * altura;
    }
    
}
