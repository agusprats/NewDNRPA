package adaitw.java;

import java.util.Scanner;

    public class Moto extends Vehiculo implements IVehiculo{
        private Motor motor;

        public Moto(String codigoV,Propietario propietario, String marca) {
            super(codigoV, propietario, marca);
            this.motor = motor;
        }

        public Moto(){

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
            return "MOTO{" +
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
    }

