
package ProgramacionDinamica;

import static ProgramacionDinamica.Mochila01.Mochila01;
import java.util.List;

/**
 *
 * @author guija
 */
public class MainClass {
    public static void main(String[] args) {
        Tokenizador tok = new Tokenizador();
        tok.Tokenizar();
        
        List<Integer> pesosTemp = tok.getPesos();
        List<Integer> beneficiosTemp = tok.getBeneficios();
        
        Integer[] W = new Integer[pesosTemp.size()];
        pesosTemp.toArray(W); 
        Integer[] V = new Integer[beneficiosTemp.size()];
        beneficiosTemp.toArray(V);
        //Usamos la Función toArray() para convertir 
        //una Lista (ArrayList) en un Arreglo
        
        int capacidad = 5;
        Mochila01(capacidad, W, V);
        
        //System.out.println();
    }
}
