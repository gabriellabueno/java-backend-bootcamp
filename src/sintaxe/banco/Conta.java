package sintaxe.banco;

public class Conta {

    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;

    public Conta(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void mensagemSaudacao() {
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! \n\n" +
                "Sua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo " + String.format("R$ %,.2f", saldo) + " já está disponível para saque.");
    }
}