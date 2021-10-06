/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;
import java.util.Scanner; //importamos scanner para ingresar nuestros valores

/**
 *
 * @author guija
 */
public class SumaDosNum {
    // método 
    public static int suma(int a, int b) {
        if (b == 0) { // caso base
            return a;
        } else if (a == 0) { // caso base
            return b;
        } else{
            return 1 + suma(a, b - 1);
        }
    }
   
    public static void main(String[] args) {
        
        System.out.println("\n\n\t***Programa recursivo de suma de dos números***\n\n");
        
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("- Ingrese 1er número: ");                                                           
        num1 = teclado.nextInt();
        System.out.print("- Ingrese 2do número: ");
        num2 = teclado.nextInt();
        System.out.println("El resultado de la suma es: " + suma(num1, num2));                                                              

    }
}

