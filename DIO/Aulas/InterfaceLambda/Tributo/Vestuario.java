package dio.Aulas.InterfaceLambda.Tributo;

public class Vestuario implements Tributo {

    @Override
    public double retornarImposto(double valorProduto) {
        return valorProduto * 0.025;
    }

 
    
}
