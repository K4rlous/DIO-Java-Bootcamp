package dio.Projetos.POO.src;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("tuts tuts tuts");

        iphone.ligar("9635366435");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("Google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    


        
    }
}
