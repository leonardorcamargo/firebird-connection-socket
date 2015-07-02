package com.romano.firebirdServer.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonardo
 */
public class Server extends Thread {
    
    private static ServerSocket server;	 
    
    public Server(int port){                
        super("Server");
        try {
            // Instancia o ServerSocket ouvindo a porta 12345
            server = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        while (! this.isInterrupted()) {
            try {
                System.out.println("Waiting connection of clients...");
                // o método accept() bloqueia a execução até que o servidor receba um pedido de conexão
                new MultiServerThread(server.accept()).start();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
