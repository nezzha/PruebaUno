/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugador;
import Modelo.consultaJugador;
import Vista.RegistrarJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author vanessa
 */
public class CtrlJugador implements ActionListener{
    private Jugador modelo;
    private consultaJugador consul;
    private RegistrarJugador frmAlta;

    public CtrlJugador(Jugador modelo, consultaJugador consul, RegistrarJugador frmAlta) {
        this.modelo = modelo;
        this.consul = consul;
        this.frmAlta = frmAlta;
        this.frmAlta.btnRegistrar.addActionListener(this);
        this.frmAlta.btnRegresar.addActionListener(this);
    }
    
    public void iniciarAlta(){
        frmAlta.setTitle("Alta Jugador");
        frmAlta.setLocationRelativeTo(null);
     //   frmAlta.txtIdEq.setVisible(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmAlta.btnRegistrar){
             modelo.setNombreJugador(frmAlta.txtNombreJu.getText());
             modelo.setApellidosJugador(frmAlta.txtApePat.getText());
             modelo.setEquipoIdEquipo(Integer.parseInt(frmAlta.txtEquipo.getText()));
             if(consul.registrarJugador(modelo)){
                 JOptionPane.showMessageDialog(null, "Registro Guardado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Guardar");
                  limpiar();
             }
        }
       
        
    }
    
    public void limpiar(){
        frmAlta.txtApePat.setText("");
        frmAlta.txtEquipo.setText("");
        frmAlta.txtNombreJu.setText("");
        
    }
   
    
    
}
