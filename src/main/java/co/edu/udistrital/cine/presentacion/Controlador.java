/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.cine.presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author USER
 */
public class Controlador implements ActionListener{
    private static Controlador instance;
    private Modelo modelo;
    private Controlador () {
        modelo=Modelo.getInstance();
    }
    public static final Controlador GetInstance(){
        if (instance == null){
            instance = new Controlador();
        }
        return instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
