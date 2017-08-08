package com.amcor.amcorapp.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by johel on 4/08/2017.
 */

public class Cliente implements Serializable {

    @SerializedName("codCliente")
    private String codCliente;
    @SerializedName("correo")
    private String correo;
    @SerializedName("nombreCliente")
    private String nombreCliente;

    public Cliente() {
    }

    public Cliente(String codCliente, String correo, String nombreCliente) {
        this.codCliente = codCliente;
        this.correo = correo;
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente='" + codCliente + '\'' +
                ", correo='" + correo + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                '}';
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
