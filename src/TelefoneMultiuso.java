import MidiaPlayer.ReprodutorMusical;
import Navegador.NavegadornaInternet;
import Telefonia.AparelhoTelefonico;

public class TelefoneMultiuso implements AparelhoTelefonico, ReprodutorMusical, NavegadornaInternet{

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Telefone tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música!");
    }

}
