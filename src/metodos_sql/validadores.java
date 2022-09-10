/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import javax.swing.JOptionPane;
import javax.swing.JTable;


public class validadores {
   
    //Aca Vamos a Crear los codigos para validar los campos 
    //donde se pueda solo colocar numeros etc..
    
  
    /*private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(), 
                        lbl.getHeight(), 
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }*/
    
    public int fila = 0;
    public String codigo = "";
    public String tipoVehiculo = "";
    public String precioHora = "";
    
    public int modificarCampoTabla(JTable tbl){
        
        fila = tbl.getSelectedRow();
        
        if(fila>=0){
            codigo = tbl.getValueAt(fila, 0).toString();
            tipoVehiculo = tbl.getValueAt(fila, 1).toString();
            precioHora = tbl.getValueAt(fila, 1).toString();
            
            
        }else{
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila");
        }
        
        return fila;
        
    }
    
    
    
}
