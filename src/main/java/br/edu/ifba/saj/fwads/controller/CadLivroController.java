package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.util.StringConverter;

public class CadLivroController {
    @FXML
    private TextField txNome;
    @FXML
    private TextField txcpf;
    @FXML
    private TextField txmatricula;
    @FXML
    private ChoiceBox<Funcionario> slFuncionario;

    @FXML
    void salvarFuncionario(ActionEvent event) {
        Funcionario novoFuncionario = new Funcionario(txNome.getText(),
                    txcpf.getText(), 
                    txmatricula.getText(),
                    slAutor.getSelectionModel().getSelectedItem());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Livro(Fake):"+novoLivro.toString()).showAndWait();
        limparTela();
      

    }

    @FXML 
    private void initialize() {
        slAutor.setConverter(new StringConverter<Autor>() {
            @Override
            public String toString(Autor obj) {
                if (obj != null) {
                    return obj.getNome() + ":" + obj.getEmail();
                }
                return "";
            }

            @Override
            public Autor fromString(String stringAutor) {
                return Biblioteca.listaAutores
                    .stream()
                    .filter(autor -> stringAutor.equals(autor.getNome() + ":" + autor.getEmail()))
                    .findAny()
                    .orElse(null);                
            }
        });
        
        carregarListaAutores();
    }

    @FXML
    private void limparTela() {
        txTitulo.setText("");
        txSubTitulo.setText("");
        txISBN.setText("");
        //Todo REVER
        slAutor.setSelectionModel(null);
    }

    private void carregarListaAutores() {
        slAutor.setItems(Biblioteca.listaAutores);
    }

}
