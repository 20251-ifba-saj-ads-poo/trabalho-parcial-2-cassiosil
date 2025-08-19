package br.edu.ifba.saj.fwads.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadSolicitacaoController {

    @FXML
    private TextField txequipamento;

    @FXML
    private TextField txfuncionario;

    @FXML
    private TextField txdataDeDevolucao;


    @FXML
    private void salvarSolicitacao() {
        /*Solicitacao novoSolicitacao = new Solicitacao(txequipamento.getText(),
                    txfuncionario.getText(), 
                    txdataDeDevolucao.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Solicitacao:"+novoSolicitacao.getNome()).showAndWait();
        Solicitacoes.listaSolicitacoes.add(novoSolicitacao);
        */limparTela();
    }
    @FXML
    private void limparTela() {
        txequipamento.setText("");
        txfuncionario.setText("");
        txdataDeDevolucao.setText("");
    }

}
