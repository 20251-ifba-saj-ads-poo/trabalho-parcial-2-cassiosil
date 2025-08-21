package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Equipamento;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;




public class DelEquipamentoController {

    @FXML
    public  ListView<Equipamento> listaDeEquipamentos;

    @FXML
    public void initialize() {
        listaDeEquipamentos.setItems(Dados.listaEquipamentos);
    }
   
    @FXML
    void removerEquipamento(MouseEvent event) {
        int selectedID = listaDeEquipamentos.getSelectionModel().getSelectedIndex();
        if(selectedID >= 0){
            listaDeEquipamentos.getItems().remove(selectedID);
        }
        
    }

}

