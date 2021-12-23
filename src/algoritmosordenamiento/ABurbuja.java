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
public class ABurbuja implements NewInterface{
    
    /*variables que serán utilizadas para generar una estimación de lo que tarda
    en el momento de ordenar */
    
    private double t_total;
    private double t_inicial;
    private double t_final;
    
    public ABurbuja(){
        this.t_total=0.0;
        this.t_final=0.0;
        this.t_inicial=0.0;
        
    }
    
    @Override
    public void ordenar(int arreglo[]){ //tenía ordenarBurbuja, pero se necesita llamar ordenar
        
    // antes de meterse al for
        this.t_inicial = System.currentTimeMillis();

    // codificación ordenamiento burbuja
        for(int i=0; i<(arreglo.length-1); i++){ //¿Cuántas vueltas dar? 
            for(int j=0; j<(arreglo.length-1); j++){ // intercambios
                if(arreglo[j] > arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
    // afuera del for ya terminó
        this.t_final = System.currentTimeMillis();
        this.t_total = t_final-t_inicial;
        
        
    }
    @Override
    public double getT_total(){
        return t_total; 
    }
}
