/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientasOrdenamiento;

/**
 *
 * @author guija
 */

import java.util.ArrayList;
import algoritmosordenamiento.NewInterface;
import org.jfree.data.xy.XYDataItem;

public class Comparador {
    
    private ArrayList<NewInterface> algoritmosordenamiento;
    private int iteraciones;
    private int factorCrecimiento;
    private String[] nombresOrdenamiento = new String[]{"Burbuja","Burbuja Optimizado","InsertionSort"};
    
    public Comparador(ArrayList<NewInterface>algoritmosordenamiento, int iteraciones, int factorCrecimiento){
        this.algoritmosordenamiento = algoritmosordenamiento;
        this.iteraciones = iteraciones;
        this.factorCrecimiento = factorCrecimiento;
    }
    
    public void compararAlgoritmos(){
        Graficacion graficaAlgoritmos = new Graficacion("ejeX","ejeY", "Titulo");
        for (int x=0; x<this.algoritmosordenamiento.size();x++){ 
            graficaAlgoritmos.agrearSerie("Ordenamiento"+x);   //nombresOrdenamiento[x]
        }
        
        for(int i=0; i<this.iteraciones; i++){ // número de pruebas
            int datos[] = herramientasOrdenamiento.numsAleatorios.llenarArregloNumsAleatorios(this.factorCrecimiento*(i+1), 100); // el factor de para subir cada iteración
            for (int algoritmo=0; algoritmo<this.algoritmosordenamiento.size(); algoritmo++){ //recorrido de los algoritmos
                this.algoritmosordenamiento.get(algoritmo).ordenar(datos.clone());// clone para tener los mismos núms en cada arreglo
                double tiempo =  this.algoritmosordenamiento.get(algoritmo).getT_total();
                graficaAlgoritmos.agregarDatoASerie("Ordenamiento"+algoritmo,new XYDataItem(i, tiempo));  
            }
        }
        graficaAlgoritmos.crearYmostrarGrafica();
    }
}
