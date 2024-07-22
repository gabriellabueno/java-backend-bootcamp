package testes.unitarios.junit;

import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class BancoDeDadosTest {

    // Setup

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Teste", "12345678",
                LocalDate.of(2000, 1, 1)));
    }

    // Execução

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void desabilitarTesteWindows() {
        // Utilização do Assumptions
        /// Desabilita testes para Windows
        Assumptions.assumeFalse(System.getProperty("os.name").contains("Windows"));
    }

    // Cleanup

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Teste", "12345678",
            LocalDate.of(2000, 1, 1)));
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }


}
