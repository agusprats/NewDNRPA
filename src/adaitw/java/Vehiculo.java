package adaitw.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Vehiculo extends Seccional{
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

    public Vehiculo(Propietario propietario, String marca, boolean categoriaProfesional) {
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

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public int getDominio() {
        return dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoriaProfesional() {
        if(categoriaProfesional){
            return "PROFESIONAL";
        }else{
            return "PARTICULAR";
        }

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

    // Nuevo Propietario
    public void cambiaPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String nuevoPropietario() {
        return "El nuevo Titular del vehiculo es: " + propietario;
    }


    // Fecha de Alta de Nuevo Propietario
    public void asignarAltaNuevoTitular(LocalDate nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public String fechaCambioTitular() {
        return "Nueva Alta: " + nuevaFecha;
    }

    public void setAntiguedad(Boolean antiguedad) {
        this.antiguedad = antiguedad;
    }
    //Antiguedad desde fecha en registro
    public String antiguedad() {
        LocalDate start_date = (nuevaFecha==null) ? fechaAlta : nuevaFecha;
        LocalDate end_date = LocalDate.now();
        Period diff = Period.between(start_date, end_date);

        if(diff.getYears() >= 1){
            return "Transcurrió UN AÑO desde ALTA o CAMBIO TITULAR: \n"+diff.getYears()+" Año - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
        }else{
            return "No tiene un año desde ALTA o CAMBIO TITULAR: \n"+diff.getYears()+" Año/s - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
        }
    }

    //Autorizados:
    public void agregarAutorizado(Autorizados autorizados) {
        this.autorizados.add(autorizados);
    }

    public List<Autorizados> getAutorizados() {
        return autorizados;
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

    public void setMotor(Motor motor) {
    }
}

/*String categoria = (categoriaProfesional) ? " Categoría Profesional":" Categoría Particular";
        return categoria;*/