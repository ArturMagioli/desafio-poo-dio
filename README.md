```mermaid
classDiagram
    class AparelhoTelefonico {
        #ligar(String numero)
        #atender()
        #iniciarCorreioVoz()
    }

    class Iphone {
    }

    class ReprodutorMusical {
        #tocar()
        #pausar()
        #SelecionarMusica(String musica)
    }

    class NavegadorInternet {
        #exibirPagina(String url)
        #adicionarNovaAba()
        #atualizarPagina()
    }

    <<interface>> AparelhoTelefonico
    <<interface>> ReprodutorMusical
    <<interface>> NavegadorInternet

    AparelhoTelefonico <|-- Iphone
    ReprodutorMusical <|-- Iphone
    NavegadorInternet <|-- Iphone
````