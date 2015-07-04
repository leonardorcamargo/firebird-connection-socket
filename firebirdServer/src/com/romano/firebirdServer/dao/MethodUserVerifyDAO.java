package com.romano.firebirdServer.dao;

import com.romano.firebirdModel.common.Type;
import com.romano.firebirdModel.model.ClientToServer;
import com.romano.firebirdModel.model.ServerToClient;

/**
 *
 * @author Leonardo Camargo
 */
public class MethodUserVerifyDAO extends MethodDAO implements Method{

    public MethodUserVerifyDAO(ClientToServer cts) {
        super(cts);
    }

    @Override
    public ServerToClient getReturn() {
        stc.setObject(null);
        stc.setTypeMethod(cts.getTypeMethod());
        if(verifyKey()){
            stc.setTypeReturn(Type.TypeReturn.OK);
        }else{
            stc.setTypeReturn(Type.TypeReturn.ERROR_AUTENTICATION);
        }      
        return stc;
    }
    
}
