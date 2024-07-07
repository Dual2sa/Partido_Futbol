
package modelo;

public class Delantero extends Jugador {
    protected int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Delantero(int velocidad, int numeroCamisa, long cedula, String nombre) {
        super(numeroCamisa, cedula, nombre);
        this.velocidad = velocidad;
    }

    public Delantero() {
    }
    
    
}
