package App;

import Model.PersonaTuristica;
import Service.PersonaService;
import Util.ArchivoUtil;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<PersonaTuristica> lista =
                ArchivoUtil.cargarDatos("personas.csv");

        PersonaService service = new PersonaService(lista);

        System.out.println("=== LISTADO DE PERSONAS ===");
        service.mostrarPersonas();

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese nombre a buscar: ");
        String nombre = sc.nextLine();

        PersonaTuristica encontrada =
                service.buscarPorNombre(nombre);

        if (encontrada != null) {
            System.out.println("\nPersona encontrada:");
            System.out.println(encontrada);
        } else {
            System.out.println("\nNo existe registro.");
        }
    }
}