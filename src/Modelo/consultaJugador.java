/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vanessa
 */
public class consultaJugador extends Conexion {
     public boolean registrarJugador(Jugador jugador){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="INSERT INTO Jugador (nombreJugador,apellidosJugador,estadoJugador,Equipo_idEquipo) VALUES(?,?,?,?)";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, jugador.getNombreJugador());
            ps.setString(2, jugador.getApellidosJugador());
            ps.setBoolean(3, jugador.getEstadoJugador());
            ps.setInt(4, jugador.getEquipoIdEquipo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
    
    public boolean actualizarJugador(Jugador jugador){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="UPDATE Jugador SET nombreJugador=? , apellidosJugador=? , Equipo_idEquipo= ? WHERE idJugador=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, jugador.getNombreJugador());
            ps.setString(2, jugador.getApellidosJugador());
            ps.setInt(3, jugador.getEquipoIdEquipo());
            ps.setInt(4, jugador.getIdJugador());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
    
    public boolean eliminarJugador(Jugador jugador){
    
        PreparedStatement ps= null;
        Connection con = getConexion();
        String sql ="DELETE FROM Jugador WHERE idJugador=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, jugador.getIdJugador());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
    
    public boolean buscarJugador(Jugador jugador){
    
        PreparedStatement ps= null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql ="SELECT * FROM Jugador WHERE nombreJugador=?";  
        
        try{
        
            ps= con.prepareStatement(sql);
            
            ps.setString(1, jugador.getNombreJugador());
            rs = ps.executeQuery();
            
            if(rs.next()){
                jugador.setIdJugador(Integer.parseInt(rs.getString("idJugador")));
                jugador.setNombreJugador(rs.getString("nombreJugador"));
                jugador.setApellidosJugador(rs.getString("apellidosJugador"));
                jugador.setEquipoIdEquipo(Integer.parseInt(rs.getString("Equipo_idEquipo")));
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        
        }finally{
            try{
                con.close();
            
            }catch(SQLException e){
             System.err.println(e);
            }
        }
            
    }
}
