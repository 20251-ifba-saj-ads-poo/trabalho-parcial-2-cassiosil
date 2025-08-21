package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Inventario;
import br.edu.ifba.saj.fwads.Solicitacoes;
import br.edu.ifba.saj.fwads.Equipes;
import br.edu.ifba.saj.fwads.model.Equipamento;
import br.edu.ifba.saj.fwads.model.Funcionario;
import br.edu.ifba.saj.fwads.model.Solicitacao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.util.StringConverter;

public class CadSolicitacaoController {

    @FXML
    private ChoiceBox<Equipamento> slEquipamento;

    @FXML
    private ChoiceBox<Funcionario> slFuncionario;

    @FXML
    private TextField txdataDeDevolucao;


    @FXML
    private void salvarSolicitacao() {
        Solicitacao novoSolicitacao = new Solicitacao(slEquipamento.getSelectionModel().getSelectedItem(),
                    slFuncionario.getSelectionModel().getSelectedItem(), 
                    txdataDeDevolucao.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Solicitacao:"+novoSolicitacao.toString()).showAndWait();
        Solicitacoes.listaSolicitacoes.add(novoSolicitacao);
        limparTela();
    }

    @FXML 
    private void initialize() {
        slEquipamento.setConverter(new StringConverter<Equipamento>() {
            @Override
            public String toString(Equipamento obj) {
                if (obj != null) {
                    return obj.getNome() + ":" + obj.getNumeroDeSerie();
                }
                return "";
            }

            @Override
            public Equipamento fromString(String stringAutor) {
                return Inventario.listaEquipamentos
                    .stream()
                    .filter(autor -> stringAutor.equals(autor.getNome() + ":" + autor.getNumeroDeSerie()))
                    .findAny()
                    .orElse(null);                
            }
        });
        
        carregarlistaEquipamentos();
    

        slFuncionario.setConverter(new StringConverter<Funcionario>() {
            @Override
            public String toString(Funcionario obj) {
                if (obj != null) {
                    return obj.getNome() + ":" + obj.getMatricula();
                }
                return "";
            }

            @Override
            public Funcionario fromString(String stringFuncionario) {
                return Equipes.listaFuncionarios
                    .stream()
                    .filter(autor -> stringFuncionario.equals(autor.getNome() + ":" + autor.getMatricula()))
                    .findAny()
                    .orElse(null);                
            }
        });
        
        carregarlistaFuncionarios();
    }

    @FXML
    private void limparTela() {
        slEquipamento.setText("");
        slFuncionario.setText("");
        txdataDeDevolucao.setText("");
    }

}
