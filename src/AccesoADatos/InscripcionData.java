/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.*;
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
public class InscripcionData {
    private Connection con;
    private AlumnoData aluData;
    private MateriaData matData;

    public InscripcionData() {
        this.con = Conexion.conectar();
    }

    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,materia "
                + "WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ? ;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            Materia materia;
            while (rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No exite el alumno "+ ex.getMessage());
        }
        
        return materias;
    }
    /*Agregar metodos propios*/
    public List<Inscripcion> obtenerInscripcionPorAlumno(int id){
       List<Inscripcion> inscripciones = new ArrayList<Inscripcion>(); 
       
       String sql = "SELECT idInscripcion,idMateria FROM inscripcion "
               + "WHERE inscripcion.idAlumno = ? "; 
       
       return inscripciones;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia"
                + "WHERE NOT inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ? ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while (rs.next()){
                materia= new Materia();
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setNombre(rs.getString("nombre"));
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No existe el alumno " + ex.getMessage());
        }
        return materias;
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
        
    }
}
