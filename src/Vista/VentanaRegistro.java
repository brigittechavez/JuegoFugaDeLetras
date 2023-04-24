/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Jugador;
//import Diccionario.Animales;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author juan-
 */
public final class VentanaRegistro extends JFrame {
    private JLabel jlMensaje;
    private JPanel jpContenido;
    private JLabel jlNombre;
    private JLabel jlTematica;
    private JTextField txtNombre;
    private JButton btnAnimal;
    private JButton btnColor;
    private JButton btnFruta;
    private String rutaDiccionario = "src/Diccionario/Animales.txt";
    
    public VentanaRegistro(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        //Se configura la ventana con un tamaño acorde
        setTitle("Fuga de Letras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        setSize(600,500);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        
        // Crear el panel que contendrá el fondo
        FondoPanel panelFondo = new FondoPanel("/Imagenes/Fondo.jpg");
        panelFondo.setBounds(0, 0, 600, 500);
        panelFondo.setOpaque(false);

        // Agregar el panel de fondo al panel principal
        add(panelFondo);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        //CONFIGURANDO LOS MENSAJES EN PANTALLA
        jlMensaje = new JLabel("Regístrate",SwingConstants.CENTER);
        jlNombre = new JLabel("Ingresa tu nombre",SwingConstants.CENTER );
        jlTematica = new JLabel("Selecciona una temática",SwingConstants.CENTER );
        //Contenido
        jpContenido = new JPanel();
        jpContenido.setSize(600,500);        
        jpContenido.setBounds(0,40, 600, 500);
        jpContenido.setLayout(null);
        jpContenido.setOpaque(false);
        
        add(jpContenido,0);
        
        //ESTABLECIENDO ATRIBUTOS DEL MENSAJE DE REGISTRO
        jlMensaje.setBounds(45,80, 519,30);
        jlMensaje.setForeground(Color.BLUE);
        jlMensaje.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        //ESTABLECIENDO ATRIBUTOS DEL MENSAJE DE NOMBRE
        jlNombre.setBounds(45,120, 519,20);
        jlNombre.setForeground(Color.BLACK);
        jlNombre.setFont(new Font("Arial", Font.BOLD, 20));
        //ESTABLECIENDO ATRIBUTOS DEL MENSAJE PARA SELECCIONAR LA TEMATICA
        jlTematica.setBounds(45,210, 519,20);
        jlTematica.setForeground(Color.BLACK);
        jlTematica.setFont(new Font("Arial", Font.BOLD, 20));
        
        //AGREGANDO LOS BOTONES
        btnAnimal = new JButton("ANIMALES");
        btnAnimal.setBounds(230,270, 150,35);
        btnColor = new JButton("COLORES");
        btnColor.setBounds(230,310, 150,35);
        btnFruta = new JButton("FRUTAS");
        btnFruta.setBounds(230,355, 150,35);
        
        //CONFIGURANDO TEXTNOMBRE
        txtNombre = new JTextField("");
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20));      
        txtNombre.setBounds(200,145,200, 40);
        
        jpContenido.add(jlMensaje);
        jpContenido.add(jlNombre);
        jpContenido.add(jlTematica);
        jpContenido.add(btnAnimal);
        jpContenido.add(btnColor);
        jpContenido.add(btnFruta);
        jpContenido.add(txtNombre);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnAnimal.addActionListener(manejadorEventos);
        btnColor.addActionListener(manejadorEventos);
        btnFruta.addActionListener(manejadorEventos);
        //txtNombre.addKeyListener((KeyListener) manejadorEventos);
        
        
        txtNombre.requestFocusInWindow();
    }
    
    private void iniciarJuego(){
        String nombre =txtNombre.getText();
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            Jugador jugador = new Jugador(nombre);
            dispose();
            VentanaJuego ventanaJuego = new VentanaJuego(jugador);
            
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocusInWindow();
        }
    
    }
    class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String Mensaje = "";
            if(e.getSource() == btnAnimal){
                Mensaje = "Ha seleccionado la tematica de Animales";
                JOptionPane.showMessageDialog(null,Mensaje , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                VentanaJuego ventanaJuego = new VentanaJuego("src/Diccionario/Animales.txt");
                iniciarJuego();
                
            }if(e.getSource() == btnColor){
                Mensaje = "Ha seleccionado la tematica de Colores";
                JOptionPane.showMessageDialog(null,Mensaje , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                VentanaJuego ventanaJuego = new VentanaJuego("src/Diccionario/Colores.txt");
                iniciarJuego();
            }if(e.getSource() == btnFruta){
                Mensaje = "Ha seleccionado la tematica de Frutas";
                JOptionPane.showMessageDialog(null,Mensaje , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                VentanaJuego ventanaJuego = new VentanaJuego("src/Diccionario/Frutas.txt");
                iniciarJuego();
            }
        }
        
    }
}
