/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class FormularioInscripciones extends javax.swing.JInternalFrame {
private DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form FormularionInscripciones
     */
    public FormularioInscripciones() {
        initComponents();
        agregarItems();
        armarCabecera();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcListaAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrMatInsc = new javax.swing.JRadioButton();
        jrMatNoInsc = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInsc = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Formulario de Inscripciones");

        jLabel2.setText("Seleccione un alumno:");

        jcListaAlumnos.setToolTipText("");
        jcListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListaAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de materias");

        jrMatInsc.setText("Materias inscriptas");
        jrMatInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatInscActionPerformed(evt);
            }
        });

        jrMatNoInsc.setText("Materias no inscriptas");
        jrMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatNoInscActionPerformed(evt);
            }
        });

        jtTablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jtTablaMaterias);
        if (jtTablaMaterias.getColumnModel().getColumnCount() > 0) {
            jtTablaMaterias.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jtTablaMaterias.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jtTablaMaterias.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
        );

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInsc.setText("Anular inscripcion");
        jbAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jbInscribir)
                .addGap(18, 18, 18)
                .addComponent(jbAnularInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jcListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrMatInsc)
                                .addGap(44, 44, 44)
                                .addComponent(jrMatNoInsc))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMatInsc)
                    .addComponent(jrMatNoInsc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbInscribir)
                        .addComponent(jbAnularInsc)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrMatInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatInscActionPerformed
        InscripcionData insc=new InscripcionData();
        Alumno alumnoSelec = (Alumno)jcListaAlumnos.getSelectedItem();
        int idAlumnoSelec=alumnoSelec.getIdAlumno();
        List <Materia> listaInscriptas = insc.obtenerMateriasCursadas(idAlumnoSelec);
       
        for (Materia aux : listaInscriptas){
            model.addRow(new Object[]{aux.getIdMateria(),aux.getNombre(),aux.getAnioMateria()});
        }
    }//GEN-LAST:event_jrMatInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAnularInscActionPerformed

    private void jcListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcListaAlumnosActionPerformed

    private void jrMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatNoInscActionPerformed
        InscripcionData insc = new InscripcionData();
        Alumno alumnoSelec = (Alumno)jcListaAlumnos.getSelectedItem();
        int idAlumnoSelec=alumnoSelec.getIdAlumno();
        List <Materia> listaInscriptas = insc.obtenerMateriasNoCursadas(idAlumnoSelec);
       
        for (Materia aux : listaInscriptas){
            model.addRow(new Object[]{aux.getIdMateria(),aux.getNombre(),aux.getAnioMateria()});
        }
    }//GEN-LAST:event_jrMatNoInscActionPerformed
    public void agregarItems (){
        AlumnoData alumData = new AlumnoData();
        List<Alumno> listaAlumnos = alumData.listarAlumnos();
        for (Alumno aux :listaAlumnos){
            String dni = Integer.toString(aux.getDni());
            String apellido = aux.getApellido();
            String nombre = aux.getNombre();
            String fechaNac = aux.getFechaNacimiento().toString();
            jcListaAlumnos.addItem(aux);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInsc;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcListaAlumnos;
    private javax.swing.JRadioButton jrMatInsc;
    private javax.swing.JRadioButton jrMatNoInsc;
    private javax.swing.JTable jtTablaMaterias;
    // End of variables declaration//GEN-END:variables


private void armarCabecera(){
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Año");
    jtTablaMaterias.setModel(model);
}

}