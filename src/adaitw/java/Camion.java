package adaitw.java;

public class Camion extends Vehiculo implements IVehiculo{

    public Camion(Propietario propietario, String marca, boolean categoriaProfesional) {
        super(propietario, marca, categoriaProfesional);
    }

    public Camion() {

    }


    @Override
    public String toString() {
        return "Camion{" +
                " Propietario=" + propietario +
                " Marca=" + marca +
              //  ", dominio=" + dominio +
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
