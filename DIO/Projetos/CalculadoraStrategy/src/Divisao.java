public class Divisao implements Calculadora {

    @Override
    public double calcular(double a, double b) {
       if(b == 0){
        throw new ArithmeticException("Não é possível dividir por 0!");
       }
       return a/b;
    
}
}