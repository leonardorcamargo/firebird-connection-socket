package com.romano.firebirdModel.model;

/**
 *
 * @author Leonardo Camargo
 */
public class ClientToServer extends ClientServer{
    
    private String key;
    private String sql;

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the sql      
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }    
    
}
