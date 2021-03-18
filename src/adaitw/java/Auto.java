package adaitw.java;

import java.util.Scanner;

public class Auto extends Vehiculo implements IVehiculo{
    private Motor motor;

    public Auto(Propietario propietario, String marca, boolean categoriaProfesional) {
        super(propietario, marca, categoriaProfesional);
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
    public String toString() {
        return "Auto{" +
                " Propietario: =" + getPropietario() +
                " MARCA: " + marca +
                " CATEGORIA: "+ getCategoriaProfesional()+
                " MOTOR: "+ motor.getSigno()+
                // ", dominio=" + dominio +
                '}';
    }
}
/* String motor = (esElectrico)?" (Eléctrico)":"(Combustión)";

        return "Propietario: "+propietario+"Motor: "+motor+" Marca: "+marca+ getCategoriaProfesional();*/