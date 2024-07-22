package poo.desafio.iphone.produtos;

import poo.desafio.iphone.utilitarios.ReprodutorMusical;

public class IPod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música.");
    }
    public void pausar() {
        System.out.println("Musica pausada.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("A musica \"" + musica + "\" foi selecionada.");
    }

}
