package aplicacoes.appTelefone;

public class Telefone implements AparelhoTelefonico {

    public void ligar() {
        System.out.println("LIGANDO");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreiVoz() {
        System.out.println("DEIXE UM RECADO APÓS O SINAL");
    }
}
