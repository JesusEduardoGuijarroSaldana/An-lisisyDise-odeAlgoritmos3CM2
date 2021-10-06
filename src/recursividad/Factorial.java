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
public class Factorial {
    // método recursivo
    public static int factorial(int numero){
        if(numero == 0){
            return 1; //caso base
        }
        else{
            return numero * factorial(numero-1);
        } 
    }
    
    public static void main(String[] args) {
        
        System.out.println("\n\n\t***Programa recursivo factorial de un número***\n\n");
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce un número: ");
        int numero = teclado.nextInt();
        System.out.println("\nEl n! de " + numero + " es: " + factorial(numero));
    }    
}

