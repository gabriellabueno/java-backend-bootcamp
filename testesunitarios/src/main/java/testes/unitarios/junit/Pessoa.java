package testes.unitarios.junit;

import testes.unitarios.junit.banco.DadosLocalizacao;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private DadosLocalizacao endereco;

    public Pessoa(final String nome, final String documento, final LocalDate dataNascimento) {
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }

    public void adicionaDadosEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }


    public String getNome() {
        return nome;
    }


    public String getDocumento() {
        return documento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now())
                     .getYears();
    }

    public boolean eMaiorDeIdade() {
        return getIdade() >= 18;
    }

}