/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdClient.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonardo
 */
public class ConnectServer {
    private static String SERVER_NAME = "";
    private static int PORT = 0;
    
    private Socket server = null;
    private ObjectOutputStream output = null;
    private ObjectInputStream input = null;    
    
    public ConnectServer(){
        try {
            server = new Socket(SERVER_NAME,PORT);                                                                    
        } catch (IOException ex) {
            Logger.getLogger(ConnectServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object accept(Object object) throws Exception{
        if ((PORT == 0)||(SERVER_NAME == "")){
            throw new Exception("Values PORT/SERVER_NAME not found");
        }
        try {    
            output = new ObjectOutputStream(server.getOutputStream());                                                     
            output.flush();
            output.writeObject(object);
            
            input = new ObjectInputStream(server.getInputStream());
            return input.readObject();
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ConnectServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void close(){
        try {
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(ConnectServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setServerName(String serverName){
        SERVER_NAME = serverName;
    }
    
    public static void setPort(int port){
        PORT = port;
    }
}
