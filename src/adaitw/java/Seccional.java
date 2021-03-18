package adaitw.java;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Seccional extends Dnrpa{
    protected String codigo;
    List<IVehiculo> vehiculos = new LinkedList<>();
    List<Auto> autos= new ArrayList<>();
    List<Camion> camiones= new ArrayList<>();


    public Seccional( ) {
        this.vehiculos = vehiculos;
    }

    public Seccional(String codigo){
        this.codigo= codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(List<Camion> camiones) {
        this.camiones = camiones;
    }

    public void agregarVehiculo() {
        boolean running = true;
        while (running) {
            System.out.println("1.AGREGAR AUTO");
            System.out.println("2.AGREGAR CAMION");
            System.out.println("10. VOLVER MENU PRINCIPAL");
            int option2 = Consola.validateInt("INGRESAR OPCION: ", 1, 11);
            switch (option2) {
                case 1:
                    agregarAuto();
                    break;
                case 2:
                    agregarCamion();
                    break;
                case 10:
                    running = false;
            }

        }
    }

    public void agregarAuto(){
        Scanner scanner = new Scanner(System.in);
        Auto nuevoAuto = new Auto();
        System.out.println("MARCA: ");
        String marca= scanner.next();
        nuevoAuto.setMarca(marca);
        System.out.println("Propietario: ");
        Propietario propietario = new Propietario();
        String nombre = scanner.next();
        propietario.setNombre(nombre);
        System.out.println("DNI: ");
        String dni = scanner.next();
        propietario.setDni(dni);
        System.out.println("Domicilio: ");
        String direccion = scanner.next();
        propietario.setDireccion(direccion);
        nuevoAuto.setPropietario(propietario);
        nuevoAuto.setCategoriaProfesional(Boolean.parseBoolean(Consola.validarCatPro("CATEGORIA PROFESIONAL (true/false)")));
        System.out.println("electrico / combustion ");
        String entry = scanner.next();
        Motor motor = Enum.valueOf(Motor.class, entry);
        nuevoAuto.setMotor(motor);
        nuevoAuto.setFechaAlta(LocalDate.parse(Consola.validarFechaAlta("FECHA ALTA: (YYYY-MM-DD):")));
        autos.add(nuevoAuto);
    }
    public void agregarCamion(){
        Scanner scanner = new Scanner(System.in);
        Camion nuevoCamion = new Camion();
        System.out.println("MARCA: ");
        String marca= scanner.next();
        nuevoCamion.setMarca(marca);
        System.out.println("Propietario: ");
        Propietario propietario = new Propietario();
        String nombre = scanner.next();
        propietario.setNombre(nombre);
        System.out.println("DNI: ");
        String dni = scanner.next();
        propietario.setDni(dni);
        System.out.println("Domicilio: ");
        String direccion = scanner.next();
        propietario.setDireccion(direccion);
        nuevoCamion.setPropietario(propietario);
        nuevoCamion.setCategoriaProfesional(Boolean.parseBoolean(Consola.validarCatPro("CATEGORIA PROFESIONAL (true/false)")));
        nuevoCamion.setFechaAlta(LocalDate.parse(Consola.validarFechaAlta("FECHA ALTA REGISTRO: (YYYY-MM-DD):")));
        camiones.add(nuevoCamion);
    }


    @Override
    public String toString() {
        return "Seccional{" +
                "codigo=" + getCodigo() +
               // ", vehiculos :" + vehiculos +
                ", autos : " + getAutos() +
                ", camiones : " + getCamiones() +
                '}';
    }
}


/*
    public void listarVehiculos(){
        for(IVehiculo vehiculo: vehiculos){
            System.out.println(vehiculo.verFicha());
        }
    }

    public IVehiculo getVehiculoPorMarca(String marca){
        for(IVehiculo vehiculo: vehiculos){
            if(vehiculo.getMarca().equals(marca)){
                return vehiculo;
            }
        }
        return null;
    }

*/
