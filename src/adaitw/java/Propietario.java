package adaitw.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Propietario {
    protected String nombre;
    protected String direccion;
    protected String dni;


    public Propietario() {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;

    }

    public Propietario(String propietario){

    }
    public Propietario(String nombre, String dni, String direccion){
        this.nombre= nombre;
        this.dni= dni;
        this.direccion= direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Propietario{" +
                " Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", DNI='" + dni + '\'' +
                '}';
    }
}
