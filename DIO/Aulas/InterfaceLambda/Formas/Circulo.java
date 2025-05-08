package dio.Aulas.InterfaceLambda.Formas;

public class Circulo implements Forma {
    protected double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double retornarArea() {
        return Math.PI * raio * raio;
    }


}
