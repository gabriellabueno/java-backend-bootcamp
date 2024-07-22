package poo.desafio.bancodigital;

import poo.desafio.bancodigital.contas.ContaCorrente;
import poo.desafio.bancodigital.contas.ContaPoupanca;
import poo.desafio.bancodigital.entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente Fulano = new Cliente();
        Fulano.setNome("Fulano");

        ContaCorrente cc = new ContaCorrente(Fulano);
        ContaPoupanca cp = new ContaPoupanca(Fulano);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();

        cp.imprimirExtrato();

    }
}
