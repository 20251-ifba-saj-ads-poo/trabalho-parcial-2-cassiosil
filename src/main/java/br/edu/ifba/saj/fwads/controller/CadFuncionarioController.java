package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Funcionario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadFuncionarioController {

    @FXML
    private TextField txnome;

    @FXML
    private TextField txcpf;

    @FXML
    private TextField txmatricula;

    @FXML
    private TextField txsenha;


    @FXML
    private void salvarFuncionario() {
        Funcionario novoFuncionario = new Funcionario(txnome.getText(),
                    txcpf.getText(), 
                    txmatricula.getText(),
                    txsenha.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Funcionario:"+novoFuncionario.getNome()).showAndWait();
        Dados.listaFuncionarios.add(novoFuncionario);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txnome.setText("");
        txcpf.setText("");
        txmatricula.setText("");
        txsenha.setText("");
    }

}
