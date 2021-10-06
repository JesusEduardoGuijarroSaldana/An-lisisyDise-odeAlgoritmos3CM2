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
public class EQuickSort {
    public void ordenarQuick(int arreglo[], int primero, int ultimo){
        int i, j, pivote, temp;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero+ultimo)/2];
        do{ // movimiento de indices
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;    
            }
            // intercambio
            if(i<=j){
                temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
                i++;
                j--;
            }
        }while(i<=j);
        //recursividad
        if(primero<j){
            ordenarQuick(arreglo, primero, j);
        }
        if(i<ultimo){
            ordenarQuick(arreglo, i, ultimo);
        }
    }
}
