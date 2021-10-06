/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenamiento;

/**
 *
 * @author guija
 */
public class DMergeSort {
    
    public void ordenar(int arreglo[]){
        if(arreglo.length > 1){ //se pregunta si arreglo tiene más de un elemento
            int mitad = (arreglo.length/2);
            int cant1 = mitad;
            int cant2 = (arreglo.length-mitad);
        
        // creamos arreglos para cada mitad |            
            int izq[] = new int[cant1];
            int der[] = new int[cant2];
        // copiamos los elementos para cada mitad
            for(int indiceIzq=0; indiceIzq < cant1; indiceIzq++){
                izq[indiceIzq] = arreglo[indiceIzq];
            }
            for(int indiceDer=0; indiceDer<cant2; indiceDer++){
                der[indiceDer] = arreglo[mitad+indiceDer];
            }
            
            ordenar(izq); // se vuelve a llamar ordenar y se parte el arreglo
            ordenar(der); // se vuelve a llamar ordenar y se parte el arreglo
            mezclar(arreglo, izq, der); // mezclamos las dos mitades
        }
    }
    static void mezclar(int arreglo[], int izq[], int der[]){ // recibe el arreglo resultante y ambas mitades 
        int indiceIzq=0, indiceDer=0, indiceArreglo=0;
        
        //copia y ordena los elementos de los arreglos izq[] y der[]
        while(indiceIzq < izq.length && indiceDer < der.length){
            if(izq[indiceIzq] < der[indiceDer]){
                arreglo[indiceArreglo] = izq[indiceIzq];
                indiceIzq+=1; // indiceIzq=IndiceIzq+1
            }else{
                arreglo[indiceArreglo] = der[indiceDer];
                indiceDer+=1; // indiceDer=indiceDer+1
            }
            indiceArreglo+=1; // indiceArreglo=indiceArreglo+1
        }
        // verifica si aún hay elementos en alguna de las mitades para completar el arreglo final  
        while(indiceIzq < izq.length){
            arreglo[indiceArreglo] = izq[indiceIzq];
            indiceIzq+=1;
            indiceArreglo+=1;
        }
        while(indiceDer < der.length){
            arreglo[indiceArreglo] = der[indiceDer];
            indiceDer+=1;
            indiceArreglo+=1;
        }
    }
    /*public static void main(String[] args){
        int datos[] = new int[]{8,3,6,1,2,5,7,10};
        ordenar(datos);
        System.out.println();
    }*/
    
}
