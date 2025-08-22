
package br.edu.ifba.saj.fwads.controller;

import java.time.LocalDate;

import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Solicitacao;
import br.edu.ifba.saj.fwads.model.Status;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ListarSolicitacaoController {
    @FXML
    private TableView<Solicitacao> tblEquipamento;

    @FXML
    private TableColumn<Solicitacao, String> columnNome;
    @FXML
    private TableColumn<Solicitacao, String> columnNumeroDeSerie;
    @FXML
    private TableColumn<Solicitacao, LocalDate> columnLocalizacao;
    @FXML
    private TableColumn<Solicitacao, LocalDate> columnStatus;

    @FXML
    public void initialize() {
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnNumeroDeSerie.setCellValueFactory(new PropertyValueFactory<>("numeroDeSerie"));
        columnLocalizacao.setCellValueFactory(new PropertyValueFactory<>("localizacao"));
        columnStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        tblEquipamento.setItems(Dados.listaEquipamentos);
    }

    @FXML
    public void showNovoEquipamento() {

        Stage stage = new Stage();
        Scene scene = new Scene(App.loadFXML("controller/CadEquipamento.fxml"), 800, 600);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

    }

}
