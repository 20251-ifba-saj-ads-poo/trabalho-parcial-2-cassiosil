package br.edu.ifba.saj.fwads.model;
import java.util.ArrayList;

public class ControleEquipamentos {
    private ArrayList<Equipamento> equipamentos;

    public ControleEquipamentos() {
        this.equipamentos = new ArrayList<>();
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        this.equipamentos.add(equipamento);
    }

    public void removerEquipamento(String numeroDeSerie) {
        this.equipamentos.removeIf(e -> e.getNumeroDeSerie().equals(numeroDeSerie));
    }

    public void alterarStatus(String numeroDeSerie, Status novoStatus) {
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getNumeroDeSerie().equals(numeroDeSerie)) {
                equipamento.alterarStatus(novoStatus);
                return;
            }
        }
    }
}
