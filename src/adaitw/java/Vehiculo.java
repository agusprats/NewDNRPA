package adaitw.java;

import java.time.LocalDate;
import java.util.*;


public class Vehiculo{
    protected Propietario propietario;
    protected String marca;
    protected List<Autorizados> autorizados = new ArrayList<>();
    protected boolean categoriaProfesional;
    protected int dominio;
    protected LocalDate fechaAlta;
    protected LocalDate nuevaFecha;
    protected boolean antiguedad;

    public Vehiculo() {
    }

    public Vehiculo(Propietario propietario, String marca) {
        this.propietario = propietario;
        this.autorizados = autorizados;
        this.categoriaProfesional = categoriaProfesional;
        this.dominio = dominio;
        this.fechaAlta = fechaAlta;
        this.nuevaFecha = nuevaFecha;
        this.antiguedad = antiguedad;
        this.marca = marca;
    }

    public Vehiculo(Propietario propietario, boolean categoriaProfesional) {
    }


    public int getDominio() {
        return dominio;
    }


    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCategoriaProfesional() {
        return categoriaProfesional;
    }

    public void setCategoriaProfesional(boolean categoriaProfesional) {
        this.categoriaProfesional = categoriaProfesional;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getNuevaFecha() {
        return nuevaFecha;
    }

    public void setNuevaFecha(LocalDate nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public Boolean getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Boolean antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                " Propietario = " + getPropietario() +
                // ", autorizados=" + autorizados +
                // ", categoriaProfesional=" + categoriaProfesional+
                // ", dominio=" + getDominio() +
                // ", fechaAlta=" + fechaAlta +
                // ", nuevaFecha=" + nuevaFecha +
                // ", cilindros=" + cilindros +
                // ", antiguedad=" + antiguedad +
                '}';
    }
}
