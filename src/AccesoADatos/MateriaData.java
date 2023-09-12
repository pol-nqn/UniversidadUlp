/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Materia;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author nstut
 */
public class MateriaData {
    private Connection con;

    public MateriaData() {
        this.con = Conexion.conectar();
    }
    
    public void guardarMateria (Materia materia){
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2 ,materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            int insert = ps.executeUpdate();
            if (insert == 1) {
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar la materia.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta sql.");
        }
        
    }
    
}
