package testes.unitarios.junit.banco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta("123",1000);

    @Test
    void validaOrdemDeChamada() {
        conta.pagaBoleto(300);

        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).lancaDebito(300);
    }

    void validaQuantidadeDeChamada() {
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyDouble());
    }

    @Test
    void validaValorTransferenciaExceptions() {
        Conta contaOrigem = new Conta("1234", 0);
        Conta contaDestino = new Conta("5678", 0);

        // Verificar se há Exceção
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            contaOrigem.transferenciaEntreContas(contaDestino, 0)
        );

        // Verificar se NÃO há Exceção
        Assertions.assertDoesNotThrow( () ->
            contaOrigem.transferenciaEntreContas(contaDestino, 10)
        );

    }

}
