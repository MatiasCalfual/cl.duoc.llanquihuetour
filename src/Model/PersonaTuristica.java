package Model;

public class PersonaTuristica {

    private int id;
    private String nombre;
    private String tipo;
    private String comuna;

    public PersonaTuristica(int id, String nombre, String tipo, String comuna) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.comuna = comuna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nombre: " + nombre +
                ", Tipo: " + tipo +
                ", Comuna: " + comuna;
    }
}