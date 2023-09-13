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
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia"
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
    
    public void guardarInscripcion(Inscripcion ins){
        
        /*Controlar ingreso de usuarios*/
        try {
            String sql = "INSERT INTO inscripcion(`nota`, `idAlumno`, `idMateria`)"
                + " VALUES ( ? , ? , ? )";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, ins.isNota());
            ps.setInt(2,ins.getAlumno().getIdAlumno());
            ps.setInt(3,ins.getMateria().getIdMateria());
            
            int insert = ps.executeUpdate();
            
            if (insert == 1){
                JOptionPane.showMessageDialog(null, "Inscripcion realizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Falló la inscripcion.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a ejecutar la consulta sql");
        }
        
    }
    public void borrarInscripcion(Inscripcion ins){
        
        /*Controlar ingreso de usuarios*/
        try {
            String sql = "DELETE FROM inscripcion WHERE idInscripcion = ?";
                
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ins.getIdInscripcion());
            
            int insert = ps.executeUpdate();
            
            if (insert == 1){
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraba inscripto a la materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a ejecutar la consulta sql");
        }
    }
    
    public void actualizarNota(int idAlum, int idMat, double nota){
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlum);
            ps.setInt(3, idMat);
            
            int update = ps.executeUpdate();
            if (update == 1){
                JOptionPane.showMessageDialog(null, "Se actualizó la nota correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se puso actualizar la nota.");
            }
                
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta sql.");
        }
    }
    
    public List<Alumno> obternerAlumnoPorMateria(int idMat){
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT alumno.* FROM alumno "
                + "JOIN inscripcion ON (alumno.idAlumno = inscripcion.idAlumno) WHERE idMateria = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMat);
            ResultSet rs = ps.executeQuery();
            
            Alumno alum;
            while (rs.next()){
                alum = new Alumno();
                alum.setIdAlumno(rs.getInt("idAlumno"));
                alum.setDni(rs.getInt("dni"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(rs.getBoolean("estado"));
                alumnos.add(alum);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alumnos;
    }
}
