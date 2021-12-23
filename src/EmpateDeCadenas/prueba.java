/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpateDeCadenas;

/**
 *
 * @author guija
 */
public class prueba {
    public static void main(String[] args) {
//        String[] Principal = {"H","o"}; 
//        System.out.println(""+Principal[0]);
//        System.out.println(""+Principal.length);
//        String frase= "java";
//        String temp="";
//        temp = temp + frase;
//        System.out.println(""+temp);
        
        String cadena = "Hola";
        char caracter = cadena.charAt(0); // obtenemos x caracter de x cadena, guardandolo en un char.
        int ascii = cadena.charAt(0); // obtenemos el ascii guardando x pos en un entero con charAt.
        System.out.println(""+ caracter); // imprimimos el carácter.
        System.out.println(""+ cadena.charAt(0)); // imprimimos el carácter con charAt.     
        System.out.println(""+ ascii); // imprimimos el ascii de x carácter
    }
}
