package co.edu.udistrital.cine;

import co.edu.udistrital.cine.presentacion.Modelo;

public class Launcher{

    private Modelo miApp;

    public Launcher(){
        miApp = new Modelo();
        miApp.iniciar();
    }
        
    public static void main(String[] args){
        new Launcher();
    }
    
}
