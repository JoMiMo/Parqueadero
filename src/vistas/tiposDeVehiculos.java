
package vistas;

import java.awt.Event;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos_sql.DAOTipoVehiculo;
import metodos_sql.validadores;

/**
 *
 * @author jose
 */
public class tiposDeVehiculos extends javax.swing.JFrame {

  
    public tiposDeVehiculos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        daotipovehiculo.verTipoVehiculo(tbl_tipoVehiculo);
        
        
        if(txt_id.getText().equals("")){
            
        }else{
            btn_modificar.setEnabled(true);
            btn_eliminar.setEnabled(true);
            btn_insertar.setEnabled(false);
        }
  
    }
    DAOTipoVehiculo daotipovehiculo = new DAOTipoVehiculo();
    
    private boolean limpiarcampos(){
        
        txt_PrecioHora.setText("");
        txt_tipoVehiculo.setText("");
        txt_id.setText("");
        
        return true;
    }
    
    
        public boolean caracter;
        public boolean mayus;
        public boolean minus;
        public boolean espacio;

        validadores validador = new validadores();
    
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Panel_Datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_insertar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        txt_tipoVehiculo = new javax.swing.JTextField();
        txt_PrecioHora = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Panel_tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tipoVehiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tipos de Vehiculos");

        Panel_Datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Tipo Vehiculo:");

        jLabel3.setText("Precio Hora:");

        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.setEnabled(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        txt_tipoVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tipoVehiculoKeyTyped(evt);
            }
        });

        txt_PrecioHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioHoraKeyTyped(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setEnabled(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel4.setText("id:");

        javax.swing.GroupLayout Panel_DatosLayout = new javax.swing.GroupLayout(Panel_Datos);
        Panel_Datos.setLayout(Panel_DatosLayout);
        Panel_DatosLayout.setHorizontalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addComponent(btn_insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_modificar))
                    .addGroup(Panel_DatosLayout.createSequentialGroup()
                        .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tipoVehiculo)
                                .addComponent(txt_PrecioHora, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel_DatosLayout.setVerticalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_PrecioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar))
                .addGap(27, 27, 27))
        );

        Panel_tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbl_tipoVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo Vehiculo", "Precio hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_tipoVehiculo.setEditingColumn(0);
        tbl_tipoVehiculo.setEditingRow(0);
        tbl_tipoVehiculo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_tipoVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tipoVehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tipoVehiculo);
        if (tbl_tipoVehiculo.getColumnModel().getColumnCount() > 0) {
            tbl_tipoVehiculo.getColumnModel().getColumn(0).setResizable(false);
            tbl_tipoVehiculo.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_tipoVehiculo.getColumnModel().getColumn(1).setResizable(false);
            tbl_tipoVehiculo.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_tipoVehiculo.getColumnModel().getColumn(2).setResizable(false);
            tbl_tipoVehiculo.getColumnModel().getColumn(2).setPreferredWidth(120);
        }

        javax.swing.GroupLayout Panel_tablaLayout = new javax.swing.GroupLayout(Panel_tabla);
        Panel_tabla.setLayout(Panel_tablaLayout);
        Panel_tablaLayout.setHorizontalGroup(
            Panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_tablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_tablaLayout.setVerticalGroup(
            Panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_tablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        // TODO add your handling code here:
        
        if(txt_tipoVehiculo.getText().trim().equals("") || txt_PrecioHora.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(null, "Por favor Llenar todos los campos, Gracias ;')'");
        }else{
        daotipovehiculo.insertarTipoVehiculo(txt_tipoVehiculo.getText().trim(), Integer.valueOf(txt_PrecioHora.getText().trim()));
        limpiarcampos();
        daotipovehiculo.verTipoVehiculo(tbl_tipoVehiculo);
        }
        
        
        
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void txt_tipoVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tipoVehiculoKeyTyped
        // TODO add your handling code here:
         int n= evt.getKeyChar();
        
         minus = n >= 65 && n <= 90;
         mayus = n >= 97 && n <= 122;
         espacio = n == 32;
        
        if (!(minus || mayus || espacio)){
            evt.consume();
        }

    }//GEN-LAST:event_txt_tipoVehiculoKeyTyped

    private void txt_PrecioHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrecioHoraKeyTyped
        // TODO add your handling code here:
        int n= evt.getKeyChar();
        caracter = n >= 48 && n <= 57 ;
        
        if (!caracter){
            evt.consume();
        }
    }//GEN-LAST:event_txt_PrecioHoraKeyTyped

    private void tbl_tipoVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tipoVehiculoMouseClicked
        // TODO add your handling code here:
        txt_tipoVehiculo.setText((tbl_tipoVehiculo.getValueAt(validador.modificarCampoTabla(tbl_tipoVehiculo), 1).toString()));
        txt_PrecioHora.setText((tbl_tipoVehiculo.getValueAt(validador.modificarCampoTabla(tbl_tipoVehiculo), 2).toString()));
        txt_id.setText((tbl_tipoVehiculo.getValueAt(validador.modificarCampoTabla(tbl_tipoVehiculo), 0).toString()));
        
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_insertar.setEnabled(false);
        
    }//GEN-LAST:event_tbl_tipoVehiculoMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        
        if(txt_tipoVehiculo.getText().trim().equals("") || txt_PrecioHora.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(null, "Por favor Llenar todos los campos Para poder modificarlos, Gracias ;')'");
            limpiarcampos();
        }else{
            daotipovehiculo.modificarTipoVehiculo(Integer.valueOf(txt_id.getText().trim()),txt_tipoVehiculo.getText().trim(), Integer.valueOf(txt_PrecioHora.getText().trim()));
            limpiarcampos();
            daotipovehiculo.verTipoVehiculo(tbl_tipoVehiculo);
        }
        
        
        
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_insertar.setEnabled(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        
        daotipovehiculo.eliminarTipoVehiculo(Integer.valueOf(txt_id.getText().trim()));
        limpiarcampos();
        daotipovehiculo.verTipoVehiculo(tbl_tipoVehiculo);
        
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_insertar.setEnabled(true);
    }//GEN-LAST:event_btn_eliminarActionPerformed

 
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
            java.util.logging.Logger.getLogger(tiposDeVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiposDeVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiposDeVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiposDeVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiposDeVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JPanel Panel_tabla;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tipoVehiculo;
    private javax.swing.JTextField txt_PrecioHora;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_tipoVehiculo;
    // End of variables declaration//GEN-END:variables
}
