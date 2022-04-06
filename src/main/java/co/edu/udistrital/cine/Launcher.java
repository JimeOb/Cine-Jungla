package co.edu.udistrital.cine;

import co.edu.udistrital.cine.presentacion.Modelo;
import co.edu.udistrital.persistencia.HibernateSession;

public class Launcher{

    private Modelo miApp;

    public Launcher(){
        miApp = new Modelo();
        miApp.iniciar();
    }
        
    public static void main(String[] args){
        //new Launcher();
        HibernateSession.initialize();
    }
    
}
