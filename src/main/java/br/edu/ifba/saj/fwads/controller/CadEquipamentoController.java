package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Inventario;
import br.edu.ifba.saj.fwads.model.Equipamento;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadEquipamentoController {

    @FXML
    private TextField txnome;

    @FXML
    private TextField txnumeroDeSerie;

    @FXML
    private TextField txlocalizacao;


    @FXML
    private void salvarEquipamento() {
        Equipamento novoEquipamento = new Equipamento(txnome.getText(),
                    txnumeroDeSerie.getText(), 
                    txlocalizacao.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Equipamento:"+novoEquipamento.getNome()).showAndWait();
        Inventario.listaEquipamentos.add(novoEquipamento);
        txnome.setText("");
        txnumeroDeSerie.setText("");
        txlocalizacao.setText("");;
    }
    @FXML
    private void limparTela() {
        txnome.setText("");
        txnumeroDeSerie.setText("");
        txlocalizacao.setText("");
    }

}
