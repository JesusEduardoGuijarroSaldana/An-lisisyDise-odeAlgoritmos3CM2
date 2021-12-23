/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemaCaballo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guija
 */
public class logicaCaballo {
    private int n = 8;
    private int tablero[][] = new int [n][n]; // se arma el tablero
    private int xInicio;
    private int yInicio;
    private int xCoordUbicacion;
    private int yCoordUbicacion;
    private int numJugada;
    
    
    private List<Integer> jugadas = new ArrayList<Integer>();
    
    
    public logicaCaballo(int xInicial, int yInicial){
        this.xInicio = xInicial;
        this.yInicio = yInicial;
        this.xCoordUbicacion = xInicial;
        this.yCoordUbicacion = yInicial;
        verTablero();
        llenarTablero();
        verTablero();
    }
    
    public void verTablero(){
        String imprimir = "";
        for (int x=0; x < 8; x++){
            for (int y=0; y < 8; y++) {
                imprimir = imprimir +"| "+tablero[x][y];
            }
            imprimir = imprimir+" |\n";
        }System.out.println(imprimir);
    }
    public void llenarTablero(){
        numJugada = 1;
        for(numJugada = 1; numJugada<tablero.length; numJugada++){
            tablero[this.xCoordUbicacion][this.yCoordUbicacion] = numJugada;
        }
//        for(int i=0; i < tablero.length; i++){         
//                for(int j = 0; j < tablero.length; j++){
//                    tablero[i][j] = numJugada++;                    
//                }               
//            }
    }
    private coordenadas coordJugada(int x, int y){
        coordenadas temp = new coordenadas();
        switch(numJugada){
            case 1:{ // caso jugada 1 de 8
                temp.setCoordX(x-1);
                temp.setCoordY(y-2);
                break;
            }
            case 2:{ // caso jugada 2 de 8
                temp.setCoordX(x-2);
                temp.setCoordY(y-1);
                break;
            }
            case 3:{ // caso jugada 3 de 8
                temp.setCoordX(x-2);
                temp.setCoordY(y+1); 
                break;
            }
            case 4:{ // caso jugada 4 de 8
                temp.setCoordX(x-1);
                temp.setCoordY(y+2);
                break;
            }
            case 5:{ // caso jugada 5 de 8
                temp.setCoordX(x+1);
                temp.setCoordY(x+2);
                break;
            }
            case 6:{ // caso jugada 6 de 8
                temp.setCoordX(x+2);
                temp.setCoordY(y+1);
                break;
            }
            case 7:{ // caso jugada 7 de 8
                temp.setCoordX(x+2);
                temp.setCoordY(y-1);
                break;
            }
            case 8:{ // caso jugada 8 de 8
                temp.setCoordX(x+1);
                temp.setCoordY(y-2);
            }
        }
        
        return null;
               
    }
    public void jugadas(){
        jugadas.add(-1,-2); // 1
        jugadas.add(-2,-1); // 2
        jugadas.add(-2,1); // 3
        jugadas.add(-1,2); // 4
        jugadas.add(1, 2); // 5
        jugadas.add(2, 1); // 6
        jugadas.add(2,-1); // 7
        jugadas.add(1,-2); // 8
    }
    
    
}
