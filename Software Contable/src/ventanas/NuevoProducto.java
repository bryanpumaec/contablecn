package ventanas;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import clases.BoxMetodo;
import clases.Cls_Productos;
import clases.reportes;

public class NuevoProducto extends javax.swing.JFrame {

    private final Cls_Productos CP;
    int num = 0;
    public static DefaultComboBoxModel modeldep, modelcid;

    BoxMetodo metodos = new BoxMetodo();

    public NuevoProducto() {

        initComponents();
        metodos.consultar();

        categoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                metodos.consultar();

            }

        });

        ImageIcon imagen = new ImageIcon("src\\fondos\\fondo3.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(txtnomprov.getWidth(), txtnomprov.getHeight(), Image.SCALE_DEFAULT));
        txtnomprov.setIcon(icono);
        this.repaint();
        CP = new Cls_Productos();
        listar();
        setSize(935, 680);
        setResizable(false);
        this.setLocationRelativeTo(null);

    }

    public void abrirarchivo(String archivo) {

        try {

            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);
        }
    }

    private void listar() {
        jtb_datos.setModel(CP.getDatosPro());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_datos = new javax.swing.JTable();
        jb_eliminar = new javax.swing.JButton();
        jb_nuevo = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        label_dep = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblfondo1 = new javax.swing.JLabel();
        txtnomprov = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        guardar.setBackground(new java.awt.Color(0, 0, 0));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("GUARDAR");
        guardar.setToolTipText("Para modificar un registro,\n vuelve a presionar el botón de Guardar.");
        guardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guardarMouseMoved(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar);
        guardar.setBounds(430, 200, 110, 40);

        cancelar.setBackground(new java.awt.Color(102, 255, 51));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelar.setText("Regresar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(770, 560, 120, 50);

        jtb_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtb_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_datos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 897, 280);

        jb_eliminar.setBackground(new java.awt.Color(0, 0, 0));
        jb_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar.setText("ELIMINAR");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_eliminar);
        jb_eliminar.setBounds(610, 200, 110, 40);

        jb_nuevo.setBackground(new java.awt.Color(0, 0, 0));
        jb_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_nuevo.setText("NUEVO");
        jb_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_nuevo);
        jb_nuevo.setBounds(250, 200, 110, 40);

        codigo.setEditable(false);
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        getContentPane().add(codigo);
        codigo.setBounds(60, 100, 40, 30);

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 90, 70, 50);
        getContentPane().add(descripcion);
        descripcion.setBounds(180, 100, 260, 30);

        jLabel4.setText("Costo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 100, 70, 30);

        jLabel5.setText("P.V.P.:      ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 100, 60, 30);
        getContentPane().add(costo);
        costo.setBounds(510, 100, 110, 30);
        getContentPane().add(precio);
        precio.setBounds(710, 100, 110, 30);

        jLabel7.setText("Código");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 100, 50, 30);

        getContentPane().add(categoria);
        categoria.setBounds(180, 150, 200, 30);

        label_dep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_dep.setText("Categoria:");
        getContentPane().add(label_dep);
        label_dep.setBounds(60, 150, 109, 29);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VOLVER A LA COMPRA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 10, 170, 40);

        lblfondo1.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblfondo1.setText("REGISTRAR PRODUCTO");
        getContentPane().add(lblfondo1);
        lblfondo1.setBounds(210, -10, 530, 120);

        txtnomprov.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        getContentPane().add(txtnomprov);
        txtnomprov.setBounds(-10, 0, 940, 640);

        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Viner Hand ITC", 0, 21)); // NOI18N

        jMenu2.setText("MANTENIMIENTO");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu2MouseReleased(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem8.setText("Registrar Categoría");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CATÁLOGO");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setText("REPORTE");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        //codigo.setText("");
        descripcion.setText("");
        costo.setText("");
        precio.setText("");

        //cantidad.setText("");
        descripcion.requestFocus();
    }

    private void guardar() {
        String des = descripcion.getText();
        float cos = Float.parseFloat(costo.getText());
        float pre = Float.parseFloat(precio.getText());
        //int can = Integer.parseInt(cantidad.getText());
        int t1 = 0;

        if (categoria.getSelectedIndex() == 0) {
            t1 = 1;
        }
        if (categoria.getSelectedIndex() == 1) {
            t1 = 2;
        }
        
        if (num == 0) {
            int respuesta = CP.insertDatosPro(des, cos, pre, t1);

            if (respuesta > 0) {
                listar();
                limpiar();
            }
        } else {
            int id = Integer.parseInt(codigo.getText());
            int respuesta = CP.actualizarP(id, des, cos, pre);
            if (respuesta > 0) {
                listar();
                limpiar();
                codigo.setText("");
                num = 0;
            }
        }

    }

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        MenuPrincipal e = new MenuPrincipal();
        e.setVisible(true);
        NuevoProducto.this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jtb_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_datosMouseClicked
        int row = jtb_datos.getSelectedRow();
        codigo.setText(jtb_datos.getValueAt(row, 0).toString());
        descripcion.setText(jtb_datos.getValueAt(row, 1).toString());
        //cantidad.setText(jtb_datos.getValueAt(row, 4).toString());
        costo.setText(jtb_datos.getValueAt(row, 2).toString());
        precio.setText(jtb_datos.getValueAt(row, 3).toString());
        num = 1;
    }//GEN-LAST:event_jtb_datosMouseClicked

    private void jb_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevoActionPerformed
        codigo.setText("");
        limpiar();
        listar();
    }//GEN-LAST:event_jb_nuevoActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        int fila = jtb_datos.getSelectedRowCount();
        if (fila < 1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        } else {
            if (CP.elimiarP(Integer.parseInt(jtb_datos.getValueAt(jtb_datos.getSelectedRow(), 0).toString())) > 0) {
                limpiar();
                listar();
                num = 0;
            }
        }
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CategoriasProd e = new CategoriasProd();
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseReleased

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked

        abrirarchivo("src\\interfaz\\Catálogo Mega EcuaFarma Natural.pdf");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        {
            reportes conn = new reportes();
            Connection con = reportes.getConexion();

            JasperReport reporte = null;
            String path = "src\\reportes\\reporteproductos.jasper";

            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

                JasperPrint jprint = JasperFillManager.fillReport(path, null, con);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }    }//GEN-LAST:event_jMenu1MouseClicked

    private void guardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    public static javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_nuevo;
    private javax.swing.JTable jtb_datos;
    private javax.swing.JLabel label_dep;
    private javax.swing.JLabel lblfondo1;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel txtnomprov;
    // End of variables declaration//GEN-END:variables
}
