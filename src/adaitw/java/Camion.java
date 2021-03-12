package adaitw.java;

public class Camion extends Vehiculo implements IVehiculo{

    public Camion(Propietario propietario, String marca) {
        super(propietario, marca);
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
        return "Propietario: "+propietario+" Marca: "+marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }


}
