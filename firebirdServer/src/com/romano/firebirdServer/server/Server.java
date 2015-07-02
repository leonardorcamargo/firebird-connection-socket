package com.romano.firebirdServer.server;

import com.romano.firebirdServer.common.Message;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;
import javafx.scene.control.Alert;

/**
 *
 * @author leonardo
 */
public class Server {
    
    private static ServerSocket server;	 
    
    public Server(int port){                

        try{
            // Instancia o ServerSocket ouvindo a porta 12345
            server = new ServerSocket(port);                        
            
            while (true) {
                System.out.println("Waiting connection of clients...");
                // o método accept() bloqueia a execução até que o servidor receba um pedido de conexão
                new MultiServerThread(server.accept()).start();
            }
        } catch (IOException e) {
            Message.show(Alert.AlertType.ERROR,"Could not listen on port " + port);
            System.exit(-1);
        }  
    }
    
}
