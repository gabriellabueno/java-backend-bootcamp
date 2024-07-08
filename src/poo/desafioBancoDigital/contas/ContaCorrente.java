package poo.desafioBancoDigital.contas;

import poo.desafioBancoDigital.entidades.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA CORRENTE");
        super.extrato();
    }

}
