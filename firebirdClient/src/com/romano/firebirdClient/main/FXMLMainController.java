/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdClient.main;

import com.romano.firebirdClient.client.ConnectServer;
import com.romano.firebirdModel.common.Type;
import com.romano.firebirdModel.model.ClientToServer;
import com.romano.firebirdModel.model.ServerToClient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Leonardo Camargo
 */
public class FXMLMainController implements Initializable {
    
    @FXML
    private Label lbMessage;
    
    @FXML
    private TextField txtPort;
    
    @FXML
    private TextField txtServerName;
    
    @FXML
    private Button btnConnect;     
    
    @FXML
    private void handleButtonAction(ActionEvent event) {        
        ConnectServer.setPort(Integer.parseInt(txtPort.getText()));
        ConnectServer.setServerName(txtServerName.getText());        
        ConnectServer conServer = new ConnectServer();
        try{
            ClientToServer cts = new ClientToServer();
            cts.setKey("LEONARDO|ROMANO");
            cts.setTypeMethod(Type.TypeMethod.GET_USER);
            
            ServerToClient stc = conServer.accept(cts);              
            if (stc.getTypeReturn().equals(Type.TypeReturn.OK)){
                lbMessage.setText("Connection successfully");
            }else{
                lbMessage.setText("Connection failed");
            }
        }catch(Exception e){
            lbMessage.setText("Connection failed\n"+e.getMessage());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
