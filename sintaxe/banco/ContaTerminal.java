package sintaxe.banco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira os dados solicitados abaixo");

        System.out.print("NÚMERO DA CONTA: ");
        int numero = scanner.nextInt();
        System.out.print("NOME: ");
        String nomeCliente = scanner.next();
        System.out.print("AGÊNCIA: ");
        String agencia = scanner.next();
        System.out.print("SALDO: ");
        double saldo = scanner.nextDouble();

        Conta c1 = new Conta(numero, agencia, nomeCliente, saldo);
        c1.mensagemSaudacao();

        scanner.close();


    }
}