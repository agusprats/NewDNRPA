package adaitw.java;

public class Utilitario extends Vehiculo implements IVehiculo{

    public Utilitario(String codigoV, Propietario propietario, String marca) {
        super(codigoV, propietario, marca);
    }

    public Utilitario() {

    }


    @Override
    public String toString() {
        return "UTILITARIOS {" +
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
