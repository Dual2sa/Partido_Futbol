package modelo;

import java.util.ArrayList;

public class Equipo {
    
  private  ArrayList <Jugador> lista = new ArrayList(); 

    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public void adicionaUnJugador(Jugador objeto) {
        this.lista.add(objeto);
    }

    public Equipo() {
    }
  
  
  
}
