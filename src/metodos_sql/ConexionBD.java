/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.*;

public class ConexionBD {
    
    public static String url="jdbc:mysql://localhost/parqueadero";
    public static String usuario = "root";
    public static String pass= "";
    public static String clase = "com.mysql.jdbc.Driver";
     
     
    public static Connection conectar(){
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url,usuario,pass);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar la base de datos" + e);
        }
        
        return conexion;
    }
    
    
    
    
 
    
//    
//    public static Connection conectar(){
//            String url="jdbc:sqlserver://localhost:1433;"
//                    +"database=bd_Parqueadero;"
//                    +"user=;"
//                    +"password=;"
//                    +"logintimeout=30;";
//        try {
//            
//            Connection con = DriverManager.getConnection(url);
//            System.out.println("Conexion Exitosa");
//            return con;
//            
//        } catch (SQLException e) {
//            System.out.println("Erro al conectar a la base de datos" + e);
//            return null;
//        }
//        
//        
//    }
    
}
