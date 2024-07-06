package poo.desafio;

import poo.desafio.produtos.IPhone;

public class Apple {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("Iniciando seu novo iPhone...\n");

        System.out.println("INTERNET");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.dio.me");
        iphone.atualizarPagina();

        System.out.println("\nCHAMADAS");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("11 9999-9999");

    System.out.println("\nMÚSICAS");
        iphone.selecionarMusica("Gojira - Love");
        iphone.tocar();
        iphone.pausar();
    }
}