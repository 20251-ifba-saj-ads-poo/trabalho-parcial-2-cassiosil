package br.edu.ifba.saj.fwads.model;
import java.util.ArrayList;

public class ControleSolicitacoes {
    private ArrayList<Solicitacao> solicitacoes;

    public ControleSolicitacoes() {
        this.solicitacoes = new ArrayList<>();
    }

    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void adicionarSolicitacao(Solicitacao solicitacao) {
        this.solicitacoes.add(solicitacao);
    }

    public void alterarStatus(String id, StatusSolicitacao novoStatus) {
        for (Solicitacao solicitacao : solicitacoes) {
            if (solicitacao.getId().equals(id)) {
                solicitacao.alterarStatus(novoStatus);
                return;
            }
        }
    }
}
