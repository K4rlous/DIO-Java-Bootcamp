package dio.Aulas.InterfaceLambda.Mensageiro;

public class SMS implements ServicoMensagem{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada através de SMS: " + mensagem);
    }
    
}
