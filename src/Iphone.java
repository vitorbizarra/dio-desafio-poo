import apps.musica.Spotify;
import apps.navegador.Chrome;
import apps.telefone.Telefone;
import interfaces.AppMusica;
import interfaces.AppNavegador;
import interfaces.AppTelefone;

public class Iphone {

    public AppMusica appMusica() {
        return new Spotify();
    }

    public AppTelefone appTelefone() {
        return new Telefone();
    }

    public AppNavegador appNavegador() {
        return new Chrome();
    }

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("\nApp Música");
        iphone.appMusica().selecionarMusica("The Smiths - There Is a Light That Never Goes Out");
        iphone.appMusica().tocar();
        iphone.appMusica().pausar();

        System.out.println("\nApp Telefone");
        iphone.appTelefone().atender();
        iphone.appTelefone().ligar("15999999999");
        iphone.appTelefone().iniciarCorreioVoz();

        System.out.println("\nApp Navegador");
        iphone.appNavegador().adicionarNovaAba();
        iphone.appNavegador().exibirPagina("google.com");
        iphone.appNavegador().atualizarPagina();

    }
}
