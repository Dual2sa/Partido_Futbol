package modelo;

public class Defensa extends Jugador {
    protected int fuerza;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public Defensa() {
    }

    public Defensa(int fuerza, int numeroCamisa, long cedula, String nombre) {
        super(numeroCamisa, cedula, nombre);
        this.fuerza = fuerza;
    }
    
}
