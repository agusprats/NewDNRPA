package adaitw.java;

public class Auto extends Vehiculo implements IVehiculo{
    private boolean esElectrico;

    public Auto(Propietario propietario, String marca, boolean esElectrico) {
        super(propietario, marca);
        this.esElectrico = esElectrico;
    }

    public Auto(){

    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    @Override
    public String verFicha() {
        String motor = (esElectrico)?" (Eléctrico)":"(Combustión)";

        return "Propietario: "+propietario+"Motor: "+motor+" Marca: "+marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }


    @Override
    public String toString() {
        return "Auto{" +
                " Propietario=" + propietario +
                " Marca=" + marca +
                // ", dominio=" + dominio +
                '}';
    }
}
