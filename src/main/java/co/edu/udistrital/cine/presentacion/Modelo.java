/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.cine.presentacion;

/**
 *
 * @author USER
 */
public class Modelo {

    private static Modelo instance;

    private VistaSillas vistaSillas;
    private VistaMain vistaMain;
    private VistaMultiplex vistaMultiplex;
    
    private Modelo() {
        vistaSillas = new VistaSillas();
        vistaMain = new VistaMain();
        vistaMultiplex = new VistaMultiplex();
    }

    public static Modelo getInstance() {
        if (instance == null) {
            instance = new Modelo();
        }
        return instance;
    }

    public VistaSillas getVistaSillas() {
        return vistaSillas;
    }

    public VistaMain getVistaMain() {
        return vistaMain;
    }

    public VistaMultiplex getVistaMultiplex() {
        return vistaMultiplex;
    }

    public void iniciar() {
        vistaMain.setVisible(true);
        
    }

}
