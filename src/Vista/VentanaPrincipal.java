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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author juan-
 */
public final class VentanaPrincipal extends JFrame {
    //private Fondo jpFondo;
    private JLabel jlMensaje;
    private JPanel jpContenido;
    private JButton btnIniciarJuego;
    private JButton btnInstrucciones;
    
    public VentanaPrincipal(){
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        //Se configura la ventana con un tamaño acorde
        setTitle("Fuga de Letras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        // Crear el panel que contendrá el fondo
        FondoPanel panelFondo = new FondoPanel("/Imagenes/Fondo.jpg");
        panelFondo.setBounds(0, 0, 600, 500);
        panelFondo.setOpaque(false);

        // Agregar el panel de fondo al panel principal
        add(panelFondo);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
               
        jpContenido = new JPanel();
        //CONFIGURACIÓN DEL MENSAJE DE BIENVENIDA
        jlMensaje = new JLabel("BIENVENIDO AL JUEGO FUGA DE LETRAS",SwingConstants.CENTER);
        
        
        jpContenido.setSize(600,500);        
        jpContenido.setBounds(0,40, 600, 500);
        jpContenido.setLayout(null);
        jpContenido.setOpaque(false);
        
        add(jpContenido,0);
        
        jlMensaje.setBounds(50,20, 519,20);
        jlMensaje.setForeground(Color.BLUE);
        jlMensaje.setFont(new Font("arial", Font.BOLD, 20));
        
        //CONFIGURACION DE LOS BOTONES DE INICIAR E INSTRUCCIONES
        btnIniciarJuego = new JButton("Iniciar Juego");
        btnIniciarJuego.setBounds(205,180, 150,35);
        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.setBounds(200,220, 160,35);
        
        jpContenido.add(jlMensaje);
        jpContenido.add(btnIniciarJuego);
        jpContenido.add(btnInstrucciones);
        
        //ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        //btnIniciarJuego.addActionListener(manejadorEventos);
        //btnInstrucciones.addActionListener(manejadorEventos);
    }
}
