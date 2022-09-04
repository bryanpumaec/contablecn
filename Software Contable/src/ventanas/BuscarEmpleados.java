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
public class BuscarEmpleados extends javax.swing.JFrame {

    private final Cls_Productos CP;
    int num = 0;

    /**
     * Creates new form frm_Buscarclientes
     */
    public BuscarEmpleados() {
        initComponents();
        CP = new Cls_Productos();

        setTitle("Busqueda de Empleados (REGISTRO)");
        Cls_Productos factu = new Cls_Productos();
        factu.BuscarEmpleado(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnseleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsalir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnseleccionar.setBackground(new java.awt.Color(0, 0, 0));
        btnseleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

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

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnseleccionar)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btnseleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(958, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed

        RegEmpleados.Ci = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        RegEmpleados.Nombre = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString();
        RegEmpleados.Apellido = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 2).toString();
        RegEmpleados.Direccion = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 3).toString();
        RegEmpleados.Telf = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 4).toString();
        RegEmpleados.Mail = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 5).toString();
//        RegClientes.Mail=this.jTable1.getValueAt(this.jTable1.getSelectedRow(),6).toString();
        this.setVisible(false);
        if (RegClientesVenta.cont == 0) {
            JOptionPane.showMessageDialog(null, "Click en el boton Agregar para ingresar el Empleado");
        }
        RegEmpleados.cont = RegEmpleados.cont + 1;
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = jTable1.getSelectedRowCount();
        if (fila < 1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        } else {
            if (CP.eliminarEmp(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()) > 0) {

            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JButton eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
