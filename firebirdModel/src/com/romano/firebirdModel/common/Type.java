/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdModel.common;

/**
 * Classe onde é armazenado os types utilizados pela aplicação
 * @author Leonardo Camargo
 */

public class Type {
    
    public enum TypeMethod{
        SQL_EXECUTE,
        USER_VERIFY,
        GET_USER,
    };
    
    public enum TypeReturn{
        OK,
        ERROR_RETURN,
        ERROR_AUTENTICATION
    }
    
}
