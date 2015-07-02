package com.romano.firebirdServer.server;

import com.romano.firebirdServer.common.Message;
import com.romano.firebirdServer.common.Type;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javafx.scene.control.Alert;
import sun.security.pkcs11.wrapper.Functions;

public class MultiServerThread extends Thread {
    private Socket client = null;    

    public MultiServerThread(Socket client) {
        super("MultiServerThread");
        this.client = client;
    }
    
    @Override
    public void run() {

    	try{
            System.out.print("Client connected: " + client.getInetAddress().getHostAddress());

            ObjectInputStream input = new ObjectInputStream(client.getInputStream());       
            Object inputObject = input.readObject();
            
            System.out.print(inputObject);            
            
            Object outputObject = new Object();
            
            outputObject = "Hello Client!";                                              
                        
            ObjectOutputStream output = new ObjectOutputStream(client.getOutputStream());    
            output.flush();
            output.writeObject(outputObject);        

            client.close();
	}catch(Exception e) {        
            System.out.println("Erro: " + e.getMessage());     
        }
    	
    }
}