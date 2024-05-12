package aplicacoes.appMusica;

public class Ipod implements RepodutorMusical {
    public void tocar() {
        System.out.println("INICIAR MUSÍCA");
    }

    public void pausa() {
        System.out.println("PAUSANDO A MUSÍCA");
    }

    public void selecinarMusica() {
        System.out.println("SELECIAR MUSÍCA");
    }
}
