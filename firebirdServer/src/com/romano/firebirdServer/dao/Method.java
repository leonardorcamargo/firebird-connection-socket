package com.romano.firebirdServer.dao;

import com.romano.firebirdModel.model.ServerToClient;

/**
 *
 * @author Leonardo Camargo
 */
public interface Method {
    
    public boolean verifyKey();
    public ServerToClient getReturn();    
    
}
