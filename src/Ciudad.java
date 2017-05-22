
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    protected String nombre;
    protected int numeroEstaciones;
    protected ArrayList<EstacionMet> estaciones;

    public Ciudad(String nombre, int numeroEstaciones) {
        this.nombre = nombre;
        this.numeroEstaciones = numeroEstaciones;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void addEstacion(EstacionMet estacion){
        if(this.estaciones.size()<=this.numeroEstaciones-1){
            this.estaciones.add(estacion);
        }else{
            System.out.println("No puede tener más estaciones");
        }
    }

    public int getNumeroEstaciones() {
        return numeroEstaciones;
    }
    
}
