package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import clases.Cls_Productos;

public class Adquisicion extends javax.swing.JFrame {

    static String NombreProv;
    static int cont = 0;
    private final Cls_Productos CP;
    int num = 0;
    float valor;

    public Adquisicion() {
        initComponents();
        ImageIcon imagen = new ImageIcon("src\\fondos\\fondo3.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_DEFAULT));
        lblfondo.setIcon(icono);
        this.repaint();

        CP = new Cls_Productos();
        listar();
        setSize(880, 611);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_datos2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jtf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_can = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jd_fecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jtf_nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_ven = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        lblfondo1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnomprov = new javax.swing.JTextField();
        btnbuscarcli = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jtb_datos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtb_datos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_datos2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_datos2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 226, 833, 280);

        jButton2.setText("ATRÁS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 520, 100, 40);

        jtf_id.setEditable(false);
        getContentPane().add(jtf_id);
        jtf_id.setBounds(90, 60, 40, 30);

        jLabel2.setText("Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 60, 14);

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 140, 70, 14);
        getContentPane().add(jtf_can);
        jtf_can.setBounds(90, 140, 150, 30);

        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 60, 14);

        jd_fecha.setDateFormatString("yyyy/MM/dd HH:mm:ss");
        getContentPane().add(jd_fecha);
        jd_fecha.setBounds(90, 180, 150, 30);

        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 96, 70, 30);

        jtf_nom.setEditable(false);
        getContentPane().add(jtf_nom);
        jtf_nom.setBounds(90, 100, 150, 30);

        jLabel4.setText("Descripción de compra");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 150, 150, 14);
        getContentPane().add(jtf_ven);
        jtf_ven.setBounds(350, 180, 230, 30);

        guardar.setText("REALIZAR COMPRA");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar);
        guardar.setBounds(660, 150, 160, 60);

        lblfondo1.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblfondo1.setText("ADQUISICIONES");
        getContentPane().add(lblfondo1);
        lblfondo1.setBounds(260, 0, 350, 120);

        jLabel8.setText("Proveedor");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 110, 60, 30);

        txtnomprov.setEditable(false);
        getContentPane().add(txtnomprov);
        txtnomprov.setBounds(340, 110, 250, 30);

        btnbuscarcli.setBackground(new java.awt.Color(0, 0, 0));
        btnbuscarcli.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarcli.setText("Buscar Proveedor");
        btnbuscarcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcliActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscarcli);
        btnbuscarcli.setBounds(600, 110, 130, 30);

        btnagregar.setBackground(new java.awt.Color(0, 0, 0));
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Añadir");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar);
        btnagregar.setBounds(750, 110, 90, 30);

        lblfondo.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        getContentPane().add(lblfondo);
        lblfondo.setBounds(0, 0, 860, 590);

        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Viner Hand ITC", 0, 21)); // NOI18N

        jMenu2.setText("MANTENIMIENTO");

        jMenuItem8.setText("Modificar Producto");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        jtf_id.setText("");
        jtf_nom.setText("");
        jtf_can.setText("");
        jtf_ven.setText("");
        jd_fecha.setDate(null);
    }

    private void listar() {
        jtb_datos2.setModel(CP.getDatosIngreso());
    }


    private void jtb_datos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_datos2MouseClicked
        jtf_can.requestFocus();
        int row = jtb_datos2.getSelectedRow();
        jtf_id.setText(jtb_datos2.getValueAt(row, 0).toString());
        jtf_nom.setText(jtb_datos2.getValueAt(row, 1).toString());

    }//GEN-LAST:event_jtb_datos2MouseClicked

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
//        int row = jtb_datos2.getSelectedRow();
//        int cod = Integer.parseInt(jtf_id.getText());
//        int can = Integer.parseInt(jtf_can.getText());
//        int cantidad_saldo;
//        float total_saldo;
//        String ven = jtf_ven.getText();
//        String fecha = ((JTextField) jd_fecha.getDateEditor().getUiComponent()).getText();
//        CP.insertDatosInvEntradas(cod, can);
//        int respuesta = CP.insertDatosI(cod, can, fecha, ven);
//        if (respuesta > 0) {
//            float precio = CP.costoProducto(cod);
//            float total = precio * can;
//
//            int registros = CP.totalRegistros();
//            if (registros > 0) {
//                System.out.println("Datos por que si existen registros!");
//                cantidad_saldo = CP.cantidadSaldo(cod);
//                total_saldo = CP.totalSaldo(cod);
//                cantidad_saldo += can;
//                total_saldo += total;
//            } else {
//                cantidad_saldo = 0;
//                total_saldo = 0;
//                cantidad_saldo += can;
//                total_saldo += total;
//                System.out.println("Valor total de entrada: " + total_saldo);
//            }
//
//            CP.insertDatosKardex(fecha, ven, cod, can, total, cantidad_saldo, total_saldo);
//            listar();
//            limpiar();
//        } else {
//            limpiar();
//        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipal e = new MenuPrincipal();
        e.setVisible(true);
        Adquisicion.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbuscarcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcliActionPerformed
        // TODO add your handling code here:
        BuscarProveedor buscacli = new BuscarProveedor();
        buscacli.show();
        this.btnagregar.setEnabled(true);
    }//GEN-LAST:event_btnbuscarcliActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        this.txtnomprov.setText(this.NombreProv);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        NuevoProducto e = new NuevoProducto();
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
                new Adquisicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscarcli;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd_fecha;
    private javax.swing.JTable jtb_datos2;
    private javax.swing.JTextField jtf_can;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nom;
    private javax.swing.JTextField jtf_ven;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblfondo1;
    private javax.swing.JTextField txtnomprov;
    // End of variables declaration//GEN-END:variables
}
