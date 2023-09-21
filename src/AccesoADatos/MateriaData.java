/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
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

    public Materia buscarMateria(int id) {
        String sql = "SELECT * FROM materia WHERE idMateria = ?;";
        Materia materia = new Materia();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No existe la materia");
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia "
                + "SET nombre = ?,anio = ?,estado = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());

            int modif = ps.executeUpdate();
            if (modif == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la materia exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No existe la materia");
        } /*catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }*/

    }

    public void eliminarMateria(int id) {
        /***********REVISAR CODIGO PARA VER EL IF DEL ESTADO*************/
//        String sqlA = "SELECT estado FROM materia WHERE idMateria = ?";

//        try {
//            PreparedStatement psA = con.prepareStatement(sqlA);
//            psA.setInt(1, id);
//            
//            ResultSet rs = psA.executeQuery();

//            while (rs.next()) {
//                boolean estado = rs.getBoolean("estado");
//                if (estado = true) {
                    String sql = "UPDATE materia SET estado = ? WHERE idMateria = ?";

                    try {
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setBoolean(1, false);
                        ps.setInt(2, id);
                        
                        int eliminar = ps.executeUpdate();
                        if (eliminar == 1) {
                            JOptionPane.showMessageDialog(null, "Se eliminó la materia exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe la materia");
                            //agregar mensaje en case de que la materia ya este eliminada
                        }
                        ps.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "No existe la materia");
                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "La materia ya se encuentra inactiva");

//                }
//            }

//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No existe la materia");
//        }

    }

    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setIdMateria(rs.getInt("idMateria"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return materias;
    }
}
