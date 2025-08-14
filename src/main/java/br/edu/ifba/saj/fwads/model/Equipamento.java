package br.edu.ifba.saj.fwads.model;
public class Equipamento {
    private String nome;
    private String numeroDeSerie;
    private String localizacao;
    private Status status;

    public Equipamento(String nome, String numeroDeSerie, String localizacao, Status status) {
        this.nome = nome;
        this.numeroDeSerie = numeroDeSerie;
        this.localizacao = localizacao;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Status getStatus() {
        return status;
    }

    public void alterarStatus(Status novoStatus) {
        this.status = novoStatus;
    }
}
