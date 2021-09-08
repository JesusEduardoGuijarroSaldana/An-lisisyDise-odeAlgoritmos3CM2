/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis.y.diseño.de.algoritmos;
//@author guija
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class a002MetodoBurbuja {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //usando Scanner
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        int ciclos=0; 
        // ventanita usando JOptionPane
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos a evaluar: "));  
        
        arreglo = new int [nElementos];
        
        System.out.print("\n\n\tPrograma que ordena un arreglo de forma ascendente. \n\n");
        
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+" Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }   
        // Método burbuja (ordenamiento)
        for(int i=0; i<(nElementos-1); i++){ //¿Cuántas vueltas dar? 
            for(int j=0; j<(nElementos-1); j++){ // intercambios
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    ciclos=ciclos+1;
                }
            }
        }
        // Impresión ascendente 
        System.out.print(("\n\t Arreglo ordenado ascendentemente: "));
        for(int i=0; i<nElementos; i++){
            System.out.print(arreglo[i]+" ,");
        }
        /* Impresión descendente 
        System.out.print(("\n\t Arreglo ordenado descendentemente: "));
        for(int i=(nElementos-1); i>=0; i--){
            System.out.print(arreglo[i]+" ,");
        }*/
        System.out.print("\n\n\tMe tomó: ");
        System.out.print((ciclos)+" ciclos.\n\n");
    }
}
