
package ProgramacionDinamica;

/**
 *
 * @author guija
 */
public class Articulo {
    private int peso;
    private int beneficio;
    
    public Articulo(){
    }
    public Articulo(int peso, int beneficio){
        this.peso = peso;
        this.beneficio = beneficio;
    }
    
    public int getPeso(){
        return peso;
    }
    public int getBeneficio(){
        return beneficio;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setBeneficio(int beneficio){
        this.beneficio = beneficio;
    }
}
