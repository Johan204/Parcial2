/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public abstract class Sensores {
    protected String marca;
    protected String referencia;
    protected String fechaTomaMedida;

    public Sensores() {
    }
    
    
    public Sensores(String marca, String referencia, String fechaTomaMedida) {
        this.marca = marca;
        this.referencia = referencia;
        this.fechaTomaMedida = fechaTomaMedida;
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getFechaInstalacionSensor() {
        return fechaTomaMedida;
    }

    public void setFechaTomaMedida(String fechaTomaMedida) {
        this.fechaTomaMedida = fechaTomaMedida;
    }
    
    
}
