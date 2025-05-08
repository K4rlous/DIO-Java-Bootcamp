package dio.Aulas.InterfaceLambda.Tributo;

public class Alimentacao implements Tributo {

    @Override
    public double retornarImposto(double valorProduto) {
        return valorProduto * 0.01;
    }
    
}
