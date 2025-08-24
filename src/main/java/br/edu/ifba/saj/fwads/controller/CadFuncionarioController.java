package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Funcionario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadFuncionarioController {

    @FXML
    private TextField txNome;

    @FXML
    private TextField txCPF;

    @FXML
    private TextField txMatricula;


    @FXML
    private void salvarFuncionario() {
        Funcionario novoFuncionario = new Funcionario(txNome.getText(),
                    txCPF.getText(), 
                    txMatricula.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Funcionario: "+novoFuncionario.getNome()).showAndWait();
        Dados.listaFuncionarios.add(novoFuncionario);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txNome.setText("");
        txCPF.setText("");
        txMatricula.setText("");
    }

}
