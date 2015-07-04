/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdServer.main;

import com.romano.firebirdServer.dao.Conexao;
import com.romano.firebirdServer.server.Server;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Leonardo Camargo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtPort;
    
    @FXML
    private TextField txtDataBase;
    
    @FXML
    private Label lbMessage;
    
    @FXML
    private Button btnHearing;
    
    @FXML
    private Button btnConnect;        
    
    Server server = null;
    
    @FXML
    private void handleBtnConnectAction(ActionEvent event) {
        Conexao.setPATH_DATABASE(txtDataBase.getText());
        
        try{
            Conexao con = new Conexao();
            con.getConnection();
            con.getConnection().close();
            lbMessage.setText("Successfully Connected!");
        }catch(Exception e){
            Message.show(Alert.AlertType.ERROR, "Connection error!");
            lbMessage.setText("Error Connection!");            
        }
    }
    
    @FXML
    private void handleBtnHearingAction(ActionEvent event) {
        Conexao.setPORT(Integer.parseInt(txtPort.getText()));        
        server = new Server(Conexao.getPORT());
        server.start();
    }        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
