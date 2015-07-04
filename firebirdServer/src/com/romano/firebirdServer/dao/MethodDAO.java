/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdServer.dao;

import com.romano.firebirdModel.model.ClientToServer;
import com.romano.firebirdModel.model.ServerToClient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Camargo
 */
abstract class MethodDAO {
    protected Conexao con = null;
    protected ClientToServer cts = null;
    protected ServerToClient stc = new ServerToClient();
    
    public MethodDAO(ClientToServer cts){
        this.cts = cts;
    }
    
    public boolean verifyKey(){
        String user = cts.getKey().substring(0, cts.getKey().indexOf("|"));
        String pass = cts.getKey().substring(cts.getKey().indexOf("|")+1);
                
        try {
            con = new Conexao();
        } catch (SQLException ex) {
            Logger.getLogger(MethodDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        try{
//            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT FIRST 1 * FROM USUARIO WHERE USU_USUARIO = ? AND USU_SENHA = ?");            
//            pstm.setString(1, user);
//            pstm.setString(2, pass);
//            ResultSet rs = pstm.executeQuery();
            
            Statement stm = con.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM USUARIO");
            
            return (rs.getRow() != 0);
        } catch (SQLException ex) {
            Logger.getLogger(MethodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.closeConnection();
        }                   
        return false;
    }
    
    public abstract ServerToClient getReturn();       
    
    
}
