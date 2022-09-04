/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import clases.Cls_Productos;
import clases.reportes;

/**
 *
 * @author Dell
 */
public class RegClientes extends javax.swing.JFrame {

    static String Ci;
    static String Nombre;
    static String Apellido;
    static String Direccion;
    static String Mail;
    static String Telf;
    static int cont = 0;
    private final Cls_Productos CP;
    int num = 0;

    /**
     * Creates new form RegClientes
     */
    public RegClientes() {
        initComponents();
        ImageIcon imagen2 = new ImageIcon("src\\interfaz\\fo11.jpg");
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_DEFAULT));
        lblfondo.setIcon(icono);
        this.repaint();
        setSize(982, 746);
        CP = new Cls_Productos();
        BTNGUARDAR.setText("<html><p>Guardar</p><p>Registro</p></html>");
        btnmodificar.setText("<html><p>Modificar</p><p>Registro</p></html>");
        this.setLocationRelativeTo(null);
        CTIDENTIDAD.requestFocus();
        this.setLocationRelativeTo(null);
        CTID.setVisible(false);
        CTID.setEnabled(false);
        btnmodificar.setVisible(false);

    }

    private void guardar() {
        String ced = CTIDENTIDAD.getText();
        String nom = CTNOMBRES.getText();
        String ape = CTAPELLIDOS.getText();
        String dir = CTDIRECCION.getText();
        String tel = CTTELEFONO.getText();
        String mail = CTEMAIL.getText();

        if (num == 0) {
            int respuesta = CP.insertDatosCli(ced, nom, ape, dir, tel, mail);
            if (respuesta > 0) {
                limpiar();
            }
        } else {

        }
    }

    private void limpiar() {
        CTIDENTIDAD.setText("");
        CTNOMBRES.setText("");
        CTAPELLIDOS.setText("");
        CTDIRECCION.setText("");
        CTTELEFONO.setText("");
        CTEMAIL.setText("");
        CTIDENTIDAD.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CTIDENTIDAD = new javax.swing.JTextField();
        CTNOMBRES = new javax.swing.JTextField();
        CTAPELLIDOS = new javax.swing.JTextField();
        CTEMAIL = new javax.swing.JTextField();
        CTDIRECCION = new javax.swing.JTextField();
        BTNGUARDAR = new javax.swing.JButton();
        CTTELEFONO = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        BTNBUSCAR = new javax.swing.JButton();
        CTID = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 50, 160, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CÉDULA DE IDENTIDAD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 170, 167, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 230, 72, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDOS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 290, 81, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DIRECCIÓN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 350, 85, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("E-MAIL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 470, 52, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TELÉFONO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 420, 76, 17);

        CTIDENTIDAD.setAutoscrolls(false);
        CTIDENTIDAD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CTIDENTIDADFocusLost(evt);
            }
        });
        CTIDENTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTIDENTIDADActionPerformed(evt);
            }
        });
        CTIDENTIDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTIDENTIDADKeyTyped(evt);
            }
        });
        getContentPane().add(CTIDENTIDAD);
        CTIDENTIDAD.setBounds(530, 170, 200, 30);

        CTNOMBRES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTNOMBRESKeyTyped(evt);
            }
        });
        getContentPane().add(CTNOMBRES);
        CTNOMBRES.setBounds(530, 230, 200, 30);

        CTAPELLIDOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTAPELLIDOSKeyTyped(evt);
            }
        });
        getContentPane().add(CTAPELLIDOS);
        CTAPELLIDOS.setBounds(530, 290, 200, 30);

        CTEMAIL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CTEMAILFocusLost(evt);
            }
        });
        CTEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTEMAILActionPerformed(evt);
            }
        });
        getContentPane().add(CTEMAIL);
        CTEMAIL.setBounds(530, 410, 200, 30);
        getContentPane().add(CTDIRECCION);
        CTDIRECCION.setBounds(530, 350, 200, 30);

        BTNGUARDAR.setBackground(new java.awt.Color(0, 0, 0));
        BTNGUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNGUARDAR.setForeground(new java.awt.Color(255, 102, 102));
        BTNGUARDAR.setText("guardar");
        BTNGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNGUARDAR);
        BTNGUARDAR.setBounds(800, 330, 90, 60);

        CTTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTTELEFONOActionPerformed(evt);
            }
        });
        CTTELEFONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CTTELEFONOKeyTyped(evt);
            }
        });
        getContentPane().add(CTTELEFONO);
        CTTELEFONO.setBounds(530, 470, 200, 30);

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresar.png"))); // NOI18N
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar);
        btnregresar.setBounds(150, 530, 130, 80);

        BTNBUSCAR.setBackground(new java.awt.Color(0, 0, 0));
        BTNBUSCAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNBUSCAR.setForeground(new java.awt.Color(51, 255, 51));
        BTNBUSCAR.setText("BUSCAR");
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNBUSCAR);
        BTNBUSCAR.setBounds(800, 160, 90, 60);
        getContentPane().add(CTID);
        CTID.setBounds(530, 120, 120, 20);

        btnmodificar.setBackground(new java.awt.Color(0, 0, 0));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 0));
        btnmodificar.setText("modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar);
        btnmodificar.setBounds(800, 410, 90, 50);

        btnagregar.setBackground(new java.awt.Color(0, 0, 0));
        btnagregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(51, 255, 51));
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar);
        btnagregar.setBounds(800, 240, 90, 50);

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/fondo5.jpg"))); // NOI18N
        getContentPane().add(lblfondo);
        lblfondo.setBounds(0, 0, 980, 730);

        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Viner Hand ITC", 0, 21)); // NOI18N

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

    private void BTNGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGUARDARActionPerformed
        btnmodificar.setVisible(true);
        guardar();
    }//GEN-LAST:event_BTNGUARDARActionPerformed

    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        BuscarclientesR buscacli = new BuscarclientesR();
        buscacli.show();
    }//GEN-LAST:event_BTNBUSCARActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        this.CTNOMBRES.setText(this.Nombre);
        this.CTIDENTIDAD.setText(Ci);
        this.CTAPELLIDOS.setText(Apellido);
        this.CTDIRECCION.setText(Direccion);
        this.CTEMAIL.setText(Mail);
        this.CTTELEFONO.setText(Telf);
        btnmodificar.setVisible(true);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        String ced = CTIDENTIDAD.getText();
        String nom = CTNOMBRES.getText();
        String ape = CTAPELLIDOS.getText();
        String dir = CTDIRECCION.getText();
        String tel = CTTELEFONO.getText();
        String mail = CTEMAIL.getText();

        if (num == 0) {

            int respuesta = CP.actualizarC(ced, nom, ape, dir, tel, mail);
            if (respuesta > 0) {

                limpiar();
                num = 0;
            }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        MenuPrincipal e = new MenuPrincipal();
        e.setVisible(true);
        RegClientes.this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void CTIDENTIDADKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTIDENTIDADKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_CTIDENTIDADKeyTyped

    private void CTNOMBRESKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTNOMBRESKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }

        if (Character.isLowerCase(validar)) {
            String cad = ("" + validar).toUpperCase();
            validar = cad.charAt(0);
            evt.setKeyChar(validar);
        }
        if ((validar < 'a' || validar > 'z') && (validar < 'A') | validar > 'Z' && (validar != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_CTNOMBRESKeyTyped

    private void CTAPELLIDOSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTAPELLIDOSKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }

        if (Character.isLowerCase(validar)) {
            String cad = ("" + validar).toUpperCase();
            validar = cad.charAt(0);
            evt.setKeyChar(validar);
        }
        if ((validar < 'a' || validar > 'z') && (validar < 'A') | validar > 'Z' && (validar != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_CTAPELLIDOSKeyTyped

    private void CTTELEFONOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTTELEFONOKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_CTTELEFONOKeyTyped

    private void CTIDENTIDADFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CTIDENTIDADFocusLost
        int tam = CTIDENTIDAD.getText().length();
        int pos = 0;
        int dig = 0;
        String ced = CTIDENTIDAD.getText();
        int acum = 0;
        if (tam == 10) {
            while (pos < tam) {
                dig = Integer.parseInt(ced.substring(pos, pos + 1));
                if ((pos + 1) % 2 != 0) {
                    dig = dig * 2;
                    if (dig > 9) {
                        dig = dig - 9;
                    }
                    acum = acum + dig;
                } else {
                    acum = acum + dig;
                }
                pos++;
            }
            if (acum % 10 == 0) {
                JOptionPane.showMessageDialog(null, "Cédula Válida", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                //btok.setIcon(new ImageIcon("\\imgs\\ok.jpeg"));
                CTNOMBRES.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Cédula Ecuatoriana no Válida", "Advertencia", JOptionPane.ERROR_MESSAGE);
                //btok.setIcon(new ImageIcon("\\imgs\\nok.jpeg"));
                CTIDENTIDAD.requestFocus();
                CTIDENTIDAD.selectAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cédula Ecuatoriana no Válida", "Advertencia", JOptionPane.ERROR_MESSAGE);
            //btok.setIcon(new ImageIcon("src\\apptienda\\img\\iconoerror.png"));

            CTIDENTIDAD.selectAll();
        }


    }//GEN-LAST:event_CTIDENTIDADFocusLost

    private void CTEMAILFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CTEMAILFocusLost
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = CTEMAIL.getText();

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {

            JOptionPane.showMessageDialog(null, "Email intriducido válido", "Excelente", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Email introducido inválido", "Error", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_CTEMAILFocusLost

    private void CTTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTTELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTTELEFONOActionPerformed

    private void CTIDENTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTIDENTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTIDENTIDADActionPerformed

    private void CTEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTEMAILActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        reportes conn = new reportes();
        Connection con = reportes.getConexion();

        JasperReport reporte = null;
        String path = "src\\reportes\\reportecliente.jasper";

        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            JasperPrint jprint = JasperFillManager.fillReport(path, null, con);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_jMenu1MouseClicked
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
            java.util.logging.Logger.getLogger(RegClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton BTNGUARDAR;
    private javax.swing.JTextField CTAPELLIDOS;
    private javax.swing.JTextField CTDIRECCION;
    private javax.swing.JTextField CTEMAIL;
    private javax.swing.JTextField CTID;
    private javax.swing.JTextField CTIDENTIDAD;
    private javax.swing.JTextField CTNOMBRES;
    private javax.swing.JTextField CTTELEFONO;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}