package dio.Aulas.InterfaceLambda.Tributo;

public class SaudeBemEstar implements Tributo{

    @Override
    public double retornarImposto(double valorProduto) {
        return valorProduto * 0.015;
    }

 
    
}
