package com.bo.openlogics.core.bean;

import java.io.Serializable;

/**
 * Created by json on 9/10/14.
 */
public class ArticulosReportes implements Serializable {
    private Long id;
    private Double precioCosto ;
    private byte[] upc ;
    private String descripcionArticulo;
    private String codigoArticulo;

    public ArticulosReportes() {
    }

    public ArticulosReportes(Long id, Double precioCosto, byte[] upc) {
        this.id = id;
        this.precioCosto = precioCosto;
        this.upc = upc;
    }

    public ArticulosReportes(Long id, Double precioCosto, byte[] upc, String descripcionArticulo) {
        this.id = id;
        this.precioCosto = precioCosto;
        this.upc = upc;
        this.descripcionArticulo = descripcionArticulo;
    }

    public ArticulosReportes(Long id, Double precioCosto, byte[] upc, String descripcionArticulo, String codigoArticulo) {
        this.id = id;
        this.precioCosto = precioCosto;
        this.upc = upc;
        this.descripcionArticulo = descripcionArticulo;
        this.codigoArticulo = codigoArticulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public byte[] getUpc() {
        return upc;
    }

    public void setUpc(byte[] upc) {
        this.upc = upc;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }
}
