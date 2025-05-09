## 📱 Diagrama UML - Componente iPhone

```plantuml
@startuml
interface ReprodutorMusical {
    +void tocar()
    +void pausar()
    +void selecionarMusica(String musica)
}

interface AparelhoTelefonico {
    +void ligar(String numero)
    +void atender()
    +void iniciarCorreioVoz()
}

interface NavegadorInternet {
    +void exibirPagina(String url)
    +void adicionarNovaAba()
    +void atualizarPagina()
}

class Iphone

Iphone ..|> ReprodutorMusical
Iphone ..|> AparelhoTelefonico
Iphone ..|> NavegadorInternet
@enduml
