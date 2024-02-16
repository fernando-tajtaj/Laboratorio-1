/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

import java.util.UUID;

/**
 *
 * @author ktajt
 */
public class Boleto {

    private UUID boletoId;
    private UUID idPersona;
    private String boletoAsientos;
    private double boletoPrecioAsiento;
    private double boletoTotal;
    private String boletoFechaCreacion;

    public UUID getBoletoId() {
        return boletoId;
    }

    public void setBoletoId(UUID boletoId) {
        this.boletoId = boletoId;
    }

    public UUID getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(UUID idPersona) {
        this.idPersona = idPersona;
    }

    public String getBoletoAsientos() {
        return boletoAsientos;
    }

    public void setBoletoAsientos(String boletoAsientos) {
        this.boletoAsientos = boletoAsientos;
    }

    public double getBoletoPrecioAsiento() {
        return boletoPrecioAsiento;
    }

    public void setBoletoPrecioAsiento(double boletoPrecioAsiento) {
        this.boletoPrecioAsiento = boletoPrecioAsiento;
    }

    public double getBoletoTotal() {
        return boletoTotal;
    }

    public void setBoletoTotal(double boletoTotal) {
        this.boletoTotal = boletoTotal;
    }

    public String getBoletoFechaCreacion() {
        return boletoFechaCreacion;
    }

    public void setBoletoFechaCreacion(String boletoFechaCreacion) {
        this.boletoFechaCreacion = boletoFechaCreacion;
    }

    
}
