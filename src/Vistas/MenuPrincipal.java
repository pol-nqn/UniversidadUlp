/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author nstut
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jmFormularioMaterias = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiFormAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiFormMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiManejoInsc = new javax.swing.JMenuItem();
        jmiManejoNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAlumPorMat = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jmFormularioMaterias.setAlignmentX(5.0F);

        jMenu1.setText("Alumno");
        jMenu1.setPreferredSize(new java.awt.Dimension(80, 21));

        jmiFormAlumno.setText("Formulario de alumo");
        jmiFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFormAlumno);

        jmFormularioMaterias.add(jMenu1);

        jMenu2.setText("Materia");
        jMenu2.setPreferredSize(new java.awt.Dimension(80, 21));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmiFormMateria.setText("Formulario de materia");
        jmiFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFormMateria);

        jmFormularioMaterias.add(jMenu2);

        jMenu3.setText("Administración");
        jMenu3.setPreferredSize(new java.awt.Dimension(120, 21));

        jmiManejoInsc.setText("Manejo de inscripciones");
        jmiManejoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoInscActionPerformed(evt);
            }
        });
        jMenu3.add(jmiManejoInsc);

        jmiManejoNotas.setText("Manipulacion de notas");
        jmiManejoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmiManejoNotas);

        jmFormularioMaterias.add(jMenu3);

        jMenu4.setText("Consultas");
        jMenu4.setPreferredSize(new java.awt.Dimension(80, 21));

        jmiAlumPorMat.setText("Alumnos por materias");
        jmiAlumPorMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumPorMatActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAlumPorMat);

        jmFormularioMaterias.add(jMenu4);

        jMenu6.setEnabled(false);
        jMenu6.setPreferredSize(new java.awt.Dimension(275, 21));
        jmFormularioMaterias.add(jMenu6);

        jmSalir.setText("Salir");
        jmSalir.setAlignmentX(2.0F);
        jmSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jmFormularioMaterias.add(jmSalir);

        setJMenuBar(jmFormularioMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormAlumnoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioAlumnos formAlumn =new FormularioAlumnos();
        formAlumn.setVisible(true);
        Escritorio.add(formAlumn);
        Escritorio.moveToFront(formAlumn);
    }//GEN-LAST:event_jmiFormAlumnoActionPerformed

    private void jmiManejoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoNotasActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioNotas formNotas =new FormularioNotas();
        formNotas.setVisible(true);
        Escritorio.add(formNotas);
        Escritorio.moveToFront(formNotas);
    }//GEN-LAST:event_jmiManejoNotasActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
       
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
    System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmiFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioMaterias formMat =new FormularioMaterias();
        formMat.setVisible(true);
        Escritorio.add(formMat);
        Escritorio.moveToFront(formMat);
    }//GEN-LAST:event_jmiFormMateriaActionPerformed

    private void jmiManejoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoInscActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioInscripciones formInsc =new FormularioInscripciones();
        formInsc.setVisible(true);
        Escritorio.add(formInsc);
        Escritorio.moveToFront(formInsc);
        
    }//GEN-LAST:event_jmiManejoInscActionPerformed

    private void jmiAlumPorMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumPorMatActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AlumnosPorMateria alumPorMat =new AlumnosPorMateria();
        alumPorMat.setVisible(true);
        Escritorio.add(alumPorMat);
        Escritorio.moveToFront(alumPorMat);
    }//GEN-LAST:event_jmiAlumPorMatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar jmFormularioMaterias;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAlumPorMat;
    private javax.swing.JMenuItem jmiFormAlumno;
    private javax.swing.JMenuItem jmiFormMateria;
    private javax.swing.JMenuItem jmiManejoInsc;
    private javax.swing.JMenuItem jmiManejoNotas;
    // End of variables declaration//GEN-END:variables
}
