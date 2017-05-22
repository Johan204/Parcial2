/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class SensorAgua extends Sensores {
    protected int cantidadAgua;

    public SensorAgua(int cantidadAgua, String marca, String referencia, String fechaTomaMedida) {
        super(marca, referencia, fechaTomaMedida);
        this.cantidadAgua = cantidadAgua;
    }

    public SensorAgua(int cantidadAgua, String fechaTomaMedida) {
        this.cantidadAgua = cantidadAgua;
        this.fechaTomaMedida = fechaTomaMedida;
    }
    
    
    
    public SensorAgua() {
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }
    

    
    
    
}
