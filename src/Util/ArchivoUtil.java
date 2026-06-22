package Util;

import Model.PersonaTuristica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<PersonaTuristica> cargarDatos(String ruta) {

        ArrayList<PersonaTuristica> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String tipo = datos[2];
                String comuna = datos[3];

                lista.add(new PersonaTuristica(id, nombre, tipo, comuna));
            }

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
}