package com.mycompany.actividad6;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    // Especifica la ruta completa donde quieres guardar el archivo
    private static final String FILE_PATH = "C:/Users/pipe/Desktop/POO UNAL/Actividad6/Actividad6/registros.txt";

    // Método para crear un registro
    public static void createRecord(String id, String name) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) { // Abrir en modo append
            writer.write(id + "," + name + "\n"); // Escribir el ID y el Nombre
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores
        }
    }
}

