package Telefonia;

public class AparelhoTelefonicoabs implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando para o numero...");
    }

    @Override
    public void atender() {
        System.out.println("Em chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
    
}
