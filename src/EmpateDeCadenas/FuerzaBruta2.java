package EmpateDeCadenas;

/**
 *
 * @author guija
 */
public class FuerzaBruta2 {

    public static void main(String[] args) {
        String Principal = "hola adios hola adios";
        String Buscar = "adios";

        buscar(Principal, Buscar);    
    }

    public static void buscar(String PrincipalTemp, String BuscarTemp) {
        String temp = "";
        int contador = 0;
        //pase = false;
        for (int i = 0; i < PrincipalTemp.length(); i++) {
            char caracter = PrincipalTemp.charAt(i); 
            // obtiene el ASCII y lo guarda cómo carácter.
            if (caracter == ' ') { // nos saltamos los espacios para llegar a otra palabra
                temp = ""; // reseteamos temp para una nueva palabra
                continue; // lo contrario a break, nos regresa a la línea 46
            }
            temp = temp + caracter; // guardamos palabra a comparar
            if (BuscarTemp.length() == temp.length() && temp.equals(BuscarTemp)) {
                // entramos si se encuentra una coincidencia
                contador++; // suma las palabra iguales encontradas
                int posInicio = (i - temp.length() + 1); 
                // calculamos la pos del inicio de la palbra
                int posFinal = i; 
                // calculamos la pos del final de la palbra
                System.out.println("Coincidencia " + contador + 
                        " en la posición " + posInicio + " - " + posFinal);
            }
        }
    }
}
