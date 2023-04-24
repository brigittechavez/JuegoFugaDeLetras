/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * @author Brigitte Vanesa Chavez Riascos, brigitte.chavez@correounivalle.edu.co
 * @author Juan Camilo Capera Barrera, capera.juan@correounivalle.edu.co
 * @Version v.1.0.0 date: 23/04/2023
 * @class FPOE-750014C-01
 * Miniproyecto 1 
 */

public class Estadísticas {
    private int aciertos;
    private int fallos;
    private int palabrasJugadas;

    
    //Constructor de la clase Estadísticas.
     
    public Estadísticas() {
        aciertos = 0;
        fallos = 0;
        palabrasJugadas = 0;
    }

    //Funciones que registran fallos, aciertos y palabras jugadas.
   
    public void registrarAcierto() {
        aciertos++;
        palabrasJugadas++;
    }

    //
    public void registrarFallo() {
        fallos++;
        palabrasJugadas++;
    }

    
    
    //Getters para los contadores 
    
    public int getAciertos() {
        return aciertos;
    }

    
    public int getFallos() {
        return fallos;
    }

    
    public int getPalabrasJugadas() {
        return palabrasJugadas;
    }
    
    
    
    
    
    
    
    
}
