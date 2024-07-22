package poo.desafio.bancodigital.contas;

import poo.desafio.bancodigital.entidades.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA POUPANÇA");
        super.extrato();
    }

}
