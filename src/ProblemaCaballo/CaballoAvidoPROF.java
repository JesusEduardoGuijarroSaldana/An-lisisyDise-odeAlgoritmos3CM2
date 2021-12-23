/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemaCaballo;

/**
 *
 * @author guija
 */
public class CaballoAvidoPROF {
    private int coordenadaInicialX;
    private int coordenadaIncialY;
    private int x,y;
    private boolean solucion;
    private int[][] tablero;
    private int dimension;

    // CONSTRUCTOR POR DEFAULT
    public CaballoAvidoPROF() {
        
    }

    public CaballoAvidoPROF(int coordenadaInicialX, int coordenadaIncialY, int dimension) {
        this.coordenadaInicialX = coordenadaInicialX;
        this.coordenadaIncialY = coordenadaIncialY;
        this.dimension = dimension;
        this.x = coordenadaInicialX;
        this.y = coordenadaIncialY;
        tablero = new int[dimension][dimension];
        //armarTablero(); //**************************************************** se llama armarTablero
    }

    public boolean run(){
       int x;
        for ( x = 1; x <= this.dimension*this.dimension; x++){
          
           // ASIGNAMOS EL NUMERO DE MOVIMIENTO A LA CASILLA
           tablero[this.x][this.y]= x;
          if (!calculaNuevoMovimiento()){  //-------------------------------------------- ACÁ SE LLAMA EL PRIMERO
                  tablero[this.x][this.y]= ++x;
                  break;
            //  x = this.dimension*this.dimension + 1;
          }
        }
        
    return (x==this.dimension*this.dimension);
    }
    
    // CALCULAMOS EL NUEVO MOVIMIENTO
     private boolean calculaNuevoMovimiento() { ///********************************************************** PRIMERO
       
       int minaccesibles = 8;
       int solX = 0, solY= 0;
       
       // VERIFICAMOS 8 POSIBLES MOVIMIENTOS
       for (int i = 1; i <= 8; i++ ){
            //OBTENEMOS LA COORENADA
            coordenadaPROF coor = dameCoordenada(i,this.x, this.y); //-------------------------------------------- ACÁ SE LLAMA EL SEGUNDO
            // VERIFICAMOS SI LA COORDENADA OBTENIDA ES CORRECTA O NO ESTA VISITADA Y DE SER ASI LOS POSIBLES MOVIMIENTOS
            if (validarCoordenada(coor)){ //----------------------------------------------------------------  ACÁ SE LLAMA EL TERCERO
            int cantidad = analizarCoordenada(coor);  //  --------------------------------------------  ACÁ SE LLAMA EL CUARTO
            if(cantidad > 0 && cantidad <= minaccesibles){
                minaccesibles = cantidad;
                 solX = coor.getX();
                 solY = coor.getY();
            
            }
            // SI LA CASILLA VALIDA YA NO TIENE NINGUNA POSIBILIDAD
            if (cantidad==0)
            {
             solX = coor.getX();
             solY = coor.getY();
             i = 9;
             this.x = solX;
             this.y = solY;
             return false;
            }
            }
                   
        }
       this.x = solX;
       this.y = solY;
       
       return (minaccesibles>0);
    }
    
   
     
     
//    // METODO PARA INICIALIZAR EL TABLERO
//    private void armarTablero() {
//       
//        for (int x = 0; x < this.dimension; x++  ){
//           for (int y =0; y < this.dimension; y++){
//           tablero[x][y]=0;
//        }
//        }
//    }

    private coordenadaPROF dameCoordenada(int i, int x, int y) {  //************************************* SEGUNDO
       coordenadaPROF aux = new coordenadaPROF();
       switch (i){
                  
            case 1:{
                aux.setX(x-1); 
                aux.setY(y-2);
            break;     
                
            }
            case 2:{
                aux.setX(x-2); 
                aux.setY(y-1);
            break;             
            }
            case 3:{
                aux.setX(x-2); 
                aux.setY(y+1);
            break;   
            }
            case 4:{
                aux.setX(x-1); 
                aux.setY(y+2);
            break;   
            }
            case 5:{
                aux.setX(x+1); 
                aux.setY(y+2);
            break;   
            }
            case 6:{
                aux.setX(x+2); 
                aux.setY(y+1);
            break;   
            }
            case 7:{
                aux.setX(x+2); 
                aux.setY(y-1);
            break;   
            }
            case 8:{
                aux.setX(x+1); 
                aux.setY(y-2);
            break;   
            }
       
       }
       return aux;
    }

    private int analizarCoordenada(coordenadaPROF coor) { // ************************************** CUARTO
       
        int acc = 0;
      
        for (int i = 1; i <= 8; i++){
            coordenadaPROF aux =  dameCoordenada(i,coor.getX(),coor.getY());
            if (verificarPosibleSalto(aux)){
             acc++;
            }
          
        }
        return acc;
    }
    // METODO PARA VERIFICAR UN POSIBLE SALTO
     private boolean verificarPosibleSalto(coordenadaPROF coor) { // CUARTO DENTRO DE ANALIZAR COORDENADA
             
            
             // SI SE SALE DEL TABLERO
             
             if ((coor.getX() < 0) || (coor.getY() < 0) || (coor.getX() > this.dimension -1) ||
                     (coor.getY() > this.dimension-1)){
                return false;} // SI YA ESTA OCUPADA RETORNA FALSE
            
             if (this.tablero[coor.getX()][coor.getY()] != 0)
               return false;
             
             
        return true;
    }
   

   
     @Override
    public String toString() {
       String tab = "";
       
       for(int x = 0; x < this.dimension; x++){
       
           for (int y = 0; y < this.dimension; y++){
           tab += " "+tablero[x][y];
           }
           tab += "\n";
       }
       
       return tab;
    
    }
    
    private boolean validarCoordenada(coordenadaPROF coor){  //*************************************************** TERCERO
    
    return (coor.getX()>=0) && (coor.getY()>=0) && (coor.getX()<this.dimension) 
            && (coor.getY()<this.dimension) && (tablero[coor.getX()][coor.getY()]==0);
    }    
}
