/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import Controlador.ControladorJuego;
/**
 *
 * @author juan-
 */
public class VentanaJuego extends JFrame {
    
    private JLabel jlJugador;
    private JLabel jlNombreJugador;
    private JLabel jlNumeroPalabra;
    private JLabel jlTotalPalabras;
    private JLabel jlIntento;
    private JLabel jlVocal;
    private JLabel jlNumeroIntento;
    private JPanel jpContenido;
    private JLabel jlPalabra;
    private JButton btnTerminar;
    private JButton btnA;
    private JButton btnE;
    private JButton btnI;
    private JButton btnO;
    private JButton btnU;
    
    private ControladorJuego controladorJuego;

    private String rutaDiccionario;

    public VentanaJuego(String rutaDiccionario) {
        this.rutaDiccionario = rutaDiccionario;
        
        // Resto del código de la clase
    }
    public VentanaJuego(Jugador jugador) {
        controladorJuego = new ControladorJuego(jugador);
        controladorJuego.iniciarIntento();
        iniciarComponentes();
        setSize(600,500);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Fuga de Palabras");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        
        // Crear el panel que contendrá el fondo
        FondoPanel panelFondo = new FondoPanel("/Imagenes/Fondo.jpg");
        panelFondo.setBounds(0, 0, 600, 500);
        panelFondo.setOpaque(false);

        // Agregar el panel de fondo al panel principal
        add(panelFondo);

    }
    private void iniciarComponentes(){
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        jpContenido = new JPanel();
        
        jlJugador = new JLabel("Jugador : ");
        jlJugador.setBounds(5,110, 519,35);
        jlJugador.setForeground(Color.BLACK);
        jlJugador.setFont(new Font("arial", Font.BOLD, 20));
        
        String nombre = controladorJuego.getJugador();
        nombre =    nombre.substring(0,1).toUpperCase() + 
                    nombre.substring(1).toLowerCase();
        jlNombreJugador = new JLabel(nombre);
        jlNombreJugador.setBounds(100,110, 519,35);
        jlNombreJugador.setForeground(Color.BLACK);
        jlNombreJugador.setFont(new Font("arial", Font.BOLD, 20));
        
        jlIntento = new JLabel("Palabra # : ");
        jlIntento.setBounds(230,110, 519,35);
        jlIntento.setForeground(Color.BLACK);
        jlIntento.setFont(new Font("arial", Font.BOLD, 20));
                
        jlNumeroPalabra = new JLabel(
                String.valueOf(controladorJuego.getNumeroPalabra()));
        jlNumeroPalabra.setBounds(330,110, 519,35);
        jlNumeroPalabra.setForeground(Color.BLACK);
        jlNumeroPalabra.setFont(new Font("arial", Font.BOLD, 20));
    
        jlIntento = new JLabel("Intento # : ");
        jlIntento.setBounds(375,110, 519,35);
        jlIntento.setForeground(Color.BLACK);
        jlIntento.setFont(new Font("arial", Font.BOLD, 20));
        
        jlNumeroIntento = new JLabel(
                String.valueOf(controladorJuego.getIntentosPartida()));
        jlNumeroIntento.setBounds(475,110, 519,35);
        jlNumeroIntento.setForeground(Color.BLACK);
        jlNumeroIntento.setFont(new Font("arial", Font.BOLD, 20));
        
        jlVocal = new JLabel("¿Cuál es la vocal que hace falta?",SwingConstants.CENTER );
        jlVocal.setBounds(0,180, 519,35);
        jlVocal.setForeground(new Color(0,87,193));
        jlVocal.setFont(new Font("arial", Font.BOLD, 20));
        //BOTON TERMINAR
        btnTerminar = new JButton("Terminar");
        btnTerminar.setBounds(350,400, 160,35);
        btnTerminar.setBackground(Color.YELLOW);
        btnTerminar.setForeground(Color.BLACK); // Establecer el texto en color 
        btnTerminar.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        //BOTON A
        btnA = new JButton("A");
        btnA.setBounds(350,400, 160,35);
        btnA.setBackground(Color.YELLOW);
        btnA.setForeground(Color.BLACK); // Establecer el texto en color
        btnA.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnA = new JButton("A");
        btnA.setBounds(350,400, 160,35);
        btnA.setBackground(Color.YELLOW);
        btnA.setForeground(Color.BLACK); // Establecer el texto en color
        btnA.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        
        jpContenido.add(jlJugador);
        jpContenido.add(jlNombreJugador);
        jpContenido.add(jlIntento);
        jpContenido.add(jlNumeroPalabra);
        jpContenido.add(jlIntento);
        jpContenido.add(jlNumeroIntento);
        jpContenido.add(jlVocal);
        jpContenido.add(btnTerminar);
        
        jpContenido.setSize(600,500);        
        jpContenido.setBounds(0,110, 519, 500);
        jpContenido.setLayout(null);
        jpContenido.setOpaque(false);
        
        add(jpContenido);
        
    }
}
