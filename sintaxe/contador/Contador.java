package sintaxe.contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o 1º parâmetro: " );
            int parametroUm = scanner.nextInt();
            System.out.print("Insira o 2º parâmetro: ");
            int parametroDois = scanner.nextInt();
            contar(parametroUm, parametroDois);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        System.out.println(parametroDois + " - " + parametroUm + " = " + contagem + "\nSerão impressos " + contagem + " números\n");


        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}