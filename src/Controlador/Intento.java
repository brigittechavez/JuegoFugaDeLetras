/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Vanesa
 */
public class Intento {
    private static int totalIntentos;
    private int intentosPartida;
    private int numeroIntento;
    
    public Intento(){
        ++totalIntentos;
        setNumeroIntento(totalIntentos);
        intentosPartida = 0;
    }
    
       
    /*public boolean esElNumero(int numero){
        intentosPartida++;
        if(numeroAdivinar == numero){
            return true;
        } else{            
            return false;
        }
    }*/

    public int getNumeroIntento() {
        return numeroIntento;
    }

    public void setNumeroIntento(int numeroIntento) {
        this.numeroIntento = numeroIntento;
    }

   /* public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }*/

    public int getIntentosPartida() {
        return intentosPartida;
    }

    public void setIntentosPartida(int intentosPartdida) {
        this.intentosPartida = intentosPartida;
    }
}
