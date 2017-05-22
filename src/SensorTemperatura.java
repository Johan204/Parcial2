/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class SensorTemperatura extends Sensores{
    protected int temperatura;

    public SensorTemperatura(int temperatura, String marca, String referencia, String fechaTomaMedida) {
        super(marca, referencia, fechaTomaMedida);
        this.temperatura = temperatura;
    }

    public SensorTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
    public SensorTemperatura() {
    }

    public int getTemperatura() {
        return temperatura;
    }
    
}
