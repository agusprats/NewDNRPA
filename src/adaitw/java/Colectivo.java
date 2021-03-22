package adaitw.java;

public class Colectivo extends Vehiculo implements IVehiculo{

    public Colectivo(String codigoV,Propietario propietario, String marca) {
        super(codigoV, propietario, marca);
    }

    public Colectivo() {
    }


    @Override
    public String toString() {
        return "COLECTIVO{" +
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
