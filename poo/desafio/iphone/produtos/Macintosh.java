package poo.desafio.iphone.produtos;
import poo.desafio.iphone.utilitarios.Navegador;

public class Macintosh implements Navegador {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}

