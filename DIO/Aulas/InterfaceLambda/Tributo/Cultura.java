package dio.Aulas.InterfaceLambda.Tributo;

public class Cultura implements Tributo{

    @Override
    public double retornarImposto(double valorProduto) {
        return valorProduto * 0.04;
    }

    
    
}
