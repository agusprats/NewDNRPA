package adaitw.java;

import java.util.Scanner;

public class Autorizados extends Propietario{
    public Autorizados(String nombre) {
        super(nombre);
    }

    public Autorizados() {

    }

    @Override
    public String toString() {
        return "Autorizados{" +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", DNI='" + dni + '\'' +
                '}';
    }
}
