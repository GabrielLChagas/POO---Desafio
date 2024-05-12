package aplicacoes.appNavegado;

public class Navegador implements NavegadorDeInternet {

    public void exibirPagina() {
        System.out.println("Inicar pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("ABRINDO ABA");
    }

    public void atualizarPagina() {
        System.out.println("REINICIADO ABA");
    }
}
