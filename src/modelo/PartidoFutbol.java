package modelo;

import java.util.Observable;

public class PartidoFutbol extends Observable {
    private Equipo equipoA = new Equipo();
    private Equipo equipoB = new Equipo();
    private int golesEquipoA=0;
    private int golesEquipoB=0;

    public Equipo getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(Equipo equipoA) {
        this.equipoA = equipoA;
    }

    public Equipo getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(Equipo equipoB) {
        this.equipoB = equipoB;
    }

    public int getGolesEquipoA() {
        return golesEquipoA;
    }

    public void setGolesEquipoA(int golesEquipoA) {
        this.golesEquipoA = this.golesEquipoA+golesEquipoA;
    }

    public int getGolesEquipoB() {
        return golesEquipoB;
    }

    public void setGolesEquipoB(int golesEquipoB) {
        this.golesEquipoB = this.golesEquipoB+golesEquipoB;
    }

    public PartidoFutbol() {
    }
    
    public void nuevoGol(String NomEquipo, String NomJugador){
        String dato=NomEquipo+"\t"+NomJugador+"\t"+golesEquipoA+"-"+golesEquipoB;
        setChanged();
        //Envió cambio que hubo
        notifyObservers(dato);
    }
    
}
