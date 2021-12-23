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
public class EQuickSortA {
    private double t_total;
    private double t_inicial; 
    private double t_final;
    
    public EQuickSortA(){
        this.t_total=0.0;
        this.t_inicial=0.0; 
        this.t_final=0.0;
    }
    
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
        
     private void ordenarQuick(int[] arregloTemp, int izq, int der) {
        // seleccionar el pivote 
        int pivote = arregloTemp[izq];
        // realiza la busqueda de izq a derecha
        int i = izq;
        // realiza la busqueda de derecha a izq
        int j = der;
        int aux;
        
        // mientras no se crucen las busquedas ( i y j)
        while (i<j){
            // buscar elemento mayor al pivote 
            while (arregloTemp[i]<= pivote && i<j) i++;
            
            // buscar el elemento menor al pivote
            while(arregloTemp[j]>pivote) j--;
          // si no se han cruzado i y j
          // hacer intercambio
          if (i < j) {
          aux = arregloTemp[i];
          arregloTemp[i] = arregloTemp[j];
          arregloTemp[j] = aux;
          
          }
        }
        // colocar el pivote en su lugar de forma en que tendremos los menores 
        // a su izquierda y los mayores a su derecha
        arregloTemp[izq] = arregloTemp[j];
        arregloTemp[j] = pivote;
        /// ordenar el sub arreglo izq
        if (izq<j-1)
            ordenarQuick(arregloTemp,izq,j-1);
          /// ordenar el sub arreglo der
        if (j+1 < der)
            ordenarQuick(arregloTemp, j+1, der);   
    }
    
    
}
