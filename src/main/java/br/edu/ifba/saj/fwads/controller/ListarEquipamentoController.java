
package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Equipamento;
import br.edu.ifba.saj.fwads.model.Status;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ListarEquipamentoController {
    @FXML
    private TableView<Equipamento> tblEquipamento;

    @FXML
    private TableColumn<Equipamento, String> columnNome;
    @FXML
    private TableColumn<Equipamento, String> columnNumeroDeSerie;
    @FXML
    private TableColumn<Equipamento, String> columnLocalizacao;
    @FXML
    private TableColumn<Equipamento, Status> columnStatus;


    @FXML
    public void initialize() {
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnNumeroDeSerie.setCellValueFactory(new PropertyValueFactory<>("numero de serie"));
        columnLocalizacao.setCellValueFactory(new PropertyValueFactory<>("localização"));
        columnStatus.setCellValueFactory(new PropertyValueFactory<>("localização"));
        tblEquipamento.setItems(Dados.listaEquipamentos);
    }

    @FXML
    public void showNovoEquipamento() {
        
        Stage stage = new Stage();            
        Scene scene = new Scene(App.loadFXML("controller/CadEquipamentor.fxml"), 800, 600);            
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL); 
        stage.showAndWait();            
    }

}
