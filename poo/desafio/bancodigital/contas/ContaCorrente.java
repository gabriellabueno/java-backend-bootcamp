package poo.desafio.bancodigital.contas;

import poo.desafio.bancodigital.entidades.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA CORRENTE");
        super.extrato();
    }

}
