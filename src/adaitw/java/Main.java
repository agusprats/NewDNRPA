package adaitw.java;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dnrpa dnrpa = new Dnrpa();
        List<Seccional> seccionales = new ArrayList<>();
        List<Camion> camiones = new ArrayList<>();
        Seccional S1 = new Seccional();
        Seccional S2 = new Seccional();
        Seccional S3 = new Seccional();
        Seccional S4 = new Seccional();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("        D.N.R.P.A.         ");
            System.out.println("--- * MENU PRINCIPAL * ----");
            System.out.println("1.CREAR SECCIONAL");
            System.out.println("2.LISTAR SECCIONALES");
            System.out.println("3.CARGAR VEHICULO en SECCIONAL Nº 1");
            System.out.println("4.CARGAR VEHICULO en SECCIONAL Nº 2");
            System.out.println("5.CARGAR VEHICULO en SECCIONAL Nº 3");
            System.out.println("6.CARGAR VEHICULO en SECCIONAL Nº 4");
            System.out.println("7.TOTAL VEHICULOS");
            System.out.println("11.SALIR");
            System.out.println("----------------------------");
            int option1 = Consola.validateInt("INGRESAR OPCION: ",1,11);
            switch (option1) {
                case 1:
                    dnrpa.cargarNuevaSeccional();
                    break;
                case 2:
                    dnrpa.listarSeccionales();
                    break;
                case 3:
                    S1.agregarVehiculo();
                    break;
                case 4:
                    S2.agregarVehiculo();
                    break;
                case 5:
                    S3.agregarVehiculo();
                    break;
                case 6:
                    S4.agregarVehiculo();
                    break;
                case 7:
                    System.out.println("S1: "+S1+"\n S2: "+S2+"\n S3:"+S3+"\n4: "+S4);
                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    break;
                case 11:
                    System.exit(0);


            }

        }

    }

}



/*

La DNRPA (Dirección Nac. Reg. Propiedad del Automotor) necesita un sistema para anotar todos los vehículos registrados en el país.
La DNRPA tiene Registros seccionales.
Cada Registro tiene automotores registrados.

Los automotores pueden ser de uso particular o profesional.ok
Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones.

Todos los vehículos tienen un único propietario y autorizados a conducir.ok
De los propietarios y autorizados se sabe el nombre, DNI y dirección.ok

Herramientas de java obligatorias:
Enums, excepciones, random, listas, interfaces, herencia, Date o LocalDate.
Consignas obligatorias:
	•	Se desea poder listar todos los autos registrados en todas las seccionales.ok
	•	Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.
	•	Los automotores pueden cambiar de propietario.
	•	Se debe registrar la fecha de cambio de propietario.
	•	Se debe poder dar de alta un nuevo automotor. Registrar esa fecha también.ok
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