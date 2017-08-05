package com.amcor.amcorapp.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johel on 4/08/2017.
 */

public class UserResponse {

    @SerializedName("usuario")
    private Usuario usuario;
    @SerializedName("token")
    private String token;

    public UserResponse() {
    }

    public UserResponse(Usuario usuario, String token) {
        this.usuario = usuario;
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "usuario=" + usuario +
                ", token='" + token + '\'' +
                '}';
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
