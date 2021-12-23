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
public class saltoCaballo_Funcionamiento{
        // coordenadas de movimientos posibles
    private int [] movimientosX = {2, 1, -1, -2, -2, -1, 1, 2}; 
    private int [] movimientosY = {1, 2, 2, 1, -1, -2, -2, -1};
        
    public void run(int tableroTamaño){
        int [][] tablero = new int[tableroTamaño][tableroTamaño];
        // en qué casilla queremos que inicie el recorrido
        tablero [1][1] = 1; // el inicio ya cuenta como jugada
        if(resolver(tablero, 2, 0, 1)){ // movimiento 2, coord X, coord Y
            verTablero(tablero); // llamamos a verTablero
        }else{
            System.out.println("No se encontró solución alguna :<");
        }   // caso dónde no se puede resolver
    }
    public boolean resolver(int[][] tablero, int numMovimiento, 
            int coordX, int coordY){
        if(numMovimiento  > tablero.length*tablero.length){ // no se salió 
            return true;                                   // del límite de mov  
        }
        for(int i = 0; i<8; i++){ // next devuelve el siguiente dato
            int nextX = coordX + movimientosX[i];
            int nextY = coordY + movimientosY[i];
            if (validarMovimiento(tablero, nextX, nextY) && 
                    tablero[nextX][nextY] == 0){ // ¿movimiento válido?
/*en caso de ser válido, se ->*/tablero[nextX][nextY] = numMovimiento; 
/*le asigna el núm a la casilla*/if (resolver(tablero, numMovimiento+1, 
                                        nextX, nextY) ) { // se vuele a llamar 
					return true;        // resolver
				}
				tablero[nextX][nextY] = 0;
			}
        }
        return false;     
    }
    public void verTablero(int[][] tablero){ // simple impresión de matríz 
        for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println(); // salto de línea 
		}
    }
    public boolean validarMovimiento(int[][] tablero, int coordX, int coordY){ 
        if(coordX < 0 || coordX >= tablero.length || // ¿movimiento fuera 
                coordY < 0 || coordY >= tablero.length){ // del tablero?
            return false; 
        }else{
            return true;	
	}
    }
    
}
