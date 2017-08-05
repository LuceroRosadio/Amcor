package com.amcor.amcorapp.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johel on 4/08/2017.
 */

public class OpcionModulo {

    @SerializedName("codOpcion")
    private String codOpcion;
    @SerializedName("codPerfil")
    private String codPerfil;
    @SerializedName("estadoOpcion")
    private String estadoOpcion;
    @SerializedName("nombreOpcion")
    private String nombreOpcion;

    public OpcionModulo() {
    }

    public OpcionModulo(String codOpcion, String codPerfil, String estadoOpcion, String nombreOpcion) {
        this.codOpcion = codOpcion;
        this.codPerfil = codPerfil;
        this.estadoOpcion = estadoOpcion;
        this.nombreOpcion = nombreOpcion;
    }

    @Override
    public String toString() {
        return "OpcionModulo{" +
                "codOpcion='" + codOpcion + '\'' +
                ", codPerfil='" + codPerfil + '\'' +
                ", estadoOpcion='" + estadoOpcion + '\'' +
                ", nombreOpcion='" + nombreOpcion + '\'' +
                '}';
    }

    public String getCodOpcion() {
        return codOpcion;
    }

    public void setCodOpcion(String codOpcion) {
        this.codOpcion = codOpcion;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    public String getEstadoOpcion() {
        return estadoOpcion;
    }

    public void setEstadoOpcion(String estadoOpcion) {
        this.estadoOpcion = estadoOpcion;
    }

    public String getNombreOpcion() {
        return nombreOpcion;
    }

    public void setNombreOpcion(String nombreOpcion) {
        this.nombreOpcion = nombreOpcion;
    }
}
