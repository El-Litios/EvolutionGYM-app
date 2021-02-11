/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.DesktopManager;
import javax.swing.JInternalFrame;

/**
 *
 * @author Mark-
 */
public class Principal extends javax.swing.JFrame {

    public static void centrar(JInternalFrame frm) {
        Dimension contenedor=PanelDesktop.getSize();
        Dimension hijo=frm.getSize();
        frm.setLocation((contenedor.width-hijo.width)/2,(contenedor.height-hijo.height)/2);//width es ancho(X) y height es largo(Y).
        frm.show();
    }
    
    public Principal() {
        initComponents();
        this.setExtendedState(6);
        btnClientes.setVisible(false);
        btnTrabajadores.setVisible(false);
        btnInventario.setVisible(false);
        btnMembresia.setVisible(false);

        btn_CerrarSesion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        JPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_InicioSesion = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        btn_CerrarSesion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnClientes = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnTrabajadores = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnMembresia = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnInventario = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        N_user = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jSeparator33 = new javax.swing.JToolBar.Separator();
        PanelDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        JPanel1.setBackground(new java.awt.Color(204, 204, 204));
        JPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setBackground(new java.awt.Color(178, 215, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator3);

        btn_InicioSesion.setBackground(Color.DARK_GRAY);
        btn_InicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_InicioSesion.setText("Iniciar Sesion");
        btn_InicioSesion.setToolTipText("");
        btn_InicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_InicioSesion.setFocusable(false);
        btn_InicioSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_InicioSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_InicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InicioSesionMouseExited(evt);
            }
        });
        btn_InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicioSesionActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_InicioSesion);
        jToolBar1.add(jSeparator15);
        jToolBar1.add(jSeparator17);

        btn_CerrarSesion.setBackground(Color.DARK_GRAY);
        btn_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_CerrarSesion.setText("Cerrar Sesion");
        btn_CerrarSesion.setFocusable(false);
        btn_CerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_CerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CerrarSesionMouseExited(evt);
            }
        });
        btn_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarSesionActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_CerrarSesion);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator5);

        btnClientes.setText("Clientes");
        btnClientes.setFocusable(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClientes);
        jToolBar1.add(jSeparator7);

        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setFocusable(false);
        btnTrabajadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrabajadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTrabajadores);
        jToolBar1.add(jSeparator8);

        btnMembresia.setText("Membresia");
        btnMembresia.setFocusable(false);
        btnMembresia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMembresia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMembresia);
        jToolBar1.add(jSeparator9);

        btnInventario.setText("Inventario");
        btnInventario.setFocusable(false);
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInventario);

        JPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jToolBar2.setFloatable(false);

        N_user.setForeground(new java.awt.Color(0, 0, 0));
        jToolBar2.add(N_user);
        jToolBar2.add(jSeparator2);
        jToolBar2.add(jSeparator12);
        jToolBar2.add(jSeparator13);
        jToolBar2.add(jSeparator33);

        JPanel1.add(jToolBar2, java.awt.BorderLayout.PAGE_END);

        PanelDesktop.setBackground(new java.awt.Color(153, 153, 153));
        JPanel1.add(PanelDesktop, java.awt.BorderLayout.CENTER);

        getContentPane().add(JPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicioSesionActionPerformed

        Login Formulario=new Login();
        if (verificar(Formulario)) {
            PanelDesktop.add(Formulario);
            btn_InicioSesion.setEnabled(false);
            btn_CerrarSesion.setEnabled(true);
        centrar(Formulario);
        }else
            Formulario.dispose();
    }//GEN-LAST:event_btn_InicioSesionActionPerformed

    private void btn_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarSesionActionPerformed
        btn_InicioSesion.setEnabled(true);
        btn_CerrarSesion.setEnabled(false);
        N_user.setText("");
        
        
                
        try{
            JInternalFrame frames[]=PanelDesktop.getAllFrames();
            DesktopManager DeskMan=PanelDesktop.getDesktopManager();
            for(JInternalFrame frame:frames){
                DeskMan.closeFrame(frame);
                frame.setClosed(false);
                btn_InicioSesion.setEnabled(true);//activa el boton de inicar sesion
                btn_CerrarSesion.setEnabled(false);
                
            }
            btn_InicioSesion.doClick();
        }catch(Exception err){
        }       
        N_user.setText("");
    }//GEN-LAST:event_btn_CerrarSesionActionPerformed

    //Botones de Inicio de Sesion
    private void btn_InicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioSesionMouseEntered
        btn_InicioSesion.setBackground(new Color(76,175,80));
        btn_InicioSesion.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_InicioSesionMouseEntered

    private void btn_InicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioSesionMouseExited
        btn_InicioSesion.setBackground(Color.DARK_GRAY);
        btn_InicioSesion.setForeground(Color.WHITE);

    }//GEN-LAST:event_btn_InicioSesionMouseExited

    //Botones de Cierre de Sesion
    private void btn_CerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarSesionMouseEntered
        btn_CerrarSesion.setBackground(new Color(255,121,97));
        btn_CerrarSesion.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_CerrarSesionMouseEntered

    private void btn_CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarSesionMouseExited
        btn_CerrarSesion.setBackground(Color.DARK_GRAY);
        btn_CerrarSesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_CerrarSesionMouseExited

    //Abrir formularios
    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
        FRM_Membership frmm=new FRM_Membership();
        if (verificar(frmm)) {
            PanelDesktop.add(frmm);
        centrar(frmm);
        }else
            frmm.dispose();
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        FRM_Client frmc=new FRM_Client();
        if (verificar(frmc)) {
            PanelDesktop.add(frmc);
        centrar(frmc);
        }else
            frmc.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        FRM_Workers frw=new FRM_Workers();
        if (verificar(frw)) {
            PanelDesktop.add(frw);
        centrar(frw);
        }else
            frw.dispose();
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    
    public boolean verificar (JInternalFrame login ){
        boolean estado=true;
        for (int i = 0; i < PanelDesktop.getComponentCount(); i++) {
            if(login.getClass().isInstance(PanelDesktop.getComponent(i))){
                estado=false;
            }
        }
        return !login.isShowing()&& estado;
    }
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel JPanel1;
    public static javax.swing.JLabel N_user;
    public static javax.swing.JDesktopPane PanelDesktop;
    public static javax.swing.JButton btnClientes;
    public static javax.swing.JButton btnInventario;
    public static javax.swing.JButton btnMembresia;
    public static javax.swing.JButton btnTrabajadores;
    private javax.swing.JButton btn_CerrarSesion;
    private javax.swing.JButton btn_InicioSesion;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator33;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}