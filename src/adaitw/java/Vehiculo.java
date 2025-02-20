package adaitw.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Vehiculo<i> extends Seccional{
    protected String codigoV;
    protected Propietario propietario;
    protected String marca;
    protected List<Autorizados> autorizados = new ArrayList<>();
    protected boolean categoriaProfesional;
    protected int dominio = 0;
    protected LocalDate fechaAlta;
    protected LocalDate nuevaFecha;
    protected boolean antiguedad;

    public Vehiculo() {
    }

    public Vehiculo(String codigoV, Propietario propietario, String marca) {
        this.propietario = propietario;
        this.autorizados = autorizados;
        this.categoriaProfesional = categoriaProfesional;
        this.dominio = getDominio();
        this.fechaAlta = fechaAlta;
        this.nuevaFecha = nuevaFecha;
        this.antiguedad = antiguedad;
        this.marca = marca;
        this.codigoV = codigoV;
    }

    public Vehiculo(Propietario propietario, boolean categoriaProfesional) {
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setDominio() {
        Random aleatorio = new Random();
        HashMap<Integer, Vehiculo> MapaVehiculo = new HashMap<>();
        for(int i=0; i<99; i++){
            dominio = aleatorio.nextInt(8)*1000;
            MapaVehiculo.put(dominio, new Vehiculo());
        }

    }

    public int getDominio() {
        return dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigoV() {
        return codigoV;
    }

    public void setCodigoV(String codigoV) {
        this.codigoV = codigoV;
    }

    public String getCategoriaProfesional() {
        if(categoriaProfesional){
            return "PROFESIONAL";
        }else{
            return "PARTICULAR";
        }

    }

    public void setCategoriaProfesional(boolean categoriaProfesional) {
        this.categoriaProfesional = categoriaProfesional;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getNuevaFecha() {
        return nuevaFecha;
    }

    public void setNuevaFecha(LocalDate nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }



    public String nuevoPropietario() {
        return "Nuevo Titular: " + propietario;
    }

    // Fecha de Alta de Nuevo Propietario
    public void asignarAltaNuevoTitular(LocalDate nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public String fechaCambioTitular() {
        return "Nueva Alta: " + nuevaFecha;
    }

    public void setAntiguedad(Boolean antiguedad) {
        this.antiguedad = antiguedad;
    }

    // Nuevo Propietario
    public String cambiarPropietario() {
        LocalDate start_date = (nuevaFecha==null) ? fechaAlta : nuevaFecha;
        LocalDate end_date = LocalDate.now();
        Period diff = Period.between(start_date, end_date);
        if(diff.getYears() < 1){
            return "NO PUEDE CAMBIAR DE TITULAR: \n"+diff.getYears()+" Año - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
        }else{
            Scanner scanner = new Scanner(System.in);
            Propietario propietario = new Propietario();
            System.out.println("Nuevo Titular: ");
            String nombre = scanner.next();
            propietario.setNombre(nombre);
            propietario.setDni(Consola.validarDni("INGRESE DNI: AR + NÚMEROS: "));
            System.out.println("Domicilio: ");
            String direccion = scanner.next();
            propietario.setDireccion(direccion);
            setPropietario(propietario);
            System.out.println(nuevoPropietario());
            return "SI PUEDE CAMBIAR DE TITULAR: \n"+diff.getYears()+" Año/s - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";

        }
    }

    public void agregarV(){
        Scanner scanner = new Scanner(System.in);
        setCodigo(Consola.validarCodSeccional("INGRESAR CODIGO SECCIONAL ( S + número/s sin espacios): "));
        setCodigoV(Consola.validarCodVehicular("INGRESAR CODIGO VEHICULAR ( VE + número/s sin espacios): "));
        System.out.println("MARCA: ");
        String marca= scanner.next();
        setMarca(marca);
        System.out.println("Propietario: ");
        Propietario propietario = new Propietario();
        String nombre = scanner.next();
        propietario.setNombre(nombre);
        propietario.setDni(Consola.validarDni("INGRESE DNI: AR + NÚMEROS: "));
        System.out.println("Domicilio: ");
        String direccion = scanner.next();
        propietario.setDireccion(direccion);
        setPropietario(propietario);
        setCategoriaProfesional(Boolean.parseBoolean(Consola.validarCategoria("CATEGORIA PROFESIONAL: (true/false) ")));
        setFechaAlta(LocalDate.parse(Consola.validarFechaAlta("FECHA ALTA: (YYYY-MM-DD):")));
        setDominio();
        }

        //Autorizados:
        public void agregarAutorizado(){
            Scanner scanner = new Scanner(System.in);
            Autorizados autorizados = new Autorizados();
            System.out.println("AUTORIZADO: ");
            String nombre = scanner.next();
            autorizados.setNombre(nombre);
            autorizados.setDni(Consola.validarDni("INGRESE DNI: AR + NÚMEROS: "));
            System.out.println("Domicilio: ");
            String direccion = scanner.next();
            autorizados.setDireccion(direccion);
            this.autorizados.add(autorizados);
        }

        public void agregarAutorizado(Autorizados autorizados) {
        this.autorizados.add(autorizados);
    }
        public List<Autorizados> getAutorizados() {
        return autorizados;
        }


    public String verFicha(){
        return  " MARCA: " + marca ;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                " Propietario = " + getPropietario() +
                ", autorizados=" + autorizados +
                 ", categoriaProfesional=" + categoriaProfesional+
                 ", dominio=" + getDominio() +
                 ", fechaAlta=" + fechaAlta +
                // ", nuevaFecha=" + nuevaFecha +
                // ", cilindros=" + cilindros +
                // ", antiguedad=" + antiguedad +
                '}';
    }

    public void setMotor(Motor motor) {
    }

}

/*String categoria = (categoriaProfesional) ? " Categoría Profesional":" Categoría Particular";
        return categoria;*/