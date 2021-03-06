/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdClient.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Leonardo Camargo
 */
public class FirebirdClient extends Application {
    public static Stage STAGE = null;   
    
    @Override
    public void start(Stage stage) throws Exception {
        STAGE = stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMain.fxml"));
        
        Scene scene = new Scene(root);
        
        STAGE.setScene(scene);
        STAGE.setTitle("Client Socket");
        STAGE.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
