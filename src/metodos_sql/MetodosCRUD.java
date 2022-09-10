/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MetodosCRUD {
    
    
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    
    public int entradaVehiculo(String Placa, String horaIngreso, String tipoVehiculo ){
        resultado_numero = 0;
        Connection conexion = null;
        
        
        
        return resultado_numero;
    }
    
    
    
    public static String BuscarNombre(String id_usuario, String password){
        String busquedaNombre = null;
        Connection conexion = null;
        
        try {
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = ("SELECT * FROM tbl_usuarios WHERE id_usuario = '" + id_usuario + "' and password ='" + password + "'");
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next()){
                
                String id_UsuarioC = resultado.getNString("id_usuario");
                String nombreC = resultado.getNString("nombre");
                String apellidoC = resultado.getNString("apellido");
                String correoC = resultado.getNString("correo");
                String passC = resultado.getNString("password");
                
                busquedaNombre ="Usuario Encontrado";
            }else{
                System.out.println("Datos incorrectos, Favor verificar");
                busquedaNombre ="Usuario No Encontrado";
            }
            
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el metodo busqueda_Nombre" + e);
        }
        
        return busquedaNombre;
    }
    
    
    public static String saberNombres(String id_usuario, String password){
        String SaberNombre = null;
        Connection conexion = null;
        
         try {
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = ("SELECT nombre,apellido FROM tbl_usuarios WHERE id_usuario = '" + id_usuario + "' and password ='" + password + "'");
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next()){
               
                String nombreC = resultado.getNString("nombre");
                String apellidoC = resultado.getNString("apellido");

                
                SaberNombre =nombreC + " " + apellidoC;
            }else{
                System.out.println();
            }
            
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el metodo saberNombres" + e);
        }
        
        
        return SaberNombre;
    }
    
}
