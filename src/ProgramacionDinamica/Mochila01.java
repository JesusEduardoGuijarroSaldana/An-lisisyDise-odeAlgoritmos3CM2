
package ProgramacionDinamica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author guija
 */
public class Mochila01 {
    public static void Mochila01(int capacidad, Integer[] W, Integer[] V){
        int numElementos = W.length;
        
        // Matriz: filas son los objetos y columnas es el peso de la mochila
        int[][] TablaPrincip = new int[numElementos + 1][capacidad + 1];
        for (int i = 1; i <= numElementos; i++){
        // Guardamos el peso y valor de cada item
            int w = W[i - 1]; 
            int v = V[i - 1];
            
            for (int j = 1; j <= capacidad; j++) {
        // Considerando no meter este elemento 
                TablaPrincip[i][j] = TablaPrincip[i - 1][j];
        // Considerando meter este elemento y ver si es rentable
                if (j >= w && TablaPrincip[i - 1][j - w] + v > TablaPrincip[i][j]){
                    TablaPrincip[i][j] = TablaPrincip[i - 1][j - w] + v;
                } // el + hace referencia a sumatoria 
            }
        }
        System.out.println("\nEl máximo beneficio es: "
                +TablaPrincip[numElementos][capacidad]); 
        // imprimimos el último elemento en la tabla, el cuál correspone 
        // al mayor beneficio calculado 
        int k = capacidad;
        List<Integer> itemsSeleccionados = new ArrayList<>();
        for(int i = numElementos; i > 0; i--){ 
            if(TablaPrincip[i][k] != TablaPrincip[i-1][k]){ //elemento dentro 
                int articuloIndice = i-1;                   //de la mochila o no
                itemsSeleccionados.add(articuloIndice);
                k = k - W[articuloIndice];
            }
        }
        Collections.reverse(itemsSeleccionados); // invertimos el contenido 
        System.out.print("Lo items seleccionados fueron: "); // del ArrayList
        for(int i=0; i<itemsSeleccionados.size(); i++){
            System.out.print("["+itemsSeleccionados.get(i)+"] ");
        }           
    } 
}
