package poo.desafioBancoDigital;

import poo.desafioBancoDigital.contas.ContaCorrente;
import poo.desafioBancoDigital.contas.ContaPoupanca;
import poo.desafioBancoDigital.entidades.Cliente;

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
