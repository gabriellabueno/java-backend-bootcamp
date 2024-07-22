package testes.unitarios.junit.banco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import testes.unitarios.junit.CadastroPessoa;
import testes.unitarios.junit.Pessoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiCorreios apiCorreios;

    @InjectMocks
    private CadastroPessoa cadastroPessoa;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "São Paulo", "Rua 2", "Apto 31", "Centro");
        Mockito.when(apiCorreios.buscaDadosPorCep("7878787")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastroPessoa.cadastrarPessoa("Teste", "12345678", LocalDate.now(), "7878787");

        assertEquals("Teste", pessoa.getNome());
        assertEquals("12345678", pessoa.getDocumento());
        assertEquals("SP", pessoa.getEndereco().getUf());
        assertEquals("Apto 31", pessoa.getEndereco().getComplemento());

    }

}
