package br.edu.ifba.saj.fwads.model;
import java.util.Date;

public class Solicitacao {
    private String id;
    private Equipamento equipamento;
    private Funcionario funcionario;
    private Date dataSolicitacao;
    private Date dataDevolucao;
    private StatusSolicitacao status;

    public Solicitacao(String id, Equipamento equipamento, Funcionario funcionario, Date dataSolicitacao, Date dataDevolucao, StatusSolicitacao status) {
        this.id = id;
        this.equipamento = equipamento;
        this.funcionario = funcionario;
        this.dataSolicitacao = dataSolicitacao;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public StatusSolicitacao getStatus() {
        return status;
    }

    public void alterarStatus(StatusSolicitacao novoStatus) {
        this.status = novoStatus;
    }
}
