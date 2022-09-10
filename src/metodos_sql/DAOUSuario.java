/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.*;

/**
 *
 * @author jose
 */
public class DAOUSuario {
    
    ConexionBD con = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public boolean switchMetodos = true;
    public String busquedaNombre = null;
    
    public boolean  BuscarNombre(DTOUSuario Usuario1) throws SQLException{
        
        Connection conexion = null;
        
        try {
            conexion = ConexionBD.conectar();
            String sentenciaBuscar = ("SELECT * FROM tbl_usuarios WHERE id_usuario = '" + Usuario1.getId() + "' and password ='" + Usuario1.getPassword()+ "'");
            sentencia_preparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next()){
                
                String id_UsuarioC = resultado.getNString("id_usuario");
                String nombreC = resultado.getNString("nombre");
                String apellidoC = resultado.getNString("apellido");
                String correoC = resultado.getNString("correo");
                String passC = resultado.getNString("password");
                
                busquedaNombre ="Usuario Encontrado";
                switchMetodos = true;
                
            }else{
                System.out.println("Datos incorrectos, Favor verificar");
                busquedaNombre ="Usuario No Encontrado";
                switchMetodos = false;
            }
            
            
        } catch (Exception e) {
            System.out.println("Error en el metodo busqueda_Nombre" + e);
            switchMetodos = false;
        }
        
        
       conexion.close();
        return switchMetodos;
    }
    
    
    
}
