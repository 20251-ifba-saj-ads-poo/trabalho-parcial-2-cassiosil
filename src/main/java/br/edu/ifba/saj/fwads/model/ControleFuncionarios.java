package br.edu.ifba.saj.fwads.model;
import java.util.ArrayList;

public class ControleFuncionarios {
    private ArrayList<Funcionario> funcionarios;

    public ControleFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(String matricula) {
        this.funcionarios.removeIf(f -> f.getMatricula().equals(matricula));
    }

    public void alterarPermissao(String matricula, Permissao novaPermissao) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula().equals(matricula)) {
                funcionario.setPermissao(novaPermissao);
                return;
            }
        }
    }
}
