package com.romano.firebirdServer.server;

import com.romano.firebirdServer.main.FXMLDocumentController;
import com.romano.firebirdServer.model.ClientToServer;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiServerThread extends Thread {
    private Socket client = null;    

    public MultiServerThread(Socket client) {
        super("MultiServerThread");
        this.client = client;
    }
    
    @Override
    public void run() {

    	try{
            //System.out.print("Client connected: " + client.getInetAddress().getHostAddress());

            ObjectInputStream input = new ObjectInputStream(client.getInputStream());       
            ClientToServer inputObject = (ClientToServer)input.readObject();
            
            MethodVerify mv = new MethodVerify(inputObject);
                                    
            Object outputObject = mv.getReturn();
                        
            ObjectOutputStream output = new ObjectOutputStream(client.getOutputStream());    
            output.flush();
            output.writeObject(outputObject);        

            client.close();
	}catch(Exception ex) {        
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex); 
        }
    	
    }
}