/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;
 import Entidades.Alumno;
 import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author nstut
 */
public class AlumnoData {
    private Connection con = null;

    public AlumnoData() {
        this.con = Conexion.conectar();
    }

    public void guardarAlumno(Alumno alumno){
        
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
 try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.setInt(1, alumno.getDni());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getNombre());
        ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//localDate a Date
        ps.setBoolean(5, alumno.isEstado()); // if reducido
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
        alumno.setIdAlumno(rs.getInt("idAlumno"));
        JOptionPane.showMessageDialog(null, "Alumno añadido con exito."); 

       }
        ps.close();

        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
       }
    }
    
    
}
