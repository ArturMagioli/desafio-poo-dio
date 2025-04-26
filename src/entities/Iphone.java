package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    
    private boolean ligado = false;
    private boolean emLigacao = false;
    
    private boolean produzindoMusica = false;

    public Iphone() {
    }

    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean isEmLigacao() {
        return emLigacao;
    }
    public void setEmLigacao(boolean emLigacao) {
        this.emLigacao = emLigacao;
    }
    public boolean isProduzindoMusica() {
        return produzindoMusica;
    }
    public void setProduzindoMusica(boolean produzindoMusica) {
        this.produzindoMusica = produzindoMusica;
    }

    public void ligar(String numero) {
        System.out.println("Você está ligando para " + numero);
        //Supondo que a pessoa atendeu:
        setEmLigacao(true);
    }

    public void atender() {
        if (isLigado()) System.out.println("Você atendeu a ligação!");
        setEmLigacao(true);
    }

    public void inicarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }

    public void tocar() {
        if (isProduzindoMusica()) {
            System.out.println("Você já está reproduzindo música!");
            return;
        }
        if (isLigado()) {
            setProduzindoMusica(true);
            System.out.println("Reproduzindo música...");
        }
    }

    public void pausar() {
        if(!isProduzindoMusica()) {
            System.out.println("A música já está desligada!");
            return;
        }
        if (isLigado()) {
            setProduzindoMusica(false);
            System.out.println("Música pausada!");
        }
    }
    
    public void selecionarMusica(String musica) {
        if (isLigado()) {
            System.out.println("Você selecionou: " + musica);
        }
    }

    public void exibirPagina(String url) {
        if (isLigado()) {
            System.out.println("Exibindo a página: " + url);
        }
    }

    public void adicionarNovaAba() {
        if (isLigado()) {
            System.out.println("Nova aba adicionada!");
        }
    }

    public void atualizarPagina() {
        if (isLigado()) {
            System.out.println("Página atualizada");
        }
    }
}
