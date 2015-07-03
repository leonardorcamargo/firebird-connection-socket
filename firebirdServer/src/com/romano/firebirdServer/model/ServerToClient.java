package com.romano.firebirdServer.model;

import com.romano.firebirdClient.common.Type;

/**
 *
 * @author Leonardo Camargo
 */
public class ServerToClient extends ClientServer{

    private Type.TypeRetun typeReturn;    

    /**
     * @return the typeReturn
     */
    public Type.TypeRetun getTypeReturn() {
        return typeReturn;
    }

    /**
     * @param typeReturn the typeReturn to set
     */
    public void setTypeReturn(Type.TypeRetun typeReturn) {
        this.typeReturn = typeReturn;
    }
    
}
