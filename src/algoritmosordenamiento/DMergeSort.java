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
public class DMergeSort implements NewInterface{

    private double t_inicial;
    private double t_final;
    private double t_total;
    private int[] datos;

    public DMergeSort() {
        this.t_inicial = 0;
        this.t_final = 0;
        this.t_total = 0;
    }
    
    @Override
    public void ordenar(int[] arreglo) {
        this.datos = arreglo.clone();
        this.t_inicial = System.currentTimeMillis();
        ordenar(arreglo, 0, arreglo.length-1);
        this.t_final = System.currentTimeMillis();
        this.t_total = this.t_final - this.t_inicial;
    }
    
    private void ordenar(int[] aux, int left, int right) {
        // verificar por lo menos left sea menor que right
        if (left < right){
           int center = (left+right)/2;
            ordenar(aux, left, center);
            ordenar(aux, center+1, right);
            merge(aux,left,center+1,right);
        }
        
    }

    private void merge(int[] aux, int posIzq, int posDer, int topeDer) {
        // establecer unos limites
        int leftEnd = posDer - 1;
        int tmpPos = posIzq;
        // calcular un numero de elementos 
        int numElements = topeDer - posIzq + 1;
        
        // generar los cambios en el arreglo temporal 
        while (posIzq <= leftEnd && posDer<=topeDer) {
            if (this.datos[posIzq]<this.datos[posDer]){
              aux[tmpPos++] = this.datos[posIzq++];
            }else {
               aux[tmpPos++] = this.datos[posDer++];
            }
        }
        // copiar el resto de la primera mitad
        while (posIzq <= leftEnd){
          aux[tmpPos++] = this.datos[posIzq++];
        }        
        // copiar el resto de la segunda mitad
         while (posDer <= topeDer){
          aux[tmpPos++] = this.datos[posDer++];
        }  
        
        // actualizar el arreglo 
        // recorrer el arreglo
        for (int i = 0; i < numElements; i++, topeDer--){
        this.datos[topeDer] = aux[topeDer];
        }  
    }
    @Override
    public double getT_total(){
        return t_total;
    } 
}