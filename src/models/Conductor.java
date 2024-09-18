package models;

public class Conductor {
    private int id;
    private String nombre;
    private int edad;

    public Conductor(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Conductor() {

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
