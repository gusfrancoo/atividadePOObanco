package edu.pucgoias.aulasjavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController implements EventHandler<ActionEvent> {

    @FXML
    private Button btnUm;

    @FXML
    private Button btnDois;

    @FXML
    private Button btnTres;

    @FXML
    private Label labelMensagem;

    @Override
    public void handle(ActionEvent actionEvent) {

    }

    @FXML
    private void botaoUmClicado(ActionEvent evento) {
        TratadorEvento trat = new TratadorEvento();
        trat.changeLabel(this.labelMensagem, Color.BLUE);
        trat.handle(evento);
    }

    @FXML
    private void botaoDoisClicado(ActionEvent evento) {
        this.labelMensagem.setText("Ação botão 2");
        this.labelMensagem.setTextFill(Color.GREEN);

    }

    @FXML
    private void botaoTresClicado(ActionEvent evento) {
        this.handleButton();
    }

    private void handleButton(){

        this.labelMensagem.setText("Botão tratado por método externo");
        this.labelMensagem.setTextFill(Color.PURPLE);
    }


}
