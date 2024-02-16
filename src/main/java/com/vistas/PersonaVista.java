/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.vistas;

import com.controlador.PersonaControlador;
import com.modelo.Persona;
import java.awt.Color;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ktajt
 */
public class PersonaVista extends javax.swing.JFrame {

    /**
     * Creates new form PersonaVista
     */
    public PersonaVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        labelEncabezado = new javax.swing.JLabel();
        panelRegistroPersona = new javax.swing.JPanel();
        labelPersonaNit = new javax.swing.JLabel();
        labelPersonaNombre = new javax.swing.JLabel();
        labelPersonaDocumento = new javax.swing.JLabel();
        tfPersonaDocumento = new javax.swing.JTextField();
        tfPersonaNombre = new javax.swing.JTextField();
        tfPersonaNIT = new javax.swing.JTextField();
        panelGuardarPersona = new javax.swing.JPanel();
        btnGuardarPersona = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(242, 242, 242));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(219, 212, 131));

        labelEncabezado.setBackground(new java.awt.Color(50, 71, 89));
        labelEncabezado.setFont(new java.awt.Font("Fredoka One", 1, 48)); // NOI18N
        labelEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        labelEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEncabezado.setText("REGISTRO DE PERSONAS");

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 660, -1));

        panelRegistroPersona.setBackground(new java.awt.Color(139, 196, 196));

        labelPersonaNit.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        labelPersonaNit.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonaNit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPersonaNit.setText("NIT");

        labelPersonaNombre.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        labelPersonaNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonaNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPersonaNombre.setText("NOMBRE PERSONA:");

        labelPersonaDocumento.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        labelPersonaDocumento.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonaDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPersonaDocumento.setText("DPI");

        tfPersonaDocumento.setBackground(new java.awt.Color(50, 71, 89));
        tfPersonaDocumento.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        tfPersonaDocumento.setForeground(new java.awt.Color(255, 255, 255));
        tfPersonaDocumento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfPersonaDocumento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        tfPersonaNombre.setBackground(new java.awt.Color(50, 71, 89));
        tfPersonaNombre.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        tfPersonaNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfPersonaNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfPersonaNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        tfPersonaNIT.setBackground(new java.awt.Color(50, 71, 89));
        tfPersonaNIT.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        tfPersonaNIT.setForeground(new java.awt.Color(255, 255, 255));
        tfPersonaNIT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfPersonaNIT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        javax.swing.GroupLayout panelRegistroPersonaLayout = new javax.swing.GroupLayout(panelRegistroPersona);
        panelRegistroPersona.setLayout(panelRegistroPersonaLayout);
        panelRegistroPersonaLayout.setHorizontalGroup(
            panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroPersonaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroPersonaLayout.createSequentialGroup()
                        .addComponent(labelPersonaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRegistroPersonaLayout.createSequentialGroup()
                        .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPersonaNit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPersonaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPersonaDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(tfPersonaNIT))
                        .addGap(37, 37, 37))))
            .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroPersonaLayout.createSequentialGroup()
                    .addContainerGap(264, Short.MAX_VALUE)
                    .addComponent(tfPersonaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
        );
        panelRegistroPersonaLayout.setVerticalGroup(
            panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroPersonaLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(labelPersonaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPersonaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPersonaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPersonaNit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPersonaNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(panelRegistroPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRegistroPersonaLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(tfPersonaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );

        panelPrincipal.add(panelRegistroPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 480, 290));

        panelGuardarPersona.setBackground(new java.awt.Color(67, 95, 120));

        btnGuardarPersona.setFont(new java.awt.Font("Fredoka One", 0, 14)); // NOI18N
        btnGuardarPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardarPersona.setText("GUARDAR NUEVA PERSONA");
        btnGuardarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarPersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarPersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarPersonaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelGuardarPersonaLayout = new javax.swing.GroupLayout(panelGuardarPersona);
        panelGuardarPersona.setLayout(panelGuardarPersonaLayout);
        panelGuardarPersonaLayout.setHorizontalGroup(
            panelGuardarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        panelGuardarPersonaLayout.setVerticalGroup(
            panelGuardarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelGuardarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 480, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarPersonaMouseClicked
        // TODO add your handling code here:
        String personaNombre = this.tfPersonaNombre.getText();
        if (personaNombre.isEmpty() || personaNombre.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "NOMBRE DE PERSONA NO ES VÁLIDO", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String personaDPI = this.tfPersonaDocumento.getText();
        String personaNIT = this.tfPersonaNIT.getText();

        if (personaNIT.isEmpty() && !personaDPI.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO DE DOCUMENTO VÁLIDO", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (this.tfPersonaNIT.getText().isEmpty()) {
            this.tfPersonaNIT.setText("C/F");
        }
        
        long personaDocumento = !personaDPI.isEmpty() ? Long.parseLong(personaDPI) : 0;

        if (personaDocumento == 0 && personaNIT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO DE DOCUMENTO VÁ O NIT", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Persona persona = this.ConvertirPersona();
        
        if (persona == null) {
            JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR AL OBTENER DATOS INGRESADOS", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        PersonaControlador personaControlador = new PersonaControlador();
        try {
            personaControlador.GuardarPersona(persona);
            JOptionPane.showMessageDialog(null, "SE AGREGARON DATOS CORRECTAMENTE", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR AL OBTENER DATOS DE LA PERSONA" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PersonaVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarPersonaMouseClicked

    private void btnGuardarPersonaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarPersonaMouseEntered
        // TODO add your handling code here:
        panelGuardarPersona.setBackground(new Color(50, 71, 89));
    }//GEN-LAST:event_btnGuardarPersonaMouseEntered

    private void btnGuardarPersonaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarPersonaMouseExited
        // TODO add your handling code here:
        panelGuardarPersona.setBackground(new Color(67, 95, 120));
    }//GEN-LAST:event_btnGuardarPersonaMouseExited
    private UUID GenerarPersonaId() {
        return UUID.randomUUID();
    }

    private Persona ConvertirPersona() {
        Persona persona = new Persona();
        persona.setPersonaId(this.GenerarPersonaId());
        persona.setPersonaNombre(this.tfPersonaNombre.getText());
        persona.setPersonaDocumento(Long.parseLong(this.tfPersonaDocumento.getText()));
        persona.setPersonaNIT(this.tfPersonaNIT.getText());
        
        return persona;
    }

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
            java.util.logging.Logger.getLogger(PersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGuardarPersona;
    private javax.swing.JLabel labelEncabezado;
    private javax.swing.JLabel labelPersonaDocumento;
    private javax.swing.JLabel labelPersonaNit;
    private javax.swing.JLabel labelPersonaNombre;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelGuardarPersona;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRegistroPersona;
    private javax.swing.JTextField tfPersonaDocumento;
    private javax.swing.JTextField tfPersonaNIT;
    private javax.swing.JTextField tfPersonaNombre;
    // End of variables declaration//GEN-END:variables

    private static final Random random = new Random();
}
