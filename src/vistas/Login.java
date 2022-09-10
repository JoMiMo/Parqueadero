/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metodos_sql.MetodosCRUD;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import javax.swing.Timer;
import metodos_sql.ConexionBD;
import metodos_sql.DAOUSuario;
import metodos_sql.DTOUSuario;


/**
 *
 * @author jose
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        prb_login.setVisible(false);
        
    }

    MetodosCRUD metodos  =new MetodosCRUD();
    DTOUSuario dtousuario = new DTOUSuario();
    DAOUSuario daousuario = new DAOUSuario();
    
    public int s = 0;
    public String nombreUsuario = "";
    public boolean st = false;
    public String busquedaNombre = null;
    
    private Timer tiempo;
    int cont;
    public final static int TWO_SECOND=5;
    
    
    public void inicioSesion() throws SQLException{
        mostrarBarra();
        
        dtousuario.setId(txt_user.getText());
        dtousuario.setPassword(txtp_pass.getText());
        
        daousuario.BuscarNombre(dtousuario);
        
        
        if(daousuario.BuscarNombre(dtousuario)){
            
            cont = -1;
            prb_login.setValue(0);
            prb_login.setStringPainted(true);
            tiempo = new Timer(TWO_SECOND,new TimerListener());
            st = true;
            activarBarra();
            
        }else{
            cont = -1;
            prb_login.setValue(0);
            prb_login.setStringPainted(true);
            tiempo = new Timer(TWO_SECOND,new TimerListener());
            st = false;
            activarBarra();
            
        }
    }
    
    class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            cont ++;
            prb_login.setValue(cont);
            if(cont == 100){
                tiempo.stop();
                
                if(st){
                    String saberNombre = metodos.saberNombres(txt_user.getText(), txtp_pass.getText());
                    JOptionPane.showMessageDialog(null, "Bienvenid@ " + saberNombre);
                    nombreUsuario = saberNombre;
                    if(saberNombre.equals("Jose Monsal")){
                        Pantalla_Inicio_Admin pantallaInicio = new Pantalla_Inicio_Admin();
                        setVisible(false);
                        pantallaInicio.setVisible(true);
                    }
                    if(saberNombre.equals("Empleado Parqueadero")){
                        Pantalla_Inicio_Em pantallaInicio = new Pantalla_Inicio_Em();
                        setVisible(false);
                        pantallaInicio.setVisible(true);
                    }
                       
                }else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }
                    
            }
        }
        
    }
    
    public void esconderBarra(){
        prb_login.setVisible(false);
    }
    public void mostrarBarra(){
        prb_login.setVisible(true);
    }
    public void activarBarra(){
        tiempo.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txtp_pass = new javax.swing.JPasswordField();
        prb_login = new javax.swing.JProgressBar();
        btn_salirLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel2.setText("User:");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setText("Password:");
        jLabel3.setToolTipText("");

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        prb_login.setEnabled(false);
        prb_login.setStringPainted(true);

        btn_salirLogin.setText("Salir");
        btn_salirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(prb_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ingresar)
                        .addGap(152, 152, 152)
                        .addComponent(btn_salirLogin)
                        .addGap(109, 109, 109))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtp_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txt_user)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salirLogin)
                            .addComponent(btn_ingresar))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtp_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(prb_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(jLabel4)
                .addContainerGap(139, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(168, 168, 168))
        );

        jLabel4.getAccessibleContext().setAccessibleName("lbl_porcentaje");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        try {
            // TODO add your handling code here:
            inicioSesion();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirLoginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_salirLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salirLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar prb_login;
    private javax.swing.JTextField txt_user;
    private javax.swing.JPasswordField txtp_pass;
    // End of variables declaration//GEN-END:variables
}
