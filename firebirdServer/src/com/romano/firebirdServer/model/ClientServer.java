/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdServer.model;

import com.romano.firebirdClient.common.Type;
import java.io.Serializable;

/**
 *
 * @author Leonardo Camargo
 */
abstract class ClientServer implements Serializable {
    
    private Type.TypeMethod typeMethod;
    private Object object;

    /**
     * @return the typeMethod
     */
    public Type.TypeMethod getTypeMethod() {
        return typeMethod;
    }

    /**
     * @param typeMethod the typeMethod to set
     */
    public void setTypeMethod(Type.TypeMethod typeMethod) {
        this.typeMethod = typeMethod;
    }

    /**
     * @return the object
     */
    public Object getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(Object object) {
        this.object = object;
    }
    
}
