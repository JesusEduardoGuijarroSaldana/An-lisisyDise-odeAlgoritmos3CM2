/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenamiento;

/**
 *
 * @author guija
 */
public class CInsertionSort {

    /*variables que serán utilizadas para generar una estimación de lo que tarda
    en el momento de ordenar */
    long t_total;
    long t_inicial; 
    long t_final;

    public void ordenarInsertionSort(int arreglo[]){
    //codificación del método de ordenamiento Insertion Sort
        for(int i=1; i<arreglo.length; i++){
            int j=i;
            while((j>0) && (arreglo[j-1] > arreglo[j])){
            int aux = arreglo[j];
            arreglo[j] = arreglo[j-1];
            arreglo[j-1] = aux;
            j--;
            }
        }
    }
}
