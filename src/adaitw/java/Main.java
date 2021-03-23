package adaitw.java;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dnrpa dnrpa = new Dnrpa();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("        D.N.R.P.A.         ");
            System.out.println("--- * MENU PRINCIPAL * ----");
            System.out.println("1.NUEVA CARGA");
            System.out.println("2.TOTAL VEHICULOS");
            System.out.println("3.LISTAR SECCIONAL Nº 1");
            System.out.println("4.LISTAR SECCIONAL Nº 2");
            System.out.println("5.LISTAR SECCIONAL Nº 3");
            System.out.println("6.LISTAR SECCIONAL Nº 4");
            System.out.println("7.LISTAR NUEVA SECCIONAL");
            System.out.println("11.SALIR");
            System.out.println("----------------------------");
            int option1 = Consola.validateInt("INGRESAR OPCION: ",1,11);
            switch (option1) {
                case 1:
                    dnrpa.cargar();
                    break;
                case 2:
                    System.out.println(dnrpa.getSeccionales());
                    break;
                case 3:
                    System.out.println(dnrpa.seccionales.get(0));
                    break;
                case 4:
                    System.out.println(dnrpa.seccionales.get(1));
                    break;
                case 5:
                    System.out.println(dnrpa.seccionales.get(2));
                    break;
                case 6:
                    System.out.println(dnrpa.seccionales.get(3));
                    break;
                case 7:
                    System.out.println(dnrpa.seccionales.get(4));
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
	•	Se desea poder listar todos los autos registrados en todas las seccionales. Ok
	•	Se desea poder listar a todos los propietarios (en orden alfabético) de camiones. Ok
	•	Los automotores pueden cambiar de propietario.
	•	Se debe registrar la fecha de cambio de propietario.
	•	Se debe poder dar de alta un nuevo automotor. Registrar esa fecha también. Ok
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