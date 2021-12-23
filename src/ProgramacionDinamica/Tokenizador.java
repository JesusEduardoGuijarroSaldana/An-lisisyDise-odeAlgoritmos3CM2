
package ProgramacionDinamica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author guija
 */
public class Tokenizador{

    private List<Integer> pesos = new ArrayList<>();
    private List<Integer> beneficios = new ArrayList<>();

    public Tokenizador(){
    }
    
    public void Tokenizar(){   
        try{
            FileReader fileReader = 
                    new FileReader("C:\\Users\\guija\\Desktop\\Ejemplo3.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            StringTokenizer st;
            while((temp = bufferedReader.readLine())!=null){
                st = new StringTokenizer(temp, ",");
                int peso = Integer.parseInt(st.nextToken());
                pesos.add(peso);
                int beneficio = Integer.parseInt(st.nextToken());
                beneficios.add(beneficio);
            }
        }catch(Exception ex){
        }
    }
    
    public List<Integer> getPesos(){
        return pesos;
    }
    public List<Integer> getBeneficios(){
        return beneficios;
    }
}
