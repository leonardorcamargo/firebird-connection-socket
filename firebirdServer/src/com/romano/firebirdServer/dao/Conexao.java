/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdServer.dao;

import com.romano.firebirdServer.common.Message;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author Leonardo Camargo
 */
public class Conexao {
    
    private static String DATABASE = "WSAC";
    private static String PATH_DATABASE = "";
    private static int PORT = 0;
    private static String USER = "sysdba";
    private static String PASSWORD = "masterkey";

    /**
     * @return the DATABASE
     */
    public static String getDATABASE() {
        return DATABASE;
    }

    /**
     * @param aDATABASE the DATABASE to set
     */
    public static void setDATABASE(String aDATABASE) {
        DATABASE = aDATABASE;
    }

    /**
     * @return the PATH_DATABASE
     */
    public static String getPATH_DATABASE() {
        return PATH_DATABASE;
    }

    /**
     * @param aPATH_DATABASE the PATH_DATABASE to set
     */
    public static void setPATH_DATABASE(String aPATH_DATABASE) {
        PATH_DATABASE = aPATH_DATABASE;
    }

    /**
     * @return the PORT
     */
    public static int getPORT() {
        return PORT;
    }

    /**
     * @param aPORT the PORT to set
     */
    public static void setPORT(int aPORT) {
        PORT = aPORT;
    }

    /**
     * @return the USER
     */
    public static String getUSER() {
        return USER;
    }

    /**
     * @param aUSER the USER to set
     */
    public static void setUSER(String aUSER) {
        USER = aUSER;
    }

    /**
     * @return the PASSWORD
     */
    public static String getPASSWORD() {
        return PASSWORD;
    }

    /**
     * @param aPASSWORD the PASSWORD to set
     */
    public static void setPASSWORD(String aPASSWORD) {
        PASSWORD = aPASSWORD;
    }    
    private Connection con = null;    
    
    public Conexao(){
        try{                     
            Class.forName("org.firebirdsql.jdbc.FBDriver");
                       
            con = DriverManager.getConnection("jdbc:firebirdsql:"+PATH_DATABASE,USER,PASSWORD);            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            Message.show(Alert.AlertType.ERROR, "Connection error!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            Message.show(Alert.AlertType.ERROR, "Connection error!");
        }
    }
    
    public Connection getConnection(){
        return con;
    }
   
    
}
