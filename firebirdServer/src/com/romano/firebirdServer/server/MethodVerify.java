package com.romano.firebirdServer.server;

import com.romano.firebirdServer.model.ClientToServer;

/**
 *
 * @author Leonardo Camargo
 */
public class MethodVerify {

    public MethodVerify(ClientToServer clientToServer){
        switch (clientToServer.getTypeMethod()){
            case GET_USER:
                break;
            case SQL_EXECUTE:
                break;
            case USER_VERIFY:
                Method method = new MethodUserVerifyDao();
                break;
            default: break;
        }
                
    }
                    
    
}
