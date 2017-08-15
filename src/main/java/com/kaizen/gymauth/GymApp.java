package com.kaizen.gymauth;

import com.kaizen.gymauth.controller.gym.GymController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GymApp extends Application {
    
    @Override
    public void start(final Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/view/main/GymAuth.fxml"
        ));

        Scene scene = new Scene((Pane) loader.load());
        
        scene.getStylesheets().add("/styles/style.css");
        
        GymController gymController = loader.<GymController>getController();
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
        stage.setMinWidth(300.0);
        stage.setMinHeight(600.0);
        stage.setTitle("GymAuth 2.0");
        stage.setScene(scene);
        stage.show();
    }
    

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
