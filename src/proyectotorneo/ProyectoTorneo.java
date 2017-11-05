/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotorneo;

import Controlador.CtrlArbitro;
import Modelo.Arbitro;
import Modelo.consultaArbitro;
import Vista.RegistrarArbitro;
import Vista.login;

/**
 *
 * @author vanessa
 */
public class ProyectoTorneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Arbitro mod = new Arbitro();
        consultaArbitro consul  = new consultaArbitro();
        RegistrarArbitro frm= new RegistrarArbitro();
        CtrlArbitro ctrl = new CtrlArbitro(mod, consul, frm);
        ctrl.iniciar();
        frm.setVisible(true);*/
      new Vista.login().setVisible(true);
        // TODO code application logic here
    }
    
}
