package com.amcor.amcorapp.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by johel on 4/08/2017.
 */

public class Usuario implements Serializable {

    @SerializedName("cliente")
    private Cliente cliente;
    @SerializedName("codUsuario")
    private String codUsuario;
    @SerializedName("modulos")
    private List<Modulo> moduloList;
    @SerializedName("nombresUsuario")
    private String nombresUsuario;

    public Usuario() {
    }

    public Usuario(Cliente cliente, String codUsuario, List<Modulo> moduloList, String nombresUsuario) {
        this.cliente = cliente;
        this.codUsuario = codUsuario;
        this.moduloList = moduloList;
        this.nombresUsuario = nombresUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cliente=" + cliente +
                ", codUsuario='" + codUsuario + '\'' +
                ", moduloList=" + moduloList +
                ", nombresUsuario='" + nombresUsuario + '\'' +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }

    public String getNombresUsuario() {
        return nombresUsuario;
    }

    public void setNombresUsuario(String nombresUsuario) {
        this.nombresUsuario = nombresUsuario;
    }
}
