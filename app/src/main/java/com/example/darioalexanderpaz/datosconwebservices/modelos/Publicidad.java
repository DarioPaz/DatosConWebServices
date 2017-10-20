package com.example.darioalexanderpaz.datosconwebservices.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dario Alexander Paz on 19/10/2017.
 */

public class Publicidad {

    @SerializedName("anunciante")
    @Expose
    private String anunciante;
    @SerializedName("area_mtr2")
    @Expose
    private String areaMtr2;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("fecha_expiracion")
    @Expose
    private String fechaExpiracion;
    @SerializedName("observacion")
    @Expose
    private String observacion;
    @SerializedName("propietario")
    @Expose
    private String propietario;
    @SerializedName("tipo_elemento")
    @Expose
    private String tipoElemento;

    public String getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(String anunciante) {
        this.anunciante = anunciante;
    }

    public String getAreaMtr2() {
        return areaMtr2;
    }

    public void setAreaMtr2(String areaMtr2) {
        this.areaMtr2 = areaMtr2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }



}
