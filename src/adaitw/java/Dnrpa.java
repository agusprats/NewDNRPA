package adaitw.java;

import java.util.*;

public class Dnrpa {
    List<Seccional> seccionales = new LinkedList<>();
    Queue<String> turno = new LinkedList<>();


    public void cargarNuevaSeccional(){
        String codigo = Consola.getString("Ingresar Código");
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

    public void listarSeccionales() {
        for(Seccional s : seccionales)
            System.out.println(s);
    }


    @Override
    public String toString() {
        return "Dnrpa{" +
                "seccionales=" + seccionales +
                '}';
    }


}


    /*

    public Dnrpa(){
        this.seccionales = new ArrayList<>();
    }

    public void agregarSeccional(){
        Scanner scanner = new Scanner(System.in);
        Seccional nuevaSeccional = new Seccional();
        System.out.println("Cargar Código: ");
        String codigo = scanner.next();
        nuevaSeccional.setCodigo(codigo);
        seccionales.add(nuevaSeccional);
    }

    public List<Seccional> getSeccionales() {
        return seccionales;
    }

    public void asignarSeccional(){
        Scanner scanner = new Scanner(System.in);
        Seccional s = new Seccional();
        System.out.println("Cargar Código: ");
        String codigo = scanner.next();
        s.setCodigo(codigo);
    }

*/