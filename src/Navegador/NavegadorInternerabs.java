package Navegador;

public class NavegadorInternerabs implements NavegadorNaInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
    
}
