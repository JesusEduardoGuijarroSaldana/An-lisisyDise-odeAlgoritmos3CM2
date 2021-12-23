/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis.y.diseño.de.algoritmos;

import algoritmosordenamiento.ABurbuja;
import herramientasOrdenamiento.numsAleatorios;
import algoritmosordenamiento.BBurbujaOptimizado;
import algoritmosordenamiento.CInsertionSort;
//import algoritmosordenamiento.DMergeSort;
//import algoritmosordenamiento.EQuickSort;
import java.util.ArrayList;
import algoritmosordenamiento.NewInterface;
import herramientasOrdenamiento.Comparador;

/**
 *
 * @author guija
 */
public class MainClass {
    public static void main(String [] args){
        
        ArrayList<NewInterface>algoritmosordenamiento = new ArrayList<>();
        algoritmosordenamiento.add(new ABurbuja());
        algoritmosordenamiento.add(new BBurbujaOptimizado());
        algoritmosordenamiento.add(new CInsertionSort());
        Comparador comparador = new Comparador(algoritmosordenamiento,1000, 10);
        comparador.compararAlgoritmos();
        
        //llenamos nuestro arreglo con datos aleatorios del 0 a 100, y 100 elemetos
//        int arreglo1[] = numsAleatorios.llenarArregloNumsAleatorios(50000,1000);
//        int arreglo2[] = numsAleatorios.llenarArregloNumsAleatorios(50000, 1000);
//        int arreglo3[] = numsAleatorios.llenarArregloNumsAleatorios(50000, 1000);
//        int arreglo4[] = numsAleatorios.llenarArregloNumsAleatorios(50000, 1000);
//        
//        
//        //numsAleatorios.imprimirArreglo(arreglo1);
//            
//
//        //me ordena un objeto creado con la estructura 
//        //int r[] = new int[]{5,4,3,2,1}; // arreglo utilizado en primero método
//        // se le agrega un objeto de tipo burbuja 
//        ABurbuja objeto = new ABurbuja(); // crea una nueva instancia de burbuja CONSTRUCTOR 
//        objeto.ordenarBurbuja(arreglo1);
//        
//        //objeto.getTiempo();
//        
//        //System.out.println(); // print agregado solo para poner un breakpoint, para depurar el código 
//        
//        //int g[] = new int[]{10,9,8,7,6}; // arreglo utilizado en primero método
//        BBurbujaOptimizado objeto2 = new BBurbujaOptimizado();
//        objeto2.ordenarBurbujaOptimizado(arreglo2);
//        
//        //int a[] = new int[]{16,15,14,13,12};
//        CInsertionSort objeto3 = new CInsertionSort();
//        objeto3.ordenarInsertionSort(arreglo3);
//        System.out.println(); //print agregado solo para poner un breakpoint, para depurar el código */
//        
//        //int b[] = new int[]{25,23,24,19,17,20};
//        //DMergeSort objeto4 = new DMergeSort();
//        //objeto4.ordenar(arreglo4);
//        
//        //System.out.println(); 
//        
////        int c[] = new int[]{1,5,9,6,25,30,4};
////        EQuickSort objeto5 = new EQuickSort();
////        objeto5.ordenarQuick(c, 0, c.length-1); 
            //System.out.println(); // print agregado solo para poner un breakpoint, para depurar el código 
    }
    
    
}
