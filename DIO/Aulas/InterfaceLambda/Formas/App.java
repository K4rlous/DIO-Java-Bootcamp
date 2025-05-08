package dio.Aulas.InterfaceLambda.Formas;

public class App {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(5);
        Forma retangulo = new Retangulo(2, 4);
        Forma circulo = new Circulo(10);

        System.out.println("Área do quadrado: " + quadrado.retornarArea());
        System.out.println("Área do retângulo: " + retangulo.retornarArea());
        System.out.println("Área do cirulo: " + circulo.retornarArea());
    }
}

/*
 * Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter um método que retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:

Quadrado: possui o valor dos seus lados;
Retângulo: possui os valores de base e altura;
Circulor: possui o atributo raio.
 */