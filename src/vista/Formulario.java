package vista;

import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

public class Formulario extends JFrame implements Observer{

    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JLabel lblCedula;
    private JLabel lblNumeroJugador;
    private JLabel lblTipoJugador;
    private JLabel lblTabla;
    private JComboBox ComboTipoJugador;

    private JTextField txtNombre;
    private JTextField txtCedula;

    private JTextField txtNumeroJugador;
    private JButton InsertarEquipo;

    private JButton GolEA;
    private JButton GolEB;
    
    JTextArea txtMarcador;

    public Formulario() {
        super();
        configurarVentana();
        InicializarComponentes();
    }

    public void configurarVentana() {
        this.setTitle(" Partido de Futbol Campeonato Multinivel ");
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getInsertarEquipo() {
        return InsertarEquipo;
    }

    public void setInsertarEquipo(JButton InsertarEquipo) {
        this.InsertarEquipo = InsertarEquipo;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblCedula() {
        return lblCedula;
    }

    public void setLblCedula(JLabel lblCedula) {
        this.lblCedula = lblCedula;
    }

    public JLabel getLblNumeroJugador() {
        return lblNumeroJugador;
    }

    public void setLblNumeroJugador(JLabel lblNumeroJugador) {
        this.lblNumeroJugador = lblNumeroJugador;
    }

    public JLabel getLblTipoJugador() {
        return lblTipoJugador;
    }

    public void setLblTipoJugador(JLabel lblTipoJugador) {
        this.lblTipoJugador = lblTipoJugador;
    }

    public JComboBox getComboTipoJugador() {
        return ComboTipoJugador;
    }

    public void setComboTipoJugador(JComboBox ComboTipoJugador) {
        this.ComboTipoJugador = ComboTipoJugador;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtNumeroJugador() {
        return txtNumeroJugador;
    }

    public void setTxtNumeroJugador(JTextField txtNumeroJugador) {
        this.txtNumeroJugador = txtNumeroJugador;
    }

    public JLabel getLblTabla() {
        return lblTabla;
    }

    public void setLblTabla(JLabel lblTabla) {
        this.lblTabla = lblTabla;
    }

    public JButton getGolEA() {
        return GolEA;
    }

    public void setGolEA(JButton GolEA) {
        this.GolEA = GolEA;
    }

    public JButton getGolEB() {
        return GolEB;
    }

    public void setGolEB(JButton GolEB) {
        this.GolEB = GolEB;
    }

    public JTextArea getTxtMarcador() {
        return txtMarcador;
    }

    public void setTxtMarcador(JTextArea txtaMarcador) {
        this.txtMarcador = txtaMarcador;
    }

    public void InicializarComponentes() {

        lblTitulo = new JLabel();
        lblNombre = new JLabel();
        lblCedula = new JLabel();
        lblNumeroJugador = new JLabel();
        lblTipoJugador = new JLabel();

        txtNombre = new JTextField();
        txtCedula = new JTextField();
        txtNumeroJugador = new JTextField();
        InsertarEquipo = new JButton("Insertar Jugador Equipo A");

        ComboTipoJugador = new JComboBox();

        lblTabla = new JLabel();
        GolEA = new JButton("Gol Equipo A");
        GolEB = new JButton("Gol Equipo B");
        txtMarcador=new JTextArea();
        
        
        this.lblTitulo.setText("Digite Datos Jugadores Equipo A");
        this.lblTitulo.setBounds(50, 50, 200, 25);

        this.lblNombre.setText("Digite Nombre  Jugador");
        this.lblNombre.setBounds(50, 80, 200, 25);

        this.lblCedula.setText("Digite cedula  Jugador");
        this.lblCedula.setBounds(50, 110, 200, 25);

        this.lblNumeroJugador.setText("Digite Numero camiseta  Jugador");
        this.lblNumeroJugador.setBounds(50, 140, 200, 25);

        this.lblTipoJugador.setText("Digite Tipo  Jugador");
        this.lblTipoJugador.setBounds(50, 180, 200, 25);
        this.ComboTipoJugador.addItem("Arquero");
        this.ComboTipoJugador.addItem("Delantero");
        this.ComboTipoJugador.addItem("Defensa");

        this.txtNombre.setBounds(240, 80, 200, 25);
        this.txtCedula.setBounds(240, 110, 200, 25);
        this.txtNumeroJugador.setBounds(240, 140, 200, 25);
        this.ComboTipoJugador.setBounds(240, 180, 200, 25);
        this.InsertarEquipo.setBounds(80, 240, 200, 25);

        this.lblTabla.setText("TABLA DE ANOTACIONES");
        this.lblTabla.setBounds(170, 280, 200, 25);
        this.GolEA.setBounds(40, 310, 200, 25);
        this.GolEB.setBounds(260, 310, 200, 25);
        this.txtMarcador.append("EQUIPO \t JUGADOR\t  MARCADOR \n");
        this.txtMarcador.setBounds(100, 340, 400, 400);
        
        this.add(lblTitulo);
        this.add(lblNombre);
        this.add(lblCedula);
        this.add(lblNumeroJugador);
        this.add(txtNombre);
        this.add(txtCedula);
        this.add(txtNumeroJugador);
        this.add(InsertarEquipo);
        this.add(lblTipoJugador);
        this.add(ComboTipoJugador);
        this.add(lblTabla);
        this.add(GolEA);
        this.add(GolEB);
        this.add(txtMarcador);

    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.txtMarcador.append(""+arg+"\n");
    }

}
