package testes.unitarios.junit.banco;

public class Conta {

    private final String numeroConta;
    private double saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void pagaBoleto(double valorPago) {
        validaSaldo(valorPago);
        lancaDebito(valorPago);

    }

    public void validaSaldo(double valorPago) {
        if(valorPago > saldo)
            throw new IllegalStateException("Saldo insuficiente");
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void lancaCredito(double valor) {
        this.saldo += valor;
    }

    public void lancaDebito(double valor) {
        this.saldo -= valor;
    }

    public void transferenciaEntreContas(Conta contaDestino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
        }
        contaDestino.lancaCredito(valor);
        this.lancaDebito(valor);
    }
}
