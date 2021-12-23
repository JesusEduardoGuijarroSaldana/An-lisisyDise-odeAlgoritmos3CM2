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
public class BBurbujaOptimizado implements NewInterface{
    
    /*variables que serán utilizadas para generar una estimación de lo que tarda
    en el momento de ordenar */
    private double t_total;
    private double t_inicial; 
    private double t_final;
    
    public BBurbujaOptimizado(){
        this.t_total=0.0;
        this.t_final=0.0;
        this.t_inicial=0.0;
    }
    @Override
    public void ordenar(int arreglo[]){ //tenía ordenarBurbujaOptimizado, pero se necesita llamar ordenar   
    // antes de meterse al for
        this.t_inicial = System.currentTimeMillis();
        //codificación del método de ordenamiento burbuja optimizado
        for(int i=1; i<arreglo.length; i++){
            boolean bandera = false;
            for(int j=arreglo.length-1; j>=i; j--){
                if(arreglo[j-1] > arreglo[j]){
                        int aux = arreglo[j-1];
                        arreglo[j-1] = arreglo[j];
                        arreglo[j] = aux;
                        bandera = true;
                }
            }
            if(bandera==false) break;
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
