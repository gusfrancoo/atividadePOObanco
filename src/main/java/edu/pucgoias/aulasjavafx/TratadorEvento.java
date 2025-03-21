package edu.pucgoias.aulasjavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TratadorEvento implements EventHandler<ActionEvent> { // 1

    private Label labelMensagem;

    public void setLabel(Label labelMensagem) {
        this.labelMensagem = labelMensagem;
    }

    @Override
    public void handle(ActionEvent evento) {
            labelMensagem.setText("Clique tratado na superclasse" );
    }
}