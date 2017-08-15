package com.kaizen.gymauth.controller;

import com.kaizen.gymauth.model.User;
import com.kaizen.gymauth.service.UserService;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class GymController implements Initializable {

    /* Servicio de 'Usuario' */
    private UserService userService;
    
    /* Lista global de usuarios */
    public static List<User> usersList = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.initUsers();
        
        System.out.println(GymController.usersList.size());
    }
    
    /**
     * Inicializa el servicio de usuarios
     * Añade los usuarios existentes a una lista global
     */
    private void initUsers() {
        this.userService = new UserService();
        GymController.usersList.addAll(this.userService.listUsers());
    }
    
}
