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
public class EQuickSort implements NewInterface{
    
    private double t_inicial;
    private double t_final;
    private double t_total;
    private int[] datos;

    public EQuickSort() {
        this.t_inicial = 0;
        this.t_final = 0;
        this.t_total = 0;
    }
    
    @Override
    public void ordenar(int[] arreglo) {
        // verificar por lo menos left sea menor que right
       // implementar el metodo de ordenamiento por mezcla
      // verificar que los datos no sean nulos
      if (arreglo!= null){
         
         this.t_inicial = System.currentTimeMillis();
         ordenarQuick(arreglo,0,arreglo.length-1);
         // calculamos el tiempo del sistema en milis   
         this.t_final = System.currentTimeMillis();
       
      }
      this.t_total= this.t_final - this.t_inicial;
    }
        
     private void ordenarQuick(int[] tmpArray, int izq, int der) {
        // seleccionar el pivote 
        int pivote = tmpArray[izq];
        // realiza la busqueda de izq a derecha
        int i = izq;
        // realiza la busqueda de derecha a izq
        int j = der;
        int aux;
        
        // mientras no se crucen las busquedas ( i y j)
        while (i<j){
            // buscar elemento mayor al pivote 
            while (tmpArray[i]<= pivote && i<j) i++;
            
            // buscar el elemento menor al pivote
            while(tmpArray[j]>pivote) j--;
          // si no se han cruzado i y j
          // hacer intercambio
          if (i < j) {
          aux = tmpArray[i];
          tmpArray[i] = tmpArray[j];
          tmpArray[j] = aux;
          
          }
        }
        // colocar el pivote en su lugar de forma en que tendremos los menores 
        // a su izquierda y los mayores a su derecha
        tmpArray[izq] = tmpArray[j];
        tmpArray[j] = pivote;
        /// ordenar el sub arreglo izq
        if (izq<j-1){
            ordenarQuick(tmpArray,izq,j-1);
        }
          /// ordenar el sub arreglo der
        if (j+1 < der){
            ordenarQuick(tmpArray, j+1, der);
        }
     }
     
    @Override
    public double getT_total(){
        return t_total;
    } 
}
    
