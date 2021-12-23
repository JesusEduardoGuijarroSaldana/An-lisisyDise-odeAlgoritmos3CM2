/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionDinamica;

import java.util.Scanner;

/**
 *
 * @author guija
 */
public class FibonacciDinamicoRecursivo{
    
    static int[] Elementos; //declarando
    
    public static int Fibonacci(int num){
        if(num == 0){ // caso base
            Elementos[0] = 0;
            return 0; // fibonnacci de 0 es = 0
        }
        else if(num == 1 || num == 2){ // caso base
            Elementos[num] = 1; // si num es 1 o 2, se le asigna un 1 en ambos casos
            return 1;  // fibonnacci de 1 o 2 es = 1
        }
        else if(Elementos[num] == 0){ // en caso de que no se haya calculado 
            Elementos[num] = Fibonacci(num-1)+Fibonacci(num-2); // se calcula
            return Elementos[num]; 
        }else{
            return Elementos[num]; // ya fue calculado 
        }
    }

    public static void main(String [] args){
        
        System.out.println("\n\n\t> Programa que aplica la sucesión fibonacci dinámica recursiva <");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n\nIngrese el número de elementos de la serie: ");
        
        int num = teclado.nextInt();
        if(num>0){
            Elementos = new int[num]; // dandole el tamaño, se inicializa en 0 
        
            Fibonacci(num-1); //llamando a Fibonacci 
         
            System.out.print("[ "); 
            for (int i = 0; i < Elementos.length; i++) {  // impresión 
                System.out.print(" " + Elementos[i] + " ");
            }
            System.out.println(" ]");
        }else{
            System.out.println("\n\n\t***Agregue un número mayor a 0***");
        }
        
    }
}
