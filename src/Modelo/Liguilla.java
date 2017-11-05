/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vanessa
 */
public class Liguilla {
     private int idLiguilla;
     private Boolean estadoLiguilla;
     private int torneoIdTorneo;
     private int rondaIdRonda;

    public Liguilla() {
    }

	
    public Liguilla(int torneoIdTorneo, int rondaIdRonda) {
        this.torneoIdTorneo = torneoIdTorneo;
        this.rondaIdRonda = rondaIdRonda;
    }
    public Liguilla(Boolean estadoLiguilla, int torneoIdTorneo, int rondaIdRonda) {
       this.estadoLiguilla = estadoLiguilla;
       this.torneoIdTorneo = torneoIdTorneo;
       this.rondaIdRonda = rondaIdRonda;
    }
   
    public int getIdLiguilla() {
        return this.idLiguilla;
    }
    
    public void setIdLiguilla(int idLiguilla) {
        this.idLiguilla = idLiguilla;
    }
    public Boolean getEstadoLiguilla() {
        return this.estadoLiguilla;
    }
    
    public void setEstadoLiguilla(Boolean estadoLiguilla) {
        this.estadoLiguilla = estadoLiguilla;
    }
    public int getTorneoIdTorneo() {
        return this.torneoIdTorneo;
    }
    
    public void setTorneoIdTorneo(int torneoIdTorneo) {
        this.torneoIdTorneo = torneoIdTorneo;
    }
    public int getRondaIdRonda() {
        return this.rondaIdRonda;
    }
    
    public void setRondaIdRonda(int rondaIdRonda) {
        this.rondaIdRonda = rondaIdRonda;
    }


}
