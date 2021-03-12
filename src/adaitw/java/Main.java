package adaitw.java;


public class Main {

    public static void main(String[] args) {
        Dnrpa dnrpa = new Dnrpa();

        //TODO prueba:
        dnrpa.agregarVehiculosPrueba();
        dnrpa.listarVehiculos();

        //DOS MANERAS DE PREGUNTAR A QUE CLASE PERTENECE LO QUE PREGUNTO
        IVehiculo chevrolet = dnrpa.getVehiculoPorMarca("chevrolet");
       if(chevrolet.getClass().getSimpleName().equals("Auto")){
           System.out.println("Chevrolet es marca de un auto");
       }else{
           System.out.println("Chevrolet es marca de un camion");
       }

        IVehiculo unVehiculo =dnrpa.getVehiculoPorMarca("Ford");
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



    }
}

/*La DNRPA (Dirección Nac. Reg. Propiedad del Vehiculo) necesita un sistema para anotar todos
        los vehículos registrados en el país.
        La DNRPA tiene Registros seccionales.Ok
        Cada Registro tiene automotores registrados.Ok
        Los automotores pueden ser de uso particular o profesional. *** Ok ***
        Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones. *** Ok ***
        Todos los vehículos tienen un único propietario y uno o varios autorizados a conducir. *** Ok ***
        De los propietarios y autorizados se sabe el nombre, DNI y dirección. *** Ok ***

        1)Se desea poder listar todos los autos registrados en todas las seccionales = autos electricos y a combustion.  *** Ok ***
        2)Se desea poder listar a todos los propietarios (en orden alfabético) de camiones. *** Ok ***
        Opcionales:
        1) Cada automotor tiene una PATENTE unica que se asigna automáticamente al realizar el alta.
        2) Registrar fecha de alta. *** Ok ***
        3) Pueden cambiar de propietario. *** Ok ***
        4) Se debe registrar la fecha de cambio de propietario. *** Ok ***
        5) Se puede consultar si pasó un año o mas desde el registro o cambio de titular para un auto en particular. *** Ok ***
        */


//VISTA
        /*
        public static void ingresoAdministrador(){
            Administrador administrador = new Administrador();
            Scanner sc = new Scanner(System.in);

            boolean cont = true;
            while(cont){
                System.out.println("\n ***  PANEL ADMINISTRADOR  *** \n");
                System.out.println("1.CREAR VENDEDOR");
                System.out.println("2.CREAR CLIENTE");
                System.out.println("3.LISTAR VENDEDORES");
                System.out.println("4.LISTAR CLIENTES");
                System.out.println("5.VOLVER MENU PRINCIPAL");
                System.out.print("Ingrese la opción deseada: ");
                int choice2 = sc.nextInt();
                switch (choice2){
                    case 1:
                        administrador.crearVendedor();
                        break;
                    case 2:
                        administrador.crearCliente();
                        break;
                    case 3:
                        System.out.println(administrador.getVendedores());
                        break;
                    case 4:
                        System.out.println(administrador.getClientes());
                        break;
                    case 5:
                        cont= false;
                }
            }
        }

        public static void ingresoVendedor() {
            Vendedor v = new Vendedor();
            Oportunidad oportunidad = new Oportunidad();
            Scanner sc = new Scanner(System.in);

            boolean isRun = true;
            while(isRun){
                System.out.println("\n ***  PANEL VENDEDOR  *** \n");
                System.out.println("1.CREAR OPORTUNIDAD");
                System.out.println("2.CREAR CLIENTE");
                System.out.println("3.LISTAR OPORTUNIDADES");
                System.out.println("4.LISTAR CLIENTES");
                System.out.println("5.VOLVER MENU PRINCIPAL");
                System.out.print("Ingrese la opción deseada: ");
                int choice3 = sc.nextInt();
                switch (choice3) {
                    case 1:
                        v.crearOportunidad();
                        break;
                    case 2:
                        v.crearCliente();
                        break;
                    case 3:
                        v.getOportunidades();
                        break;
                    case 4:
                        System.out.println(v.getClientes());
                        break;
                    case 5:
                        isRun = false;
                }
            }
        }

        public static void main(String[] args) {
            while(true) {
                System.out.println();
                System.out.println("--- * MENU PRINCIPAL * ----");
                System.out.println("1.INGRESO ADMINISTRADOR");
                System.out.println("2.INGRESO VENDEDOR");
                System.out.println("3.EXIT");
                System.out.println("----------------------------");
                int choice1 = Consola.validateInt("Seleccionar (número): ", 1, 3);
                switch(choice1) {
                    case 1:
                        ingresoAdministrador();
                        break;
                    case 2:
                        ingresoVendedor();
                        break;
                    case 3:
                        System.exit(0);

                }

            }

        }*/