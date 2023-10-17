package MidiaPlayer;

public class ReprodutorMusicalabst implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando musica selecionada");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a música");
    }
    
}
