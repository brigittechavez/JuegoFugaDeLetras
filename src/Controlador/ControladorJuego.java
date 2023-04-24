/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import javax.swing.JOptionPane;
import Modelo.Jugador;
import Vista.VentanaJuego;

/**
 *
 * @author Vanesa
 */
public class ControladorJuego {
    private Jugador jugador;
    private Intento mejorIntento;
    private Intento intento;
    
    public ControladorJuego(Jugador jugador){
        this.jugador = jugador;              
    }
    
    public void iniciarJuego(){
        intento = new Intento();
        if (intento.getNumeroPalabra() == 1){
            mejorIntento = intento;
        }
    }
    
    /*public boolean esElNumero(int numero){
        return intento.esElNumero(numero);            
    }*/
    
    public String getJugador(){
        return jugador.getNombre();
    }
    
    public int getNumeroPalabra(){
        return intento.getNumeroPalabra();
    }
     
     public int getIntentosPartida(){
        return intento.getIntentosPartida();
    }
     
     //aa
     
     public Intento getMejorIntento(){
         return mejorIntento;
     }
     
     public void compararIntentos(){
         if(intento.getIntentosPartida() < mejorIntento.getIntentosPartida()){
             mejorIntento = intento;
         }
     }
}
