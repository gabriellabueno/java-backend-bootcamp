package poo.desafio.iphone.produtos;

import poo.desafio.iphone.utilitarios.AparelhoTelefonico;
import poo.desafio.iphone.utilitarios.Navegador;
import poo.desafio.iphone.utilitarios.ReprodutorMusical;

public class IPhone implements Navegador, AparelhoTelefonico, ReprodutorMusical {

    // NAVEGADOR
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    // APARELHO TELEFÔNICO
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // REPRODUTOR MUSICAL
    public void tocar() {
        System.out.println("Tocando música.");
    }
    public void pausar() {
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("A música \"" + musica + "\" foi selecionada.");
    }
}

