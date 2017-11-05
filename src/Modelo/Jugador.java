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
public class Jugador {
     private int idJugador;
     private String nombreJugador;
     private String apellidosJugador;
     private Boolean estadoJugador;
     private int equipoIdEquipo;

    public Jugador() {
    }

	
    public Jugador(String nombreJugador, String apellidosJugador, int equipoIdEquipo) {
        this.nombreJugador = nombreJugador;
        this.apellidosJugador = apellidosJugador;
        this.equipoIdEquipo = equipoIdEquipo;
    }
    public Jugador(String nombreJugador, String apellidosJugador, Boolean estadoJugador, int equipoIdEquipo) {
       this.nombreJugador = nombreJugador;
       this.apellidosJugador = apellidosJugador;
       this.estadoJugador = estadoJugador;
       this.equipoIdEquipo = equipoIdEquipo;
    }
   
    public int getIdJugador() {
        return this.idJugador;
    }
    
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }
    public String getNombreJugador() {
        return this.nombreJugador;
    }
    
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public String getApellidosJugador() {
        return this.apellidosJugador;
    }
    
    public void setApellidosJugador(String apellidosJugador) {
        this.apellidosJugador = apellidosJugador;
    }
    public Boolean getEstadoJugador() {
        return this.estadoJugador;
    }
    
    public void setEstadoJugador(Boolean estadoJugador) {
        this.estadoJugador = estadoJugador;
    }
    public int getEquipoIdEquipo() {
        return this.equipoIdEquipo;
    }
    
    public void setEquipoIdEquipo(int equipoIdEquipo) {
        this.equipoIdEquipo = equipoIdEquipo;
    }


}
