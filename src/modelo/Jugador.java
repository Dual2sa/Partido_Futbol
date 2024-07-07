package modelo;
public class Jugador extends Persona {
    protected int numeroCamisa;

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Jugador() {
    }

    public Jugador(int numeroCamisa, long cedula, String nombre) {
        super(cedula, nombre);
        this.numeroCamisa = numeroCamisa;
    }
      
}
