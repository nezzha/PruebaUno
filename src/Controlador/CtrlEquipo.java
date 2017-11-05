/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.consultaEquipo;
import Vista.EliminarEquipo;
import Vista.ModificarEquipo;
import Vista.RegistrarEquipo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;




/**
 *
 * @author vanessa
 */
public class CtrlEquipo implements ActionListener {
    private Equipo equipo;
    private consultaEquipo consulta;
    private RegistrarEquipo frmAlta;
    private ModificarEquipo frmMod;
    private EliminarEquipo frmEq;

    public CtrlEquipo(Equipo equipo, consultaEquipo consulta, RegistrarEquipo frmAlta, ModificarEquipo frmMod, EliminarEquipo frmEq) {
        this.equipo = equipo;
        this.consulta = consulta;
        this.frmAlta = frmAlta;
        this.frmMod = frmMod;
        this.frmEq = frmEq;
        
        this.frmAlta.btnAceptar.addActionListener(this);
        this.frmMod.btnModificar.addActionListener(this);
        this.frmEq.btnEliminar.addActionListener(this);
        this.frmMod.btnBuscar.addActionListener(this);
        this.frmEq.btnBuscar.addActionListener(this);
    }

    public CtrlEquipo(Equipo equipo, consultaEquipo consulta, RegistrarEquipo frmAlta) {
        this.equipo = equipo;
        this.consulta = consulta;
        this.frmAlta = frmAlta;
        this.frmAlta.btnAceptar.addActionListener(this);
        this.frmAlta.btnMOd.addActionListener(this);
        this.frmAlta.btnBuscar.addActionListener(this);
        this.frmAlta.btnEliminar.addActionListener(this);
    }

    public CtrlEquipo(Equipo equipo, consultaEquipo consulta, ModificarEquipo frmMod) {
        this.equipo = equipo;
        this.consulta = consulta;
        this.frmMod = frmMod;
        this.frmMod.btnModificar.addActionListener(this);
        this.frmMod.btnBuscar.addActionListener(this);
    }

    public CtrlEquipo(Equipo equipo, consultaEquipo consulta, EliminarEquipo frmEq) {
        this.equipo = equipo;
        this.consulta = consulta;
        this.frmEq = frmEq;
        this.frmEq.btnEliminar.addActionListener(this);
        this.frmEq.btnBuscar.addActionListener(this);
    }
    
    public void iniciarAlta(){
        frmAlta.setTitle("Alta Equipo");
        frmAlta.setLocationRelativeTo(null);
        frmAlta.txtIdEq.setVisible(false);
    }
    
      public void iniciarEliminar(){
        frmEq.setTitle("Eliminar Equipo");
        frmEq.setLocationRelativeTo(null);
       
        frmEq.txtIdEq.setVisible(false);
    }
    
        public void iniciarMod(){
        frmMod.setTitle("Modificar Equipo");
        frmMod.setLocationRelativeTo(null);
        frmMod.txtIdEq.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmAlta.btnAceptar){
             equipo.setNombreEquipo(frmAlta.txtNombreEq.getText());
             equipo.setTorneoIdTorneo(Integer.parseInt(frmAlta.txtTorneo.getText()));
             if(consulta.registrarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro Guardado");
                 limpiarAlta();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Guardar");
                  limpiarAlta();
             }
        }
        if(e.getSource() == frmAlta.btnMOd){
             equipo.setIdEquipo(Integer.parseInt(frmAlta.txtIdEq.getText()));
             equipo.setNombreEquipo(frmAlta.txtNombreEq.getText());
             equipo.setTorneoIdTorneo(Integer.parseInt(frmAlta.txtTorneo.getText()));
             if(consulta.actualizarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro modificado");
                 limpiarAlta();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al modificar");
              limpiarAlta();
             }
        }
        
        if(e.getSource() == frmAlta.btnEliminar){
             equipo.setIdEquipo(Integer.parseInt(frmAlta.txtIdEq.getText()));
    
             if(consulta.eliminarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
                 limpiarAlta();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al eliminar");
                 limpiarAlta();
             }
        }
        
        if(e.getSource() == frmAlta.btnBuscar){
             equipo.setNombreEquipo(frmAlta.txtNombreEq.getText());
    
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
        
     public void limpiarAlta(){
        frmAlta.txtNombreEq.setText("");
        frmAlta.txtTorneo.setText("");
        frmAlta.txtIdEq.setText("");
    }
    
     public void limpiarMod(){
        frmMod.txtNombreEq.setText("");
        frmMod.txtTorneo.setText("");
       
        frmMod.txtIdEq.setText("");
                
    }
      public void limpiarEq(){
        frmEq.txtNombreEq.setText("");
        frmEq.txtTorneo.setText("");
       
        frmEq.txtIdEq.setText("");
                
    }
    
    
   /* @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmAlta.btnAceptar){
             equipo.setNombreEquipo(frmAlta.txtNombreEq.getText());
             equipo.setTorneoIdTorneo(Integer.parseInt(frmAlta.txtTorneo.getText()));
             if(consulta.registrarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro Guardado");
                 limpiarAlta();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Guardar");
                  limpiarAlta();
             }
        }
        if(e.getSource() == frmMod.btnModificar){
             equipo.setIdEquipo(Integer.parseInt(frmMod.txtIdEq.getText()));
             equipo.setNombreEquipo(frmMod.txtNombreEq.getText());
             equipo.setTorneoIdTorneo(Integer.parseInt(frmMod.txtTorneo.getText()));
             if(consulta.actualizarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro modificado");
                 limpiarMod();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al modificar");
              limpiarMod();
             }
        }
        
        if(e.getSource() == frmEq.btnEliminar){
             equipo.setIdEquipo(Integer.parseInt(frmEq.txtIdEq.getText()));
    
             if(consulta.eliminarEquipo(equipo)){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
                 limpiarEq();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al eliminar");
                 limpiarEq();
             }
        }
        
        if(e.getSource() == frmEq.btnBuscar){
             equipo.setNombreEquipo(frmEq.txtNombreEq.getText());
    
             if(consulta.buscarEquipo(equipo)){
                 frmEq.txtIdEq.setText(String.valueOf(equipo.getIdEquipo()));
                 frmEq.txtNombreEq.setText(equipo.getNombreEquipo());
                 frmEq.txtTorneo.setText(String.valueOf(equipo.getTorneoIdTorneo()));
  
             }else{
                 JOptionPane.showMessageDialog(null, "Registro no encontrado");
                limpiarEq();
                
             }
        }
        
        if(e.getSource() == frmMod.btnBuscar){
             equipo.setNombreEquipo(frmMod.txtNombreEq.getText());
    
             if(consulta.buscarEquipo(equipo)){
                 frmMod.txtIdEq.setText(String.valueOf(equipo.getIdEquipo()));
                 frmMod.txtNombreEq.setText(equipo.getNombreEquipo());
                 frmMod.txtTorneo.setText(String.valueOf(equipo.getTorneoIdTorneo()));
  
             }else{
                 JOptionPane.showMessageDialog(null, "Registro no encontrado");
                 limpiarMod();
                
             }
        }
        
        
    }*/
    
    
}
