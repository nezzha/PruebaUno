/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugador;
import Modelo.consultaJugador;
import Vista.ModificarJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author vanessa
 */
public class CtrlJugadorM implements ActionListener {
    private Jugador modelo;
    private consultaJugador consulta;
    private ModificarJugador frmMod;

    public CtrlJugadorM(Jugador modelo, consultaJugador consulta, ModificarJugador frmMod) {
        this.modelo = modelo;
        this.consulta = consulta;
        this.frmMod = frmMod;
        frmMod.btnBuscar.addActionListener(this);
        frmMod.btnActualizar.addActionListener(this);
                
    }
    
    
    public void limpiar(){
        frmMod.txtApePat.setText("");
        frmMod.txtEquipo.setText("");
        frmMod.txtId.setText("");
        frmMod.txtNombreJu.setText("");
    }
    
     public void iniciarAlta(){
        frmMod.setTitle("Modificiar Jugador");
        frmMod.setLocationRelativeTo(null);
        frmMod.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource() == frmMod.btnActualizar){
             modelo.setIdJugador(Integer.parseInt(frmMod.txtId.getText()));
             modelo.setNombreJugador(frmMod.txtNombreJu.getText());
             modelo.setApellidosJugador(frmMod.txtApePat.getText());
             modelo.setEquipoIdEquipo(Integer.parseInt(frmMod.txtEquipo.getText()));
             if(consulta.actualizarJugador(modelo)){
                 JOptionPane.showMessageDialog(null, "Registro modificado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
             }
        }
        if(e.getSource() == frmMod.btnBuscar){
             modelo.setNombreEquipo(frmMod.txtNombreJu.getText());
    
             if(consulta.buscarEquipo(equipo)){
                 frmAlta.txtIdEq.setText(String.valueOf(equipo.getIdEquipo()));
                 frmAlta.txtNombreEq.setText(equipo.getNombreEquipo());
                 frmAlta.txtTorneo.setText(String.valueOf(equipo.getTorneoIdTorneo()));
  
             }else{
                 JOptionPane.showMessageDialog(null, "Registro no encontrado");
                limpiarAlta();
                
             }
    
        }
        
        
        
    }
    
}
