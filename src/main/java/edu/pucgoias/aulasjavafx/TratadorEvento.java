package edu.pucgoias.aulasjavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class TratadorEvento implements EventHandler<ActionEvent> { // 1

    private Label labelMensagem;

    public void changeLabel(Label labelMensagem, Color color) {
        this.labelMensagem = labelMensagem;
        this.labelMensagem.setTextFill(color);
    }

    @Override
    public void handle(ActionEvent evento) {
            labelMensagem.setText("Clique tratado na superclasse" );
    }
}