/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * frm_Buscarclientes.java
 *
 * Created on 14-nov-2011, 18:49:55
 */
package ventanas;

import clases.Cls_Productos;
import javax.swing.JOptionPane;

/**
 *
 * @author Mondal
 */
public class BuscarProveedor extends javax.swing.JFrame {

    Adquisicion frm_fac = new Adquisicion();

    /**
     * Creates new form frm_Buscarclientes
     */
    public BuscarProveedor() {
        initComponents();
        setTitle("Busqueda de Proveedores");
        Cls_Productos factu = new Cls_Productos();
        factu.BuscarProveedor(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnseleccionar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnseleccionar.setBackground(new java.awt.Color(0, 0, 0));
        btnseleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnseleccionar)
                .addGap(50, 50, 50)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btnseleccionar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(940, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        // TODO add your handling code here:
        RegProveedores.Ci = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        RegProveedores.Nombre = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString();
        RegProveedores.Direccion = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 2).toString();
        RegProveedores.Gerente = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 3).toString();
        RegProveedores.Telf = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 4).toString();
        RegProveedores.Mail = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 5).toString();

        this.setVisible(false);
        if (RegProveedores.cont == 0) {
            JOptionPane.showMessageDialog(null, "Click en el boton Agregar para ingresar el Proveedor");
            RegProveedores.cont = RegProveedores.cont + 1;

        }

    }//GEN-LAST:event_btnseleccionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
