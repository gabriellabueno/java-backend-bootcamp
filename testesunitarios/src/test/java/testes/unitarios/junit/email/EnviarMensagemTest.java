package testes.unitarios.junit.email;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

   @Spy
    private EnviarMensagem enviarMensagem;

   @Test
    void verificarComportamentoDaClasse() {
       Mockito.verifyNoInteractions(enviarMensagem);

       Mensagem message = new Mensagem("Mensagem teste");
       enviarMensagem.adicionarMensagem(message);
       Mockito.verify(enviarMensagem).adicionarMensagem(message);
       Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
   }

}
