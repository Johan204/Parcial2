/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class SensorElectrico extends Sensores {
    protected int nivelCarga;

    public SensorElectrico(int nivelCarga, String marca, String referencia, String fechaTomaMedida) {
        super(marca, referencia, fechaTomaMedida);
        this.nivelCarga = nivelCarga;
    }

    public SensorElectrico() {
    }

    public SensorElectrico(int nivelCarga, String fechaTomaMedida) {
        this.nivelCarga = nivelCarga;
        this.fechaTomaMedida = fechaTomaMedida;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }
    
    public String defNivelCarga(){
        String carga = "";
        switch(this.nivelCarga){
            case 1:
                carga = "1 - Tormenta electrica";
                break;
            case 2:
                carga = "2 - Rayos";
                break;
            case 3:
                carga = "3 - Truenos";
                break;
            case 4:
                carga = "4 - Normal";
                break;
                
        }
        return carga;
    }
    
}
