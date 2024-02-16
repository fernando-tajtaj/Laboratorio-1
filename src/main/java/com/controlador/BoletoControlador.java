/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlador;

import com.modelo.Boleto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ktajt
 */
public class BoletoControlador {

    private static final String RutaArchivo = "D:\\Proyectos\\Programacion lll\\Datos\\boletos.txt";

    public List<String> ObtenerAsientosReservados() {
        List<String> listadoAsientoReservado = null;
        try {
            List<Boleto> listadoBoleto = this.ObtenerBoletos();

            if (listadoBoleto == null || listadoBoleto.size() <= 0) {
                return null;
            }

            listadoAsientoReservado = new ArrayList<>();
            for (Boleto boleto : listadoBoleto) {
                listadoAsientoReservado.addAll(Arrays.asList(boleto.getBoletoAsientos().split(", ")));
            }

        } catch (IOException ex) {
            Logger.getLogger(BoletoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listadoAsientoReservado;
    }

    private List<Boleto> ObtenerBoletos() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Boleto> listadoBoleto = null;

        try {
            // Leer el archivo JSON y convertirlo a la lista de objetos Boleto
            listadoBoleto = objectMapper.readValue(new File(RutaArchivo),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Boleto.class));
        } catch (IOException e) {
            // Si el archivo no existe, retornar null
            return null;
        }

        return listadoBoleto;
    }
    
    public Boleto BuscarBoletoAsiento(String pBoletoAsiento){
        Boleto boleto = null;
        List<Boleto> listadoBoletos = null;

        try {
            listadoBoletos = this.ObtenerBoletos();
        } catch (IOException ex) {
            Logger.getLogger(BoletoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (listadoBoletos == null || listadoBoletos.size() <= 0) {
            return null;
        }

        Optional<Boleto> boletoOptional = listadoBoletos.stream()
                .filter(b -> b.getBoletoAsientos().contains(pBoletoAsiento))
                .findFirst();

        boleto = boletoOptional.orElse(null);
        
        return boleto;
    }

    public Boleto BuscarBoletoPersona(UUID pIdPersona) {
        Boleto boleto = null;
        List<Boleto> listadoBoletos = null;

        try {
            listadoBoletos = this.ObtenerBoletos();
        } catch (IOException ex) {
            Logger.getLogger(BoletoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (listadoBoletos == null || listadoBoletos.size() <= 0) {
            return null;
        }

        Optional<Boleto> boletoOptional = listadoBoletos.stream()
                .filter(b -> b.getIdPersona() == pIdPersona)
                .findFirst();

        boleto = boletoOptional.orElse(null);
        
        return boleto;
    }

    public String ToJson(List<Boleto> listaBoletos) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // Crear un array JSON que contenga cada boleto
        ArrayNode boletosNode = objectMapper.createArrayNode();
        for (Boleto boleto : listaBoletos) {
            ObjectNode boletoNode = objectMapper.valueToTree(boleto);
            boletosNode.add(boletoNode);
        }

        // Configuración para que los corchetes estén en líneas distintas
        objectMapper.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, true);

        return objectMapper.writeValueAsString(boletosNode);
    }

    public void GuardarBoleto(Boleto boleto) throws IOException {
        List<Boleto> listadoBoleto = ObtenerBoletos();

        if (listadoBoleto == null || listadoBoleto.size() <= 0) {
            listadoBoleto = new ArrayList<>();
        }

        listadoBoleto.add(boleto); // Agregar el nuevo boleto a la lista

        String boletoJson = ToJson(listadoBoleto);
        Files.write(Paths.get(RutaArchivo), boletoJson.getBytes());
    }
}
