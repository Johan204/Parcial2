
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Estudiante
 */
public class Leer {

    private String nombre;
    private int numeroEstacions;

    private int numeroDatos;

    private ArrayList<String> fechaTomaDatos = new ArrayList<>();
    private ArrayList<Integer> temperatura = new ArrayList<>();
    private ArrayList<Integer> cantidadAgua = new ArrayList<>();
    private ArrayList<Integer> nivelElectrico = new ArrayList<>();
    private ArrayList<SensorAgua> datosAgua = new ArrayList<>();
    private ArrayList<SensorTemperatura> datosTemp = new ArrayList<>();
    private ArrayList<SensorElectrico> datosElect = new ArrayList<>();

    public void leer() throws FileNotFoundException {
        Scanner input = new Scanner(new File("datos.txt"));
        while (input.hasNext()) {
            nombre = input.next();

            numeroEstacions = input.nextInt();
            int[] nombreEstaciones = new int[numeroEstacions];
            Ciudad ciudad1 = new Ciudad(nombre, numeroEstacions);
            for (int i = 0; i < numeroEstacions; i++) {
                nombreEstaciones[i] = input.nextInt();
                numeroDatos = input.nextInt();

                for (int j = 0; j < numeroDatos; j++) {
                    fechaTomaDatos.add(input.next());
                    temperatura.add(input.nextInt());
                    cantidadAgua.add(input.nextInt());
                    nivelElectrico.add(input.nextInt());

                }
            }
            for (int i = 0; i < 3; i++) {
                datosAgua.add(new SensorAgua(cantidadAgua.get(i)));
                datosTemp.add(new SensorTemperatura(temperatura.get(i)));
                datosElect.add(new SensorElectrico(nivelElectrico.get(i)));
            }
        }

    }

    public void calcularPromedio() {
        int numero = 0;
        for (int i = 0; i < datosAgua.size(); i++) {
            numero += datosAgua.get(i).getCantidadAgua() + datosTemp.get(i).getTemperatura() + datosElect.get(i).getNivelCarga();
        }
        numero = numero / (3 * datosAgua.size());
        System.out.println("El promedio de todos los datos medidos es de " + numero);
    }
}
