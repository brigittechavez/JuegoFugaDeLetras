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
        jlMensaje = new JLabel("Ahora debes realizar el registro",SwingConstants.CENTER);
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
        jlMensaje.setBounds(45,50, 519,20);
        jlMensaje.setForeground(Color.BLUE);
        jlMensaje.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        //ESTABLECIENDO ATRIBUTOS DEL MENSAJE DE NOMBRE
        jlNombre.setBounds(45,120, 519,20);
        jlNombre.setForeground(Color.BLACK);
        jlNombre.setFont(new Font("Arial", Font.BOLD, 20));
        //ESTABLECIENDO ATRIBUTOS DEL MENSAJE PARA SELECCIONAR LA TEMATICA
        jlTematica.setBounds(45,180, 519,20);
        jlTematica.setForeground(Color.BLACK);
        jlTematica.setFont(new Font("Arial", Font.BOLD, 20));
        
        //AGREGANDO LOS BOTONES
        btnAnimal = new JButton("ANIMAL");
        btnAnimal.setBounds(210,270, 150,35);
        btnColor = new JButton("COLOR");
        btnColor.setBounds(255,270, 150,35);
        btnFruta = new JButton("FRUTA");
        btnFruta.setBounds(285,270, 150,35);
        
        //CONFIGURANDO TEXTNOMBRE
        
        
        jpContenido.add(jlMensaje);
        jpContenido.add(jlNombre);
        jpContenido.add(jlTematica);
        jpContenido.add(btnAnimal);
        jpContenido.add(btnColor);
        jpContenido.add(btnFruta);
        jpContenido.add(txtNombre);
    }
    
}
