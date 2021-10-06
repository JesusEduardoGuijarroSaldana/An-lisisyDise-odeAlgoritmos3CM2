/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;//importamos scanner para ingresar nuestros valores

/**
 *
 * @author guija
 */
public class Fibonacci {
   
    // método que calcula la secuencia hasta llegar a n número
    public static int Fibonacci(int n){
        if(n>1){    
        // funcion recursiva
            return Fibonacci(n-1) + Fibonacci(n-2); 
        } else if(n==1){ // caso base
            return 1;
        } else if(n==0){ // caso base   
            return 0;
        } else{ // en caso de ingresar n negativo
            System.out.println("Debes ingresar un tamaño igual o mayor a 1");
            return -1;
        }
    } 
    
    public static void main(String [] args){
        
        System.out.println("\n\n\t***Programa recursivo serie fibonacci***\n\n");
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la serie(debe ser ):  ");
        int numero = teclado.nextInt();
     
        for(int i=0; i<numero; i++){
            System.out.println(Fibonacci(i)+" ");
        }
            System.out.println("");
        }
}


