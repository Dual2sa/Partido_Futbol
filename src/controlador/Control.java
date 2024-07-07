package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.*;
import vista.Formulario;
import vista.Observer2;

public class Control implements ActionListener {

    Formulario objFormulario = new Formulario();
    PartidoFutbol objPartidoFutbol = new PartidoFutbol();
    Equipo objEquipo = new Equipo();
    Delantero objDelantero = new Delantero();
    Defensa objDefensa = new Defensa();
    Arquero objArquero = new Arquero();
    int contadorJugadores = 0;
    Observer2 objObserver2 = new Observer2();

    public void iniciarProceso() {
        objFormulario.setVisible(true);
        objFormulario.getInsertarEquipo().addActionListener(this);
        objFormulario.getGolEA().addActionListener(this);
        objFormulario.getGolEB().addActionListener(this);
        objPartidoFutbol.addObserver(objFormulario);
        objPartidoFutbol.addObserver(objObserver2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == objFormulario.getInsertarEquipo()) {
            contadorJugadores++;
            switch (objFormulario.getComboTipoJugador().getSelectedIndex()) {
                case 0: {
                    objArquero = new Arquero();
                    objArquero.setCedula(Long.parseLong(objFormulario.getTxtCedula().getText()));
                    objArquero.setNombre(objFormulario.getTxtNombre().getText());
                    objArquero.setNumeroCamisa(Integer.parseInt(objFormulario.getTxtNumeroJugador().getText()));
                    this.objEquipo.adicionaUnJugador(objArquero);
                    JOptionPane.showMessageDialog(null, "se inserto un arquero Insercion numero " + contadorJugadores);
                    break;
                }
                case 1: {
                    objDelantero = new Delantero();
                    objDelantero.setCedula(Long.parseLong(objFormulario.getTxtCedula().getText()));
                    objDelantero.setNombre(objFormulario.getTxtNombre().getText());
                    objDelantero.setNumeroCamisa(Integer.parseInt(objFormulario.getTxtNumeroJugador().getText()));
                    this.objEquipo.adicionaUnJugador(objDelantero);
                    JOptionPane.showMessageDialog(null, "se inserto un delantero Insercion numero " + contadorJugadores);

                    break;
                }
                case 2: {
                    objDefensa = new Defensa();
                    objDefensa.setCedula(Long.parseLong(objFormulario.getTxtCedula().getText()));
                    objDefensa.setNombre(objFormulario.getTxtNombre().getText());
                    objDefensa.setNumeroCamisa(Integer.parseInt(objFormulario.getTxtNumeroJugador().getText()));
                    this.objEquipo.adicionaUnJugador(objDefensa);
                    JOptionPane.showMessageDialog(null, "se inserto un defensa Insercion numero " + contadorJugadores);
                    break;
                }

            }

            if (contadorJugadores == 5) {
                this.objFormulario.getLblTitulo().setText("Digite Datos Jugadores Equipo B ");
                this.objFormulario.getInsertarEquipo().setText("Insertar Jugador Equipo B");
                this.objPartidoFutbol.setEquipoA(objEquipo);
                objEquipo = new Equipo();

            }

            if (contadorJugadores == 10) {
                this.objFormulario.getLblTitulo().setText("**EQUIPOS LLENOS **");
                this.objFormulario.getInsertarEquipo().setEnabled(false);
                this.objFormulario.getTxtCedula().setEnabled(false);
                this.objFormulario.getTxtNombre().setEnabled(false);
                this.objFormulario.getTxtNumeroJugador().setEnabled(false);
                this.objFormulario.getComboTipoJugador().setEnabled(false);
                this.objPartidoFutbol.setEquipoB(objEquipo);

            }

        }
        if (e.getSource() == objFormulario.getGolEA()) {
            int golA = Integer.parseInt(JOptionPane.showInputDialog("El jugador que marco el gol fue: "));
            boolean existe = false;
            ArrayList<Jugador> auxLista = new ArrayList();
            auxLista = objPartidoFutbol.getEquipoA().getLista();
            for (Jugador auxLista1 : auxLista) {
                if (golA == auxLista1.getNumeroCamisa()) {
                    existe = true;
                    objPartidoFutbol.setGolesEquipoA(1);
                    objPartidoFutbol.nuevoGol("Equipo A", auxLista1.getNombre());
                    
                }
            }
            if (!existe) {
                JOptionPane.showMessageDialog(null, "El número de camiseta digitado no el válido");
            }
        }
        if (e.getSource() == objFormulario.getGolEB()) {
            int golB = Integer.parseInt(JOptionPane.showInputDialog("El jugador que marco el gol fue: "));
            boolean existe = false;
            ArrayList<Jugador> auxLista = new ArrayList();
            auxLista = objPartidoFutbol.getEquipoB().getLista();
            for (Jugador auxLista1 : auxLista) {
                if (golB == auxLista1.getNumeroCamisa()) {
                    existe = true;
                    objPartidoFutbol.setGolesEquipoB(1);
                    objPartidoFutbol.nuevoGol("Equipo B", auxLista1.getNombre());
                    
                }
            }
            if (!existe) {
                JOptionPane.showMessageDialog(null, "El número de camiseta digitado no el válido");
            }
        }
        if ((objPartidoFutbol.getGolesEquipoA() == 5) || (objPartidoFutbol.getGolesEquipoB() == 5)) {
            this.objFormulario.getGolEA().setEnabled(false);
            this.objFormulario.getGolEB().setEnabled(false);
            if (objPartidoFutbol.getGolesEquipoA() > objPartidoFutbol.getGolesEquipoB()) {
                objPartidoFutbol.nuevoGol("EL GANADOR ES EL ", "EQUIPO A");
            } else {
                objPartidoFutbol.nuevoGol("EL GANADOR ES EL ", "EQUIPO B");
            }
        }

    }

}
