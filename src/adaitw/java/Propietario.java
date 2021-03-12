package adaitw.java;

public class Propietario {
    protected String nombre;
    protected String direccion;
    protected String dni;

    public Propietario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                " Nombre='" + nombre + '\'' +
               // ", direccion='" + direccion + '\'' +
               // ", dni='" + dni + '\'' +
                '}';
    }
}
