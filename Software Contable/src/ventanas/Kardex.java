package ventanas;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import clases.Cls_Productos;
import ventanas.MenuPrincipal;

public class Kardex extends javax.swing.JFrame {

    static String Id;
    static String Nombre;
    static String PVP;
    static String Stock;
        static int cont = 0;
    private final Cls_Productos CP;
    int num = 0;
   

    public Kardex() {
        initComponents();
        ImageIcon imagen = new ImageIcon("src\\fondos\\fondo3.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_DEFAULT));
        lblfondo.setIcon(icono);
        this.repaint();

        CP = new Cls_Productos();
        setSize(990, 530);
        this.setLocationRelativeTo(null);
        tf_codigo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_datos = new javax.swing.JTable();
        tf_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_pvp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        BTNBUSCAR = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Regresar_1.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(430, 430, 140, 50);

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
        jScrollPane1.setBounds(10, 210, 954, 210);

        tf_codigo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tf_codigoCaretUpdate(evt);
            }
        });
        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });
        tf_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_codigoKeyReleased(evt);
            }
        });
        getContentPane().add(tf_codigo);
        tf_codigo.setBounds(160, 102, 100, 30);

        jLabel2.setText("Id Producto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 80, 14);

        tf_nombre.setEditable(false);
        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nombre);
        tf_nombre.setBounds(160, 142, 228, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ENTRADAS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 190, 100, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("SALIDAS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 190, 90, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("SALDOS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(800, 190, 90, 22);

        jLabel7.setText("Nombre del Producto");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 150, 100, 14);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jLabel1.setText("KARDEX");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 0, 220, 100);

        jLabel8.setText("PVP");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 150, 30, 14);

        tf_pvp.setEditable(false);
        getContentPane().add(tf_pvp);
        tf_pvp.setBounds(430, 140, 120, 30);

        jLabel3.setText("STOCK");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 150, 60, 14);

        tf_stock.setEditable(false);
        getContentPane().add(tf_stock);
        tf_stock.setBounds(650, 140, 110, 30);

        BTNBUSCAR.setBackground(new java.awt.Color(0, 0, 0));
        BTNBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        BTNBUSCAR.setText("BUSCAR");
        BTNBUSCAR.setBorder(new javax.swing.border.MatteBorder(null));
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNBUSCAR);
        BTNBUSCAR.setBounds(280, 90, 100, 40);

        btnagregar.setBackground(new java.awt.Color(0, 0, 0));
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("AGREGAR");
        btnagregar.setBorder(new javax.swing.border.MatteBorder(null));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar);
        btnagregar.setBounds(390, 90, 100, 40);
        getContentPane().add(lblfondo);
        lblfondo.setBounds(0, 0, 980, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        MenuPrincipal e = new MenuPrincipal();
        e.setVisible(true);
        Kardex.this.dispose();

    }//GEN-LAST:event_cancelarActionPerformed

    private void jtb_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_datosMouseClicked

    }//GEN-LAST:event_jtb_datosMouseClicked

    private void tf_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codigoKeyReleased

    }//GEN-LAST:event_tf_codigoKeyReleased

    private void tf_codigoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tf_codigoCaretUpdate
        if (tf_codigo.getText().isEmpty()) {
            tf_nombre.setText("");
            tf_stock.setText("");
            limpiarTabla();
        } else {
            int codigo = Integer.parseInt(tf_codigo.getText());
            jtb_datos.setModel(CP.getDatosKardex(codigo));
            tf_nombre.setText(CP.nombreProducto(codigo));

        }

    }//GEN-LAST:event_tf_codigoCaretUpdate

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        BuscarProducto buscacli = new BuscarProducto();
        buscacli.show();
    }//GEN-LAST:event_BTNBUSCARActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        this.tf_codigo.setText(this.Id);
        this.tf_nombre.setText(Nombre);
        this.tf_pvp.setText(PVP);
        this.tf_stock.setText(Stock);
      
    }//GEN-LAST:event_btnagregarActionPerformed

    public void limpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) jtb_datos.getModel();
        tb.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kardex().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_datos;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pvp;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}
