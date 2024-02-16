/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlador;

import com.modelo.Persona;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ktajt
 */
public class PersonaControlador {

    private static final String RutaArchivo = "D:\\Proyectos\\Programacion lll\\Datos\\personas.txt";

    public Persona BuscarPersona(UUID pPersonaId) {
        Persona persona = null;
        try {
            List<Persona> listadoPersonas = this.ObtenerPersonas();

            if (listadoPersonas == null || listadoPersonas.size() <= 0) {
                return null;
            }

            Optional<Persona> personaOptional = listadoPersonas.stream()
                    .filter(p -> p.getPersonaId().equals(pPersonaId))
                    .findFirst();

            persona = personaOptional.orElse(null);
        } catch (IOException ex) {
            Logger.getLogger(BoletoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return persona;
    }

    public Persona BuscarPersona(long pPersonaDocumento, String pPersonaNIT) {
        Persona persona = null;
        try {
            List<Persona> listadoPersonas = this.ObtenerPersonas();

            if (listadoPersonas == null || listadoPersonas.size() <= 0) {
                return null;
            }

            Optional<Persona> personaOptional = listadoPersonas.stream()
                    .filter(p -> p.getPersonaDocumento() == pPersonaDocumento)
                    .findFirst();

            if (!personaOptional.isPresent()) {
                personaOptional = listadoPersonas.stream()
                        .filter(p -> p.getPersonaNIT().equals(pPersonaNIT))
                        .findFirst();
            }

            persona = personaOptional.orElse(null);
        } catch (IOException ex) {
            Logger.getLogger(BoletoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return persona;
    }

    private List<Persona> ObtenerPersonas() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Persona> listadoPersonas = null;

        try {
            // Leer el archivo JSON y convertirlo a la lista de objetos Boleto
            listadoPersonas = objectMapper.readValue(new File(RutaArchivo),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Persona.class));
        } catch (IOException e) {
            // Si el archivo no existe, retornar null
            return null;
        }

        return listadoPersonas;
    }

    public static String ToJson(List<Persona> pListadoPersona) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // Crear un array JSON que contenga cada boleto
        ArrayNode personasNode = objectMapper.createArrayNode();
        for (Persona boleto : pListadoPersona) {
            ObjectNode boletoNode = objectMapper.valueToTree(boleto);
            personasNode.add(boletoNode);
        }

        // Configuración para que los corchetes estén en líneas distintas
        objectMapper.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, true);

        return objectMapper.writeValueAsString(personasNode);
    }

    public void GuardarPersona(Persona pPersona) throws IOException {
        List<Persona> listadoPersona = this.ObtenerPersonas();

        if (listadoPersona == null || listadoPersona.size() <= 0) {
            listadoPersona = new ArrayList<>();
        }

        listadoPersona.add(pPersona); // Agregar el nuevo boleto a la lista

        String jsonString = ToJson(listadoPersona);
        Files.write(Paths.get(RutaArchivo), jsonString.getBytes());

    }
}
