package adaitw.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Seccional extends Dnrpa {
    protected String codigo;
    List<Vehiculo> vehiculos = new ArrayList<>();
    List<Auto> autos = new ArrayList<>();
    List<Moto> motos = new ArrayList<>();
    List<Camion> camiones = new ArrayList<>();
    List<Colectivo> colectivos = new ArrayList<>();
    List<Utilitario> utilitarios = new ArrayList<>();


    public Seccional(String codigo) {
        setCodigo(codigo);
        this.vehiculos = vehiculos;
    }

    public Seccional(List <Vehiculo> vehiculos){
        this.vehiculos=vehiculos;
    }

    public Seccional() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (Consola.validarString(codigo, 3))
            this.codigo = codigo;
        else
            throw new DatosIncorrectosException("CODIGO INCORRECTO");
    }

    public void listarVehiculos(){
        for(Vehiculo vehiculo: vehiculos)
            System.out.println(vehiculo.verFicha());
    }


    public void getAutos() {
        for(Auto a: autos) System.out.println(a);
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public void getCamiones() {
        for(Camion c: camiones) System.out.println(c);
    }

    public void setCamiones(List<Camion> camiones) {
        this.camiones = camiones;
    }

    public void getMotos() {
        for(Moto m :motos) System.out.println(m);
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }

    public void getColectivos() {
        for(Colectivo co :colectivos) System.out.println(co);
    }

    public void setColectivos(List<Colectivo> colectivos) {
        this.colectivos = colectivos;
    }

    public  List<Utilitario> getUtilitarios() {
        return utilitarios;
    }

    public void setUtilitarios(List<Utilitario> utilitarios) {
        this.utilitarios = utilitarios;
    }

    public void agregarVehiculo() {
        boolean running = true;
        while (running) {
            System.out.println(" ------------------------");
            System.out.println(" *** ELEGIR VEHICULO ***");
            System.out.println("1.AGREGAR AUTO");
            System.out.println("2.AGREGAR CAMION");
            System.out.println("3.AGREGAR MOTO");
            System.out.println("4.AGREGAR COLECTIVO");
            System.out.println("5.AGREGAR UTILITARIO");
            System.out.println("10. VOLVER MENU ANTERIOR");
            int option2 = Consola.validateInt("INGRESAR OPCION: ", 1, 11);
            switch (option2) {
                case 1:
                    Auto auto = new Auto();
                    auto.agregarV();
                    auto.agregarAutorizado();
                    autos.add(auto);
                    break;
                case 2:
                    Camion camion = new Camion();
                    camion.agregarV();
                    camion.agregarAutorizado();
                    camiones.add(camion);
                    listarCamiones(camiones);
                    break;
                case 3:
                    Moto moto = new Moto();
                    moto.agregarV();
                    moto.agregarAutorizado();
                    motos.add(moto);
                    break;
                case 4:
                    Colectivo colectivo = new Colectivo();
                    colectivo.agregarV();
                    colectivo.agregarAutorizado();
                    colectivos.add(colectivo);
                    break;
                case 5:
                    Utilitario utilitario = new Utilitario();
                    utilitario.agregarV();
                    utilitario.agregarAutorizado();
                    utilitarios.add(utilitario);
                    break;
                case 6:
                    getAutos();
                    Auto a1 = new Auto();
                    a1.cambiarPropietario("VE1");
                    break;
                case 10:
                    running = false;
            }

        }
    }

    public void listarCamiones(){
        camiones.forEach((camion)->{ System.out.println("Listado CAMIONES [A-Z]: "+camion.getPropietario());
        });
    }


    public void listarCamiones(List <Camion> camiones){
        Collections.sort(camiones, new Comparator<Camion>() {
            @Override
            public int compare(Camion o1, Camion o2) {
                return o1.propietario.nombre.compareTo(o2.propietario.nombre);
            }
        });
        camiones.forEach((camion)->{ System.out.println("Listado CAMIONES [A-Z]: "+camion.getPropietario());
        });

    }


    @Override
    public String toString() {
        return "Seccional{" +
                "\n CODIGO: " + getCodigo()+
                "\n AUTOS: " + autos+
                "\n CAMIONES: " + camiones+
                "\n MOTOS: " + motos +
                "\n COLECTIVOS: " + colectivos +
                "\n UTILITARIOS: " + getUtilitarios() +
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

    /* public void agregarVehiculo(Vehiculo vehiculo){
            vehiculos.add(vehiculo);

    public void agregarMuchosVehiculos(){

        agregarVehiculo(new Auto("A1",(new Propietario("Carlos", "www", "dddd")), "FORD" ));
        agregarVehiculo(new Auto("A2",(new Propietario("Jose", "wrr", "dttd")), "FIAT" ));
        Auto A1 = new Auto("A1",(new Propietario("Carlos", "www", "dddd")), "FORD" );
        Auto A2 = new Auto("A2",(new Propietario("Jose", "lll", "dood")), "FIAT" );
        autos.add(A1);
        autos.add(A2);

    } }*/

/*  public Vehiculo getVehiculoPorCodigo(String codigoV){
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.getCodigoV().equals(codigoV)){
                return vehiculo;
            }
        }
        return null;
    }
*/