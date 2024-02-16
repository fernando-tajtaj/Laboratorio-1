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
public class Session {
    private static Session instance;
    private UUID idTemporal;

    private Session() {
        // Evita que se creen instancias adicionales
    }

    public static synchronized Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public UUID getIdTemporal() {
        return idTemporal;
    }

    public void setIdTemporal(UUID idTemporal) {
        this.idTemporal = idTemporal;
    }

    public void clearSession() {
        idTemporal = null;
    }
}
