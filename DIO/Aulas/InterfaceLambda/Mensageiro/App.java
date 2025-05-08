package dio.Aulas.InterfaceLambda.Mensageiro;

public class App {
    public static void main(String[] args) {
        ServicoMensagem sms = new SMS();
        ServicoMensagem email = new Email();
        ServicoMensagem redesSociais = new RedesSociais();
        ServicoMensagem whatsapp = new Whatsapp();

        sms.enviarMensagem("Olá");
        email.enviarMensagem("Oi");
        redesSociais.enviarMensagem("Alguma coisa claramente mentirosa...");
        whatsapp.enviarMensagem("Fake news");
    }
}

/*
 * Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes, esses serviços devem ter um método para receber a mensagem como parâmetro, os serviços que devem estar disponíveis são:

SMS;
E-mail;
Redes Sociais;
WhatsApp;
 */
