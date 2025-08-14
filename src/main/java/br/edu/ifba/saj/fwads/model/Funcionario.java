package br.edu.ifba.saj.fwads.model;
public class Funcionario {
    private String nome;
    private int cpf;
    private String matricula;
    private String senha;
    private Permissao permissao;

    public Funcionario(String nome, int cpf, String matricula, String senha, Permissao permissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.senha = senha;
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }
}
