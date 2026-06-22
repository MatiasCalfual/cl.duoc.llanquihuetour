package Service;

import Model.PersonaTuristica;

import java.util.ArrayList;

public class PersonaService {

    private ArrayList<PersonaTuristica> personas;

    public PersonaService(ArrayList<PersonaTuristica> personas) {
        this.personas = personas;
    }

    public void mostrarPersonas() {

        for (PersonaTuristica p : personas) {
            System.out.println(p);
        }
    }

    public PersonaTuristica buscarPorNombre(String nombre) {

        for (PersonaTuristica p : personas) {

            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }

        return null;
    }
}
