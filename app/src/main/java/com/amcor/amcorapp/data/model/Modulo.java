package com.amcor.amcorapp.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by johel on 4/08/2017.
 */

public class Modulo {

    @SerializedName("codModulo")
    private String codModulo;
    @SerializedName("nombreModulo")
    private String nombreModulo;
    @SerializedName("opciones")
    private List<OpcionModulo> opcionModuloList;

    public Modulo() {
    }

    public Modulo(String codModulo, String nombreModulo, List<OpcionModulo> opcionModuloList) {
        this.codModulo = codModulo;
        this.nombreModulo = nombreModulo;
        this.opcionModuloList = opcionModuloList;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "codModulo='" + codModulo + '\'' +
                ", nombreModulo='" + nombreModulo + '\'' +
                ", opcionModuloList=" + opcionModuloList +
                '}';
    }

    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public List<OpcionModulo> getOpcionModuloList() {
        return opcionModuloList;
    }

    public void setOpcionModuloList(List<OpcionModulo> opcionModuloList) {
        this.opcionModuloList = opcionModuloList;
    }
}
