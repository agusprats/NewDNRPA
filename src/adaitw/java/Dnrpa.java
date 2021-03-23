package adaitw.java;

import java.util.*;

public class Dnrpa {
    List<Seccional> seccionales = new ArrayList<>();
    Queue<String> turno = new LinkedList<>();


    public void listarSeccionales() {
        for(Seccional se : seccionales)
            System.out.println(se);
    }

    public void setSeccionales(List<Seccional> seccionales) {
        this.seccionales = seccionales;
    }


    public List<Seccional> getSeccionales() {
        return seccionales;
    }
    public void agregarSeccional(){
        Scanner scanner = new Scanner(System.in);
        Seccional seccional = new Seccional();
        seccional.setCodigo(Consola.validarCodSeccional("INGRESAR CODIGO SECCIONAL ( S + número/s sin espacios): "));
        seccionales.add(seccional);
    }

        public void cargar() {
            seccionales.add(new Seccional("S1"));
            seccionales.add(new Seccional("S2"));
            seccionales.add(new Seccional("S3"));
            seccionales.add(new Seccional("S4"));
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println(" ----------------------------------- ");
                System.out.println("ELEGIR SECCIONAL PARA INICIAR CARGA: ");
                System.out.println("1.SECCIONAL Nº 1");
                System.out.println("2.SECCIONAL Nº 2");
                System.out.println("3.SECCIONAL Nº 3");
                System.out.println("4.SECCIONAL Nº 4");
                System.out.println("5.CARGAR NUEVA SECCIONAL");
                System.out.println("10. VOLVER MENU PRINCIPAL");
                int option2 = Consola.validateInt("INGRESAR OPCION: ", 1, 11);
                switch (option2) {
                    case 1:
                        seccionales.get(0).agregarVehiculo();
                        Seccional S1= seccionales.get(0);
                        seccionales.add(S1);
                        break;
                    case 2:
                        seccionales.get(1).agregarVehiculo();
                        Seccional S2= seccionales.get(1);
                        seccionales.add(S2);
                        break;
                    case 3:
                        seccionales.get(2).agregarVehiculo();
                        Seccional S3= seccionales.get(2);
                        seccionales.add(S3);
                        break;
                    case 4:
                        seccionales.get(3).agregarVehiculo();
                        Seccional S4= seccionales.get(3);
                        seccionales.add(S4);
                        break;
                    case 5:
                        agregarSeccional();
                        seccionales.get(4).agregarVehiculo();
                        Seccional S5= seccionales.get(4);
                        seccionales.add(S5);
                        break;

                    case 10:
                        running = false;
                }

            }
        }



    @Override
    public String toString() {
        return "Dnrpa{" +
                "seccionales=" + getSeccionales() +
                '}';
    }


}


    /*

    public void cargarNuevaSeccional(){
        String codigo = Consola.validarCodSeccional("INGRESAR CODIGO SECCIONAL ( S + número/s sin espacios): ");
        try {
            Seccional se = new Seccional(codigo);
            agregarSeccional(se);
        }catch(DatosIncorrectosException e){
            System.out.println("Carga Fallida"+e.getMessage());
        }
    }

     public void agregarSeccional(Seccional se){
        seccionales.add(se);

    }

    public Dnrpa(){
        this.seccionales = new ArrayList<>();
    }



*/