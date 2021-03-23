package adaitw.java;

import java.util.Scanner;

public class Auto extends Vehiculo implements IVehiculo{
    private Motor motor;

    public Auto(String codigoV, Propietario propietario, String marca) {
        super(codigoV, propietario, marca);
        this.motor = motor;
    }

    public Auto(){

    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    @Override
    public String verFicha() {
        return " Motor{"+ motor.getSigno()+'}';
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void agregarV() {
        super.agregarV();
        Scanner scanner = new Scanner(System.in);
        System.out.println("MOTOR:\n ELECTRICO = e \n COMBUSTION = c ");
        String entry = scanner.next();
        Motor motor = Enum.valueOf(Motor.class, entry);
        setMotor(motor);
    }

    @Override
    public String toString() {
        return "Auto{" +
                " SECCIONAL: " + codigo +
                " CODIGO: " + codigoV +
                " Propietario: =" + getPropietario() +
                " - MARCA: " + marca +
                " - Dominio "+ dominio+
                " - CATEGORIA: "+ getCategoriaProfesional()+
                " - ALTA: "+ getFechaAlta()+
                " - MOTOR: "+ motor.getSigno()+
                " - AUTORIZADO: "+ getAutorizados()+
                '}';
    }
}
/* String motor = (esElectrico)?" (Eléctrico)":"(Combustión)";

        return "Propietario: "+propietario+"Motor: "+motor+" Marca: "+marca+ getCategoriaProfesional();*/