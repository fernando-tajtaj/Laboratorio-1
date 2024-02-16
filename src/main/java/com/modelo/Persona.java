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
public class Persona {
    private UUID personaId;
    private String personaNombre;
    private long personaDocumento;
    private String personaNIT;

    public Persona() {
    }

    public UUID getPersonaId() {
        return personaId;
    }

    public void setPersonaId(UUID personaId) {
        this.personaId = personaId;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public long getPersonaDocumento() {
        return personaDocumento;
    }

    public void setPersonaDocumento(long personaDocumento) {
        this.personaDocumento = personaDocumento;
    }

    public String getPersonaNIT() {
        return personaNIT;
    }

    public void setPersonaNIT(String personaNIT) {
        this.personaNIT = personaNIT;
    }
    
    
}
