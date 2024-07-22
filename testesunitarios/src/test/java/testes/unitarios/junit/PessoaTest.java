package testes.unitarios.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PessoaTest {

    //@DisplayName("A")
    @DisplayName("Validação retorno da condição de maior idade")
    @Order(2)
    @Test
    void retornarSeMaiorDeIdade() {
        Pessoa pessoaTeste = new Pessoa("Teste", "12345678",  LocalDate.of(2000, 1, 1));
        assertTrue(pessoaTeste.eMaiorDeIdade());
    }

    //@DisplayName("A")
    @DisplayName("Validação do cálculo de idade")
    @Order(1)
    @Test
    void calcularIdade() {
        Pessoa pessoaTeste = new Pessoa("Teste", "12345678", LocalDate.of(2000, 1, 1));
        assertEquals(24, pessoaTeste.getIdade());
    }



}
