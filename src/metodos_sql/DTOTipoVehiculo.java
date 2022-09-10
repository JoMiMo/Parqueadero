/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

/**
 *
 * @author jose
 */
public class DTOTipoVehiculo {

    private String id_tipoVehiculo = "";
    private String tipoVehiculo = "";
    private int precioHora = 0;
    
    
    public String getId_tipoVehiculo() {
        return id_tipoVehiculo;
    }

    public void setId_tipoVehiculo(String id_tipoVehiculo) {
        this.id_tipoVehiculo = id_tipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }
    
 
    
    
    
}
