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
public class Ronda {
    private int idRonda;
     private int numEquipos;
     private String nombreRonda;

    public Ronda() {
    }

    public Ronda(int numEquipos, String nombreRonda) {
       this.numEquipos = numEquipos;
       this.nombreRonda = nombreRonda;
    }
   
    public int getIdRonda() {
        return this.idRonda;
    }
    
    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }
    public int getNumEquipos() {
        return this.numEquipos;
    }
    
    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
    public String getNombreRonda() {
        return this.nombreRonda;
    }
    
    public void setNombreRonda(String nombreRonda) {
        this.nombreRonda = nombreRonda;
    }



}
