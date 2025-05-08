package dio.Aulas.InterfaceLambda.Mensageiro;

public class RedesSociais implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada através das redes sociais: " + mensagem);
    }
    
}
