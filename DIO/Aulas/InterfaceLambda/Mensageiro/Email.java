package dio.Aulas.InterfaceLambda.Mensageiro;

public class Email implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada através do E-mail: " + mensagem);

    }
    
}
