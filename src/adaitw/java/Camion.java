package adaitw.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Camion extends Vehiculo implements IVehiculo{

    public Camion(String codigoV ,Propietario propietario, String marca) {
        super(codigoV, propietario, marca);
    }

    public Camion() {

    }


    @Override
    public String toString() {
        return "Camion{" +
                " SECCIONAL: " + codigo +
                " CODIGO: " + codigoV +
                " Propietario: =" + getPropietario() +
                " MARCA: " + marca +
                " - DOMINIO "+ dominio+
                " - CATEGORIA: "+ getCategoriaProfesional()+
                " - ALTA: "+ getFechaAlta()+
                " - AUTORIZADO: "+ getAutorizados()+
                '}';
    }

    @Override
    public String verFicha() {
        return "Propietario: "+propietario+" Marca: "+marca+ getCategoriaProfesional();
    }

    @Override
    public String getMarca() {
        return marca;
    }




}
