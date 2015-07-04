package com.romano.firebirdServer.server;

import static com.romano.firebirdModel.common.Type.TypeMethod.GET_USER;
import static com.romano.firebirdModel.common.Type.TypeMethod.SQL_EXECUTE;
import static com.romano.firebirdModel.common.Type.TypeMethod.USER_VERIFY;
import com.romano.firebirdModel.model.ClientToServer;
import com.romano.firebirdModel.model.ServerToClient;
import com.romano.firebirdServer.dao.Method;
import com.romano.firebirdServer.dao.MethodUserVerifyDAO;

/**
 *
 * @author Leonardo Camargo
 */
public class MethodVerify {

    ClientToServer clientToServer;
    Method method = null;
    
    public MethodVerify(ClientToServer clientToServer){
        this.clientToServer = clientToServer;
        
        switch (this.clientToServer.getTypeMethod()){
            case GET_USER:
                method = new MethodUserVerifyDAO(this.clientToServer);
                break;
            case SQL_EXECUTE:
                method = new MethodUserVerifyDAO(this.clientToServer);
                break;
            case USER_VERIFY:
                method = new MethodUserVerifyDAO(this.clientToServer);
                break;
            default: break;
        }
                
    }
    
    public ServerToClient getReturn(){
        return method.getReturn();
    }
                    
    
}
