package EmpateDeCadenas;

/**
 *
 * @author guija
 */
public class hashyFuerzaBruta {
    public static void main(String[] args) {
        String Principal = "hola adios hola adios";
        String Buscar = "adios";
        
        int hashBuscar = metodoHash(Buscar);
        buscarCoincidencia(Principal, Buscar);
        
    }
    public static int metodoHash(String cadenaTemp){
        int hash = 0;
        
        if(cadenaTemp.length() > 0){
            for(int i=0; i < cadenaTemp.length(); i++){
                hash += cadenaTemp.charAt(i);
            }
        }
        hash = (hash * hash) - (cadenaTemp.length() * 2);
        
        return hash;
    }
    public static void buscarCoincidencia(String PrincipalTemp, 
            String BuscarTemp){
        String temp = "";
        int contador = 0;
        for (int i = 0; i < PrincipalTemp.length(); i++) {
            char caracter = PrincipalTemp.charAt(i); 
            if (caracter == ' ') { 
                temp = ""; 
                continue; 
            }
            temp = temp + caracter;
            if(BuscarTemp.length() == temp.length() && 
                    metodoHash(BuscarTemp) == metodoHash(temp)){
                contador++;
                int posInicio = (i - temp.length() + 1); 
                int posFinal = i;
                System.out.println(contador+". "+"Coincidencia " + contador + 
                        " en la posición " + posInicio + " - " + posFinal);
                System.out.println("\t\t Con el hash: "+metodoHash(BuscarTemp));
            }
        }        
    }            
}
