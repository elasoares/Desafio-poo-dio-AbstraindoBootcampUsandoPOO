package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String Descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devesInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevesInscritos() {
        return devesInscritos;
    }

    public void setDevesInscritos(Set<Dev> devesInscritos) {
        this.devesInscritos = devesInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(getNome(), bootCamp.getNome()) && Objects.equals(getDescricao(), bootCamp.getDescricao()) && Objects.equals(getDataInicial(), bootCamp.getDataInicial()) && Objects.equals(getDataFinal(), bootCamp.getDataFinal()) && Objects.equals(getDevesInscritos(), bootCamp.getDevesInscritos()) && Objects.equals(getConteudos(), bootCamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicial(), getDataFinal(), getDevesInscritos(), getConteudos());
    }
}
