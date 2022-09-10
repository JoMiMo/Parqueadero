/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */
public class DAOTipoVehiculo {
    
     ConexionBD con = new ConexionBD();
     Connection conexion = null;
     
     
     public boolean insertarTipoVehiculo(String tipoVehiculo, int valorHora){
         
         conexion = ConexionBD.conectar();
         try {
             CallableStatement procedimiento = conexion.prepareCall("CALL SP_insertarTipoVehiculo(?,?)");
             procedimiento.setString(1, tipoVehiculo);
             procedimiento.setInt(2, valorHora);
             
             procedimiento.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Tipo de Vehiculo Registrado Exitosamente");
         } catch (SQLException ex) {
             Logger.getLogger(DAOTipoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         
         return true;
     }
     
      public boolean modificarTipoVehiculo(int id, String tipoVehiculo, int valorHora){
         
         conexion = ConexionBD.conectar();
         try {
             CallableStatement procedimiento = conexion.prepareCall("CALL SP_modificarTipoVehiculo(?,?,?)");
             procedimiento.setInt(1,id);
             procedimiento.setString(2, tipoVehiculo);
             procedimiento.setInt(3, valorHora);
             
             procedimiento.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Tipo de Vehiculo Modificado Exitosamente");
         } catch (SQLException ex) {
             Logger.getLogger(DAOTipoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         
         return true;
     }
     
      public boolean eliminarTipoVehiculo(int id){
         
         conexion = ConexionBD.conectar();
         try {
             CallableStatement procedimiento = conexion.prepareCall("CALL SP_EliminarTipoVehiculo(?)");
             procedimiento.setInt(1,id);
             
             procedimiento.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Tipo de Vehiculo Eliminado Exitosamente");
         } catch (SQLException ex) {
             Logger.getLogger(DAOTipoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         
         return true;
     }
     
     public boolean verTipoVehiculo(JTable visor){
         
         try {
            conexion = ConexionBD.conectar();
            Statement st;
            st= conexion.createStatement();
            ResultSet rs = st.executeQuery("CALL SP_vertipoVehiculo()");
            //CallableStatement procedimiento = conexion.prepareCall("CALL SP_vertipoVehiculo()");

             DefaultTableModel model = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas==3) {
                        return true;
                    }else{
                        return false;
                    }
                    
                }
                 
             };
             model.addColumn("id");
             model.addColumn("Tipo Vehiculo");
             model.addColumn("Precio Hora $");
             
             
             
             visor.setModel(model);
             String [] dato = new String[5];
             
             while(rs.next()){
                 dato[0]=rs.getString(1);
                 dato[1]=rs.getString(2);
                 dato[2]=rs.getString(3);
                 model.addRow(dato);
             }
            conexion.close();
         } catch (SQLException e) {
             
             
         }
         
         return true;
     }
     
     
     
    
     
}
