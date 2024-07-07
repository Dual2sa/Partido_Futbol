package modelo;
public class Persona {
    protected long cedula;
    protected String nombre;

    public long getCedula() {
        return cedula;
    }

    public Persona() {
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    
}
