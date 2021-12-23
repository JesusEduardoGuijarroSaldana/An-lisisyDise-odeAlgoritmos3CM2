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
public class ClaseMain {
    public static void main(String[] args) {
        int tablero_medida = 3;
        saltoCaballo_Funcionamiento saltoCaballo =
                new saltoCaballo_Funcionamiento();
        saltoCaballo.run(tablero_medida);
    }
}
