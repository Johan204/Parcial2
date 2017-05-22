/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class EstacionMet {

    protected String nombreEstacion;
    protected String ubicacion;
    protected String fechaInstalacion;
    protected Sensores sensores;

    public EstacionMet(String nombreEstacion, String ubicacion, String fechaInstalacion) {
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.fechaInstalacion = fechaInstalacion;
    }

    public EstacionMet(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }
    

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public String getUbicacion() {
        return ubicacion;

    }

    public void getInfoSensorAgua() {
        this.sensores = new SensorAgua();
        ((SensorAgua) sensores).getCantidadAgua();
    }

    public void getInfoSensorTemperatura() {
        this.sensores = new SensorTemperatura();
        ((SensorTemperatura) this.sensores).getTemperatura();
    }
    
    public void getInfoSensorElectrico(){
        this.sensores = new SensorElectrico();
        System.out.println(((SensorElectrico) this.sensores).defNivelCarga());
        
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

}
