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
public final class VentanaPrincipal extends JFrame {
    private JLabel jlMensaje;
    private JLabel jlMensaje1;
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
        jlMensaje = new JLabel("BIENVENIDO A:",SwingConstants.CENTER);
        jlMensaje1 = new JLabel("FUGA DE LETRAS",SwingConstants.CENTER);
        
        //CONFIGURANDO CONTENIDO
        jpContenido.setSize(600,500);        
        jpContenido.setBounds(0,40, 600, 500);
        jpContenido.setLayout(null);
        jpContenido.setOpaque(false);
        
        add(jpContenido,0);
        
        //ESTABLECIENDO ATRIBUTOS DEL MENSAJE
        jlMensaje.setBounds(45,50, 519,20);
        jlMensaje.setForeground(Color.BLUE);
        jlMensaje.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        jlMensaje1.setBounds(45,85, 519,20);
        jlMensaje1.setForeground(Color.BLUE);
        jlMensaje1.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        
        //CONFIGURACION DE LOS BOTONES DE INICIAR E INSTRUCCIONES
        btnIniciarJuego = new JButton("Iniciar Juego");
        btnIniciarJuego.setBounds(215,200, 150,35);
        btnIniciarJuego.setBackground(Color.BLUE);
        btnIniciarJuego.setForeground(Color.WHITE); // Establecer el texto en color blanco
        btnIniciarJuego.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.setBounds(210,250, 160,35);
        btnInstrucciones.setBackground(Color.YELLOW);
        btnInstrucciones.setForeground(Color.BLACK); // Establecer el texto en color blanco
        btnInstrucciones.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        
        jpContenido.add(jlMensaje);
        jpContenido.add(jlMensaje1);
        jpContenido.add(btnIniciarJuego);
        jpContenido.add(btnInstrucciones);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        btnIniciarJuego.addActionListener(manejadorEventos);
        btnInstrucciones.addActionListener(manejadorEventos);
        
    }
    //FUNCION PARA DARLE INICIO AL JUEGO
    private void registrarJuego(){
        dispose();
        VentanaRegistro VentanaRegistro = new VentanaRegistro();
        
    }
    //FUNCION PARA MOSTRAR LAS INSTRUCCIONES DEL JUEGO
    private void Instrucciones(){
        UIManager.put("Panel.background", Color.ORANGE);
        UIManager.put("OptionPane.background", Color.YELLOW);
        JOptionPane.showMessageDialog(null,
            "¡Aquí tienes las instrucciones del juego!!, \n\nPrimero Registras tu nombre y escoges la temática con la que te atreves a jugar" + " \n\nA la palabra que te salga le hace falta una vocal, es tu misión decidir cuál de las 5 vocales es la correcta para que esa palabra sea válida " +
            "  \n\nEjemplo: A la palabra COC_ le hace falta una o por lo que tienes que oprimir el botón que contenga esa vocal\n", "Instrucciones del Juego",
            JOptionPane.INFORMATION_MESSAGE);

            }
    class ManejadorDeEventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnIniciarJuego){                
                registrarJuego();
            }if(e.getSource() == btnInstrucciones){
                Instrucciones();
            }
        }
        
    }
}
