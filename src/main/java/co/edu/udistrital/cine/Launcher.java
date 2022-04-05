package co.edu.udistrital.cine;

import co.edu.udistrital.cine.presentacion.Modelo;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Launcher{

    private Modelo miApp;

    public Launcher(){
        miApp = Modelo.getInstance();
        miApp.iniciar();
    }
        
    public static void main(String[] args){
        new Launcher();
    }
    
}
