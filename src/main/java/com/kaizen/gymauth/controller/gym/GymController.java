 package com.kaizen.gymauth.controller.gym;

import com.digitalpersona.onetouch.DPFPSample;
import com.kaizen.gymauth.model.User;
import com.kaizen.gymauth.service.UserService;
import com.kaizen.gymauth.util.service.Clock;
import com.kaizen.gymauth.util.DateUtil;
import com.kaizen.gymauth.util.service.DPFPReader;
import com.kaizen.gymauth.util.service.Reader;
 
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
 
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.concurrent.Service;
 
import javafx.fxml.Initializable;

public class GymController extends GymContainer implements Initializable {
    
    /* Servicio de 'Usuario' */
    private UserService userService;
    
    /* Lista global de 'Usuarios' */
    public static List<User> usersList = new ArrayList<>();
    
    /**
     * Reloj de la aplicación
     */
    private Service<Void> clock;
    
    /**
     * Lector del dispositivo
     */
    private Service<DPFPSample> reader;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.initUsers();
        this.initClock();
        this.initDateInfo();
        this.initReader();
        
    }
    
    /**
     * Inicializa el servicio de usuarios
     * Añade los usuarios existentes a una lista global
     */
    private void initUsers() {
        this.userService = new UserService();
        GymController.usersList.addAll(this.userService.listUsers());
    }
    
    /**
     * Inicializa el reloj
     */
    private void initClock() {
        
        this.clock = new Clock();
        
        getHourL().textProperty().bind(this.clock.messageProperty());
        
        this.clock.restart();
    }
    
    /**
     * Inicializa el lector
     */
    public void initReader() {
        
        DPFPReader dpReader = new DPFPReader();
        
        this.reader = new Reader(dpReader);
        
        this.reader.valueProperty().addListener(
                this.getFingerListener()
        );
        
    }
    
    /**
     * Inicializa la información de la fecha actual
     */
    private void initDateInfo() {
        getDateL().setText(DateUtil.getSpanishDate());
    }
    
    /**
     * Generar un Observador para los eventos del Reader
     */
    
    private ChangeListener<DPFPSample> getFingerListener() {
        
        return (observable, oldSample, newSample) -> {
            
            System.out.println("Here");
            
            Platform.runLater(() -> {
                
                System.out.println(Arrays.toString(newSample.serialize()));
                
            });
            
        };
        
    }
    
}
