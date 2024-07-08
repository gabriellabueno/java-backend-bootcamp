package poo.desafioBancoDigital.contas;

import poo.desafioBancoDigital.entidades.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA POUPANÇA");
        super.extrato();
    }

}
