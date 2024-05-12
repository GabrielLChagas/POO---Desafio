import aplicacoes.appMusica.Ipod;
import aplicacoes.appMusica.RepodutorMusical;
import aplicacoes.appNavegado.Navegador;
import aplicacoes.appNavegado.NavegadorDeInternet;
import aplicacoes.appTelefone.AparelhoTelefonico;
import aplicacoes.appTelefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
        RepodutorMusical ipod = new Ipod();
            ipod.tocar();
            ipod.pausa();
            ipod.selecinarMusica();

        AparelhoTelefonico telefone = new Telefone();
            telefone.ligar();
            telefone.atender();
            telefone.iniciarCorreiVoz();

        NavegadorDeInternet navegador = new Navegador();
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
    }
}