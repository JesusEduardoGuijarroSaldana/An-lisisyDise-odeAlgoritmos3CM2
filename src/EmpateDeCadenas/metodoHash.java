
package EmpateDeCadenas;

/**
 *
 * @author guija
 */
public class metodoHash {
    public static void main(String[] args) {
        
        System.out.println("1. Hash para Hola: "+ hasheo("Ho"));
//        System.out.println("2. Hash para Hola: "+ hasheo("Hola"));
//        System.out.println("3. Hash para hola: "+ hasheo("hola"));
//        System.out.println("3. Hash para aloh: "+ hasheo("aloh"));
    }
    
    public static int hasheo(String cadenaTemp){
        int hash = 0;
        
        if(cadenaTemp.length() > 0){
            for(int i=0; i < cadenaTemp.length(); i++){
                hash += cadenaTemp.charAt(i);
            }
        }        
//        if(cadenaTemp.length() > 0){
//            hash += cadenaTemp.charAt(0); // el resultado será un valor Ascii
//        }
//        if(cadenaTemp.length() > 1){
//            hash += cadenaTemp.charAt(1); // el resultado será un valor Ascii
//        }
//        if(cadenaTemp.length() > 4){
//            hash += cadenaTemp.charAt(4); // el resultado será un valor Ascii
//        }        
        hash = (hash * hash) - (cadenaTemp.length() * 2);        
        return hash;
        }
}
