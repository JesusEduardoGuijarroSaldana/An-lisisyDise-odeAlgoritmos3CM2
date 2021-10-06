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
public class BBurbujaOptimizado {
    
    /*variables que serán utilizadas para generar una estimación de lo que tarda
    en el momento de ordenar */
    long t_total;
    long t_inicial; 
    long t_final;
    
    public void ordenarBurbujaOptimizado(int arreglo[]){
        //codificación del método de ordenamiento burbuja optimizado
        for(int i=1; i<arreglo.length; i++){
            boolean bandera = false;
            for(int j=arreglo.length-1; j>=i; j--){
                if(arreglo[j-1] > arreglo[j]){
                        int aux = arreglo[j-1];
                        arreglo[j-1] = arreglo[j];
                        arreglo[j] = aux;
                        bandera = true;
                }
            }
            if(bandera==false) break;
        }
    }
}
