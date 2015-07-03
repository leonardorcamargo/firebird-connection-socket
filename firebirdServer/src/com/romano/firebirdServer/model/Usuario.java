/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romano.firebirdServer.model;

/**
 *
 * @author Leonardo Camargo
 */
public class Usuario {
    
    private String usuario;
    private String senha;
    private boolean supervisor;
    private boolean clientes;
    private boolean vendedores;
    private boolean departamento;
    private boolean item;
    private boolean grupo;
    private boolean cores;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the supervisor
     */
    public boolean isSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }
    
    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = "S".equalsIgnoreCase(supervisor);
    }

    /**
     * @return the clientes
     */
    public boolean isClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(boolean clientes) {
        this.clientes = clientes;
    }
    
    /**
     * @param clientes the clientes to set
     */
    public void setClientes(String clientes) {
        this.clientes = "S".equalsIgnoreCase(clientes);
    }

    /**
     * @return the vendedores
     */
    public boolean isVendedores() {
        return vendedores;
    }

    /**
     * @param vendedores the vendedores to set
     */
    public void setVendedores(boolean vendedores) {
        this.vendedores = vendedores;
    }
    
    /**
     * @param vendedores the vendedores to set
     */
    public void setVendedores(String vendedores) {
        this.vendedores = "S".equalsIgnoreCase(vendedores);
    }

    /**
     * @return the departamento
     */
    public boolean isDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(boolean departamento) {
        this.departamento = departamento;
    }
    
    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = "S".equalsIgnoreCase(departamento);
    }

    /**
     * @return the item
     */
    public boolean isItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(boolean item) {
        this.item = item;
    }
    
    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = "S".equalsIgnoreCase(item);
    }

    /**
     * @return the grupo
     */
    public boolean isGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }
    
    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = "S".equalsIgnoreCase(grupo);
    }

    /**
     * @return the cores
     */
    public boolean isCores() {
        return cores;
    }

    /**
     * @param cores the cores to set
     */
    public void setCores(boolean cores) {
        this.cores = cores;
    }
    
    /**
     * @param cores the cores to set
     */
    public void setCores(String cores) {
        this.cores = "S".equalsIgnoreCase(cores);
    }
}
