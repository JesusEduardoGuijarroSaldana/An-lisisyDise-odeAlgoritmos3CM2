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

import java.util.Random;

public class numsAleatorios {
//    public static void main(String [] args){
//    
//    Random numsAleatorios = new Random();
//    
////    int N = numsAleatorios.nextInt(5)+1;
////    System.out.println("El número aleatorio es: "+N); //+N concatenar 
//    
//    }
    public static int[] llenarArregloNumsAleatorios(int tamaño, int tope){
        
        int numeros[] = new int[tamaño];
        Random numsAleatorios = new Random();
        
        for(int i=0; i<numeros.length; i++){
            numeros[i] = numsAleatorios.nextInt(tope)+1;
        }
        return numeros;
    }
    
    public static void imprimirArreglo(int arreglo[]){
        System.out.println("Imprimir datos: ");
        for (int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
