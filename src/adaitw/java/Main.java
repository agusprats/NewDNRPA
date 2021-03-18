package adaitw.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dnrpa dnrpa = new Dnrpa();
        Seccional seccionales = new Seccional();
        List <Camion> camiones = new ArrayList<>();
        List<Auto> autos= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("        D.N.R.P.A.         ");
            System.out.println("--- * MENU PRINCIPAL * ----");
            System.out.println("1.CREAR SECCIONAL");
            System.out.println("2.LISTAR SECCIONALES");
            System.out.println("3.CARGAR NUEVO VEHICULO");
            System.out.println("4.Listar AUTOS ");
            System.out.println("5.Listar CAMIONES ");
            System.out.println("10.SALIR");
            System.out.println("----------------------------");

            int option1 = Consola.validateInt("INGRESAR OPCION: ",1,11);
            switch (option1) {
                case 1:
                    dnrpa.agregarSeccional();
                    break;
                case 2:
                    System.out.println(dnrpa.getSeccionales());
                    break;
                case 3:
                    seccionales.agregarVehiculo();
                    break;
                case 4:
                    System.out.println(seccionales.getAutos());
                    break;
                case 5:
                    System.out.println(seccionales.getCamiones());
                    break;
                case 10:
                    System.exit(0);

            }

        }
    }
}






/*

La DNRPA (Dirección Nac. Reg. Propiedad del Automotor) necesita un sistema para anotar todos los vehículos registrados en el país.
La DNRPA tiene Registros seccionales.
Cada Registro tiene automotores registrados.

Los automotores pueden ser de uso particular o profesional.
Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones.

Todos los vehículos tienen un único propietario y autorizados a conducir.
De los propietarios y autorizados se sabe el nombre, DNI y dirección.

Herramientas de java obligatorias:
Enums, excepciones, random, listas, interfaces, herencia, Date o LocalDate.
Consignas obligatorias:
	•	Se desea poder listar todos los autos registrados en todas las seccionales.
	•	Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.
	•	Los automotores pueden cambiar de propietario.
	•	Se debe registrar la fecha de cambio de propietario.
	•	Se debe poder dar de alta un nuevo automotor. Registrar esa fecha también.
	•	No se puede cambiar de propietario si pasó menos de 1 año desde la fecha del último cambio de propietario.
Consignas opcionales:
	•	Cada automotor tiene una PATENTE única que se asigna automáticamente al realizar el alta o registro. Formatos de patente: AA123BB o ABC123.
	•	Se puede consultar si pasó un año o más desde el registro o cambio de titular, para un auto en particular (se consulta por patente).


Moto extends Automotor implements VehiculoACombustion
MotoElectrica extends Automotor implements VehiculoElectrico
Autos extends Automotor implements VehiculoACombustion
AutoElectrico extends Automotor implements VehiculoElectrico
Colectivo extends Automotor implements VehiculoACombustion
MotoElectrica me = new MotoElectrica();
AutoElectrico ae = new AutoElectrico();
ae.indicarVoltaje();
me.indicarVoltaje();
        */


       /*
        dnrpa.add(new Seccional("S1"));
        dnrpa.add(new Seccional("S2"));
        dnrpa.add(new Seccional("S3"));

        //TODO prueba:
        seccionales.agregarVehiculosPrueba();

        seccionales.listarVehiculos();

        dnrpa.agregarSeccionalesPrueba();
        System.out.println(dnrpa.getSeccionales());


        //DOS MANERAS DE PREGUNTAR A QUE CLASE PERTENECE LO QUE PREGUNTO
        IVehiculo chevrolet = seccionales.getVehiculoPorMarca("chevrolet");
       if(chevrolet.getClass().getSimpleName().equals("Auto")){
           System.out.println("Chevrolet es marca de un auto");
       }else{
           System.out.println("Chevrolet es marca de un camion");
       }

        IVehiculo unVehiculo = seccionales.getVehiculoPorMarca("Ford");
        if(unVehiculo instanceof Auto){
            System.out.println(unVehiculo.getMarca()+" es un Auto");
            Auto autoA = (Auto) unVehiculo;
            String motor = (autoA.isEsElectrico())?"ES ELECTRICO!":"NO ELECTRICO!";
            System.out.println(motor);
        }else if(unVehiculo instanceof Camion){
            System.out.println(unVehiculo.getMarca()+" es un CAMION");
            Camion camionC = (Camion) unVehiculo;
            System.out.println("Y su MARCA es: "+camionC.getMarca());
        }else{
            System.out.println("ERROR!");
        }
*/