package br.edu.ifba.saj.fwads;

import br.edu.ifba.saj.fwads.model.Equipamento;
import br.edu.ifba.saj.fwads.model.Funcionario;
import br.edu.ifba.saj.fwads.model.Solicitacao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Dados {
    public static ObservableList<Equipamento> listaEquipamentos = FXCollections.observableArrayList();
    public static ObservableList<Funcionario> listaFuncionarios = FXCollections.observableArrayList();
    public static ObservableList<Solicitacao> listaSolicitacoes = FXCollections.observableArrayList();
    static{
        listaEquipamentos.add(new Equipamento("E","E","E"));
        listaFuncionarios.add(new Funcionario("F","F","F"));
    }
    
}
