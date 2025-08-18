package br.edu.ifba.saj.fwads.model;
import java.util.Date;

public class Solicitacao extends AbstractModel<String> {
    private Equipamento equipamento;
    private Funcionario funcionario;
    private Date dataDevolucao;
    private StatusSolicitacao status;

    public Solicitacao(String id, Equipamento equipamento, Funcionario funcionario, 
    Date dataDevolucao) {
        this.equipamento = equipamento;
        this.funcionario = funcionario;
        this.dataDevolucao = dataDevolucao;
        this.status = status.EMANDAMENTO;
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
