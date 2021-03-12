package adaitw.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dnrpa {
    List<Seccional> seccionales = new LinkedList<>();
    List <IVehiculo> vehiculos = new LinkedList<>();
    Queue<String> turno = new LinkedList<>();

    public Dnrpa(List<IVehiculo>vehiculos){
        this.vehiculos = vehiculos;
    }

    public Dnrpa() {

    }


    public void agregarVehiculo(IVehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

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

    //TODO borrar: Prueba
    public void agregarVehiculosPrueba(){

        agregarVehiculo(new Auto(new Propietario("Jorge"),"peugeot",  true)) ;
        agregarVehiculo(new Auto(new Propietario("Leo"),"chevrolet", false ));
        agregarVehiculo(new Camion(new Propietario("Luis"), "Ford" ));
    }



}


 /*
        public void setDominios(Set<Integer> dominios) {
            for (int i = 001; i < 100; i++)
                dominios.add(i);
            Random nuevoDominio = new Random();
            IntStream dom = nuevoDominio.ints(100, 1000, 5000);
        }



        public void asignarDominio(){
            HashMap<Integer, Vehiculo> MapaVehiculo = new HashMap<>();

            Random aleatorio = new Random();
            int dominio = 0;
            for(int i=0;i<99;i++){
                dominio = aleatorio.nextInt(1)+1;
                MapaVehiculo.put(dominio, new Vehiculo());
            }
            MapaVehiculo.forEach((Integer, Vehiculo) -> System.out.println("Dominio"+Vehiculo.getDominio()));
            }
    */