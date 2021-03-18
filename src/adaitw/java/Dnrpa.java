package adaitw.java;

import java.util.*;

public class Dnrpa {
    List<Seccional> seccionales;
    Queue<String> turno = new LinkedList<>();
    List<Auto> autos= new ArrayList<>();

    public Dnrpa(){
        this.seccionales = new ArrayList<>();
    }

    public void setSeccionales(List<Seccional> seccionales) {
        this.seccionales = seccionales;
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
        this.seccionales = seccionales;
    }



    @Override
    public String toString() {
        return "Dnrpa{" +
                "seccionales=" + seccionales +
                '}';
    }

}

