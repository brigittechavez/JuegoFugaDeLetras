/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Vanesa 
 */
public class Categoría {
    private ArrayList<String> Animales = new ArrayList <String> ();
    private ArrayList<String> Colores = new ArrayList <String> ();
    private ArrayList<String> Frutas = new ArrayList <String> ();
    
    
    //Función encargada de leer las palabras de los archivos .txt
    public Categoría() {
        leerArchivo("Animales.txt", Animales); 
        leerArchivo("Colores.txt", Colores); 
        leerArchivo("Frutas.txt", Frutas); 
    }
    
    //Función encargada de guardar las palabras en las categorías 
    
    private void leerArchivo(String nombreArchivo, ArrayList<String> listaPalabras) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) { 
            String palabraTemp; // Variable temporal
            while ((palabraTemp = br.readLine()) != null) { 
                listaPalabras.add(palabraTemp); // Agrega la palabra leída a su categoría correspondiente
            }
        } catch (IOException e) {  
            
        }
    }

    //Getters & Setters 
    
    public ArrayList<String> getAnimales() {
        return Animales;
    }

    public void setAnimales(ArrayList<String> Animales) {
        this.Animales = Animales;
    }

    public ArrayList<String> getColores() {
        return Colores;
    }

    public void setColores(ArrayList<String> Colores) {
        this.Colores = Colores;
    }

    public ArrayList<String> getFrutas() {
        return Frutas;
    }

    public void setFrutas(ArrayList<String> Frutas) {
        this.Frutas = Frutas;
    }
    
    
    
       
}
