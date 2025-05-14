public class CalculadoraContexto {
    private Calculadora calculadora;
    
    public CalculadoraContexto(Calculadora estrategia) {
    this.calculadora = estrategia;

}

    public void setEstrategia(Calculadora estrategia) {
    this.calculadora = estrategia;
}

    public double executarOperacao(double a, double b) {
    return calculadora.calcular(a, b);
}


}

