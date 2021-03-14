package adaitw.java;

public class Auto extends Vehiculo implements IVehiculo{
    private boolean esElectrico;

    public Auto(Propietario propietario, String marca, boolean esElectrico, boolean categoriaProfesional) {
        super(propietario, marca, categoriaProfesional);
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

        return "Propietario: "+propietario+"Motor: "+motor+" Marca: "+marca+ getCategoriaProfesional();
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
                "Categoria"+ categoriaProfesional+
                // ", dominio=" + dominio +
                '}';
    }
}
