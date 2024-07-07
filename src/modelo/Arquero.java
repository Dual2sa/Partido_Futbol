package modelo;
public class Arquero extends Jugador {
   protected int salto;

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public Arquero() {
    }

    public Arquero(int salto, int numeroCamisa, long cedula, String nombre) {
        super(numeroCamisa, cedula, nombre);
        this.salto = salto;
    }
   
   
   
}
