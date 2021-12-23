/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpateDeCadenas;

/**
 *
 * @author guija
 */
public class FuerzaBruta {
//    private String[] Principal = {"Hola que tal"};
//    private int tamaño1 = Principal.length;
//    private String[] Buscar = {"que"};
//    private int tamaño2 = Buscar.length;
    
    public static int encontrar(int n, int m, String[] tempPrinc, String[] tempBusc){    
        int j;
        for(int i=0; i<= (n-m); i++){
            j=0;
            while(j<m && tempBusc[j] == tempPrinc[i+j]){
                j++;
            }
            if(j == m ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //char [20] = 'a';
        String[] Principal = {"a","b","c","H","o","l","a"," ","q","u","e"};
        int tamaño1 = Principal.length;
        String[] Buscar = {"H","o","l","a"};
        //{"z"}
        //{"H","o","l","a"};
        int tamaño2 = Buscar.length;
        int temp;
        temp = encontrar(tamaño1, tamaño2, Principal, Buscar);
        if(temp == -1){
            System.out.println("No se detectó ninguna coincidencia.");
        }else{
            System.out.println("Se encontró Buscar dentro de Principal.");
            System.out.println("En la posición: ["+temp+"] - "+"["+(temp+(tamaño2-1))+"]");
        }        
    }
}
