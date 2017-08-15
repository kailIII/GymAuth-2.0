package com.kaizen.gymauth.controller.gym;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author VakSF
 */
public class GymContainer {
    
    @FXML
    private Label hourL, dateL;
    
    public Label getHourL() {
        return hourL;
    }

    public void setHourL(Label hourL) {
        this.hourL = hourL;
    }

    public Label getDateL() {
        return dateL;
    }

    public void setDateL(Label dateL) {
        this.dateL = dateL;
    }
    
}
