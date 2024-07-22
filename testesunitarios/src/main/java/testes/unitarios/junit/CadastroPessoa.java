package testes.unitarios.junit;

import testes.unitarios.junit.banco.ApiCorreios;
import testes.unitarios.junit.banco.DadosLocalizacao;

import java.time.LocalDate;

public class CadastroPessoa {

    private ApiCorreios apiCorreios;

    public CadastroPessoa(final ApiCorreios apiCorreios) {
        this.apiCorreios = apiCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiCorreios.buscaDadosPorCep(cep);
        pessoa.adicionaDadosEndereco(dadosLocalizacao);
        return pessoa;
    }

}