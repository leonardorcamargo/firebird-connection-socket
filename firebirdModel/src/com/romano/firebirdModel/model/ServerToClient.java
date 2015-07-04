package com.romano.firebirdModel.model;

import com.romano.firebirdModel.common.Type;

/**
 *
 * @author Leonardo Camargo
 */
public class ServerToClient extends ClientServer{

    private Type.TypeReturn typeReturn;    

    /**
     * @return the typeReturn
     */
    public Type.TypeReturn getTypeReturn() {
        return typeReturn;
    }

    /**
     * @param typeReturn the typeReturn to set
     */
    public void setTypeReturn(Type.TypeReturn typeReturn) {
        this.typeReturn = typeReturn;
    }
    
}
