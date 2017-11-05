/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Arbitro;
import Modelo.consultaArbitro;
import Vista.RegistrarArbitro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author vanessa
 */
public class CtrlArbitro implements ActionListener{
    
    private Arbitro mod;
    private consultaArbitro cons;
    private RegistrarArbitro frmArbitro;

    public CtrlArbitro(Arbitro mod, consultaArbitro cons, RegistrarArbitro frmArbitro) {
        this.mod = mod;
        this.cons = cons;
        this.frmArbitro = frmArbitro;
        this.frmArbitro.btnGuardar.addActionListener(this);
        this.frmArbitro.btnActualizar.addActionListener(this);
        this.frmArbitro.btnBorrar.addActionListener(this);
        this.frmArbitro.btnBuscar.addActionListener(this);
        this.frmArbitro.btnRegresar.addActionListener(this);
    }
    
    public void iniciar(){
        frmArbitro.setTitle("Arbitro");
        frmArbitro.setLocationRelativeTo(null);
        frmArbitro.txtId.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == frmArbitro.btnGuardar){
             mod.setNombreArbitro(frmArbitro.txtNombre.getText());
             mod.setApellidoArbitro(frmArbitro.txtApellidos.getText());
             if(cons.registrarArbitro(mod)){
                 JOptionPane.showMessageDialog(null, "Registro Guardado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Guardar");
                 limpiar();
             }
        }
        if(e.getSource() == frmArbitro.btnActualizar){
             mod.setIdArbitro(Integer.parseInt(frmArbitro.txtId.getText()));
             mod.setNombreArbitro(frmArbitro.txtNombre.getText());
             mod.setApellidoArbitro(frmArbitro.txtApellidos.getText());
             if(cons.actualizarArbitro(mod)){
                 JOptionPane.showMessageDialog(null, "Registro modificado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al modificar");
                 limpiar();
             }
        }
        
        if(e.getSource() == frmArbitro.btnBorrar){
             mod.setIdArbitro(Integer.parseInt(frmArbitro.txtId.getText()));
    
             if(cons.eliminarArbitro(mod)){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al eliminar");
                 limpiar();
             }
        }
        
        if(e.getSource() == frmArbitro.btnBuscar){
             mod.setNombreArbitro(frmArbitro.txtNombre.getText());
    
             if(cons.buscarArbitro(mod)){
                 frmArbitro.txtId.setText(String.valueOf(mod.getIdArbitro()));
                 frmArbitro.txtNombre.setText(mod.getNombreArbitro());
                 frmArbitro.txtApellidos.setText(mod.getApellidoArbitro());
  
             }else{
                 JOptionPane.showMessageDialog(null, "Registro no encontrado");
                 limpiar();
                
             }
        }
        
        
    }
    
    public void limpiar(){
        frmArbitro.txtNombre.setText("");
        frmArbitro.txtApellidos.setText("");
        frmArbitro.txtId.setText("");
    }
    
}
