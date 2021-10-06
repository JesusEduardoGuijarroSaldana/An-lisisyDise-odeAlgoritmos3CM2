/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis.y.diseño.de.algoritmos;

/*import algoritmosordenamiento.ABurbuja;
import algoritmosordenamiento.BBurbujaOptimizado;
import algoritmosordenamiento.CInsertionSort;*/
//import algoritmosordenamiento.DMergeSort;
import algoritmosordenamiento.EQuickSort;

/**
 *
 * @author guija
 */
public class MainClass {
    public static void main(String [] args){
        /*// me ordena un objeto creado con la estructura 
        int r[] = new int[]{5,4,3,2,1}; // arreglo utilizado en primero método
        // se le agrega un objeto de tipo burbuja 
        ABurbuja objeto = new ABurbuja(); // crea una nueva instancia de burbuja CONSTRUCTOR 
        objeto.ordenarBurbuja(r);
        //System.out.println(); // print agregado solo para poner un breakpoint, para depurar el código 
        
        int g[] = new int[]{10,9,8,7,6}; // arreglo utilizado en primero método
        BBurbujaOptimizado objeto2 = new BBurbujaOptimizado();
        objeto2.ordenarBurbujaOptimizado(g);
        //System.out.println(); 
        
        int a[] = new int[]{16,15,14,13,12};
        CInsertionSort objeto3 = new CInsertionSort();
        objeto3.ordenarInsertionSort(a);
        //System.out.println(); print agregado solo para poner un breakpoint, para depurar el código */
        
        /*int b[] = new int[]{25,23,24,19,17,20};
        DMergeSort objeto4 = new DMergeSort();
        objeto4.ordenar(b);*/
        
        int c[] = new int[]{1,5,9,6,25,30,4};
        EQuickSort objeto5 = new EQuickSort();
        objeto5.ordenarQuick(c, 0, c.length-1); 
        
        System.out.println(); // print agregado solo para poner un breakpoint, para depurar el código 
    }
}
