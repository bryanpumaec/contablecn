package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {
    
    public MenuPrincipal() {
        initComponents();
        ImageIcon imagen2 = new ImageIcon("src\\fondos\\fondo3.jpg");
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(lblfondoA.getWidth(), lblfondoA.getHeight(), Image.SCALE_DEFAULT));
        lblfondoA.setIcon(icono);
        this.repaint();
        ImageIcon imagen1 = new ImageIcon("src\\iconos\\encabezado.png");
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblcn.getWidth(), lblcn.getHeight(), Image.SCALE_DEFAULT));
        lblcn.setIcon(icono1);
        this.repaint();
        setTitle("Centro Naturista Cuidado Natural");
        transparenciaButton();
        setSize(780, 570);

        this.setLocationRelativeTo(null);
    }

    public void transparenciaButton() {

        btp.setOpaque(false);
        btp.setContentAreaFilled(false);
        btp.setBorderPainted(false);
        btc.setOpaque(false);
        btc.setContentAreaFilled(false);
        btc.setBorderPainted(false);
        btk.setOpaque(false);
        btk.setContentAreaFilled(false);
        btk.setBorderPainted(false);
        bta.setOpaque(false);
        bta.setContentAreaFilled(false);
        bta.setBorderPainted(false);
        bte.setOpaque(false);
        bte.setContentAreaFilled(false);
        bte.setBorderPainted(false);
        btv.setOpaque(false);
        btv.setContentAreaFilled(false);
        btv.setBorderPainted(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btp = new javax.swing.JButton();
        btc = new javax.swing.JButton();
        btk = new javax.swing.JButton();
        bta = new javax.swing.JButton();
        btv = new javax.swing.JButton();
        lblcn = new javax.swing.JLabel();
        bte = new javax.swing.JButton();
        lblfondoA = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productos.png"))); // NOI18N
        btp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpActionPerformed(evt);
            }
        });
        getContentPane().add(btp);
        btp.setBounds(40, 290, 193, 50);

        btc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clientes.png"))); // NOI18N
        btc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcActionPerformed(evt);
            }
        });
        getContentPane().add(btc);
        btc.setBounds(320, 290, 170, 60);

        btk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/kardex.png"))); // NOI18N
        btk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkActionPerformed(evt);
            }
        });
        getContentPane().add(btk);
        btk.setBounds(580, 290, 160, 60);

        bta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/adquisiciones.png"))); // NOI18N
        bta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaActionPerformed(evt);
            }
        });
        getContentPane().add(bta);
        bta.setBounds(290, 390, 230, 80);

        btv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.png"))); // NOI18N
        btv.setToolTipText("");
        btv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvActionPerformed(evt);
            }
        });
        getContentPane().add(btv);
        btv.setBounds(580, 400, 150, 60);

        lblcn.setFont(new java.awt.Font("Comic Sans MS", 0, 70)); // NOI18N
        lblcn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cuidadonatural.png"))); // NOI18N
        getContentPane().add(lblcn);
        lblcn.setBounds(50, 10, 670, 290);

        bte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/empleados.png"))); // NOI18N
        bte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteActionPerformed(evt);
            }
        });
        getContentPane().add(bte);
        bte.setBounds(30, 400, 200, 70);

        lblfondoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/fondo3.jpg"))); // NOI18N
        getContentPane().add(lblfondoA);
        lblfondoA.setBounds(0, 0, 790, 530);

        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Viner Hand ITC", 0, 21)); // NOI18N

        jMenu1.setText("MODULOS");

        jMenuItem1.setText("PRODUCTOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("CLIENTES");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("KARDEX");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("EMPLEADOS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("VENTAS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("ADQUISICIONES");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("PROVEEDORES");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

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

        jMenu4.setText("CONTACTOS ");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("REPORTES");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NuevoProducto e = new NuevoProducto();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Venta e = new Venta();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpActionPerformed
        NuevoProducto e = new NuevoProducto();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_btpActionPerformed

    private void btkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkActionPerformed
        Kardex e = new Kardex();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_btkActionPerformed

    private void bteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteActionPerformed
        RegEmpleados e = new RegEmpleados();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_bteActionPerformed

    private void btaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaActionPerformed
        AdquisicionBox e = new AdquisicionBox();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_btaActionPerformed

    private void btvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvActionPerformed
        Venta e = new Venta();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_btvActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        RegClientes e = new RegClientes();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Kardex e = new Kardex();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RegEmpleados e = new RegEmpleados();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Adquisicion e = new Adquisicion();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Contactos e = new Contactos();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Reportes e = new Reportes();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed

        RegClientes e = new RegClientes();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_btcActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        RegProveedores e = new RegProveedores();
        e.setVisible(true);
        MenuPrincipal.this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseReleased

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
Categorias e=new Categorias();
e.setVisible(true);
MenuPrincipal.this.dispose();
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bta;
    private javax.swing.JButton btc;
    private javax.swing.JButton bte;
    private javax.swing.JButton btk;
    private javax.swing.JButton btp;
    private javax.swing.JButton btv;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel lblcn;
    private javax.swing.JLabel lblfondoA;
    // End of variables declaration//GEN-END:variables

}
