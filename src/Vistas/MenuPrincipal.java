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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiFormAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiFormMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiManejoInsc = new javax.swing.JMenuItem();
        jmiManejoNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAlumPorMat = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmiFormAlumno.setText("Formulario de alumo");
        jmiFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFormAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jmiFormMateria.setText("Formulario de materia");
        jMenu2.add(jmiFormMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");

        jmiManejoInsc.setText("Manejo de inscripciones");
        jMenu3.add(jmiManejoInsc);

        jmiManejoNotas.setText("Manipulacion de notas");
        jmiManejoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmiManejoNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmiAlumPorMat.setText("Alumnos por materias");
        jMenu4.add(jmiAlumPorMat);

        jMenuBar1.add(jMenu4);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiFormAlumnoActionPerformed

    private void jmiManejoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiManejoNotasActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAlumPorMat;
    private javax.swing.JMenuItem jmiFormAlumno;
    private javax.swing.JMenuItem jmiFormMateria;
    private javax.swing.JMenuItem jmiManejoInsc;
    private javax.swing.JMenuItem jmiManejoNotas;
    // End of variables declaration//GEN-END:variables
}
