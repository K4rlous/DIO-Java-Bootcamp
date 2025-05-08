package dio.Aulas.InterfaceLambda.Mensageiro;

public class Whatsapp implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada através do WhatsApp: " + mensagem);
    }
    
}
