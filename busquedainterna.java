import java.util.Arrays;
public class busquedainterna {
    public static int busqueda(int [] arreglo, int clave) {
        for (int i = 0; i<arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return i;
            }
        }
        return -1;

    }
    public static int busquedabinaria(int[] arreglo, int clave) {
        int inicio = 0;
        int fin = arreglo.length -1;
        while (inicio <= fin) {
            int medio = (inicio+fin) / 2;
            if (arreglo[medio]== clave){
                return medio;
                } else 
                if (arreglo[medio] < clave) {
                    inicio = medio + 1;

                } else {
                    fin = medio - 1;
                }
        }
            return -1;
        }
    public static void main(String[] args) {
        int [] datos = {34, 7 , 23, 9, 12, 27};
        int pos1 = busqueda(datos, 23);
        System.out.println("23 esta en la posc¡icion " + pos1);
        Arrays.sort(datos);
        System.out.println("ordenado; " + Arrays.toString(datos));
        int pos2 = busquedabinaria(datos, 23);
        System.out.println("23 esta en la posicion " + pos2);



    }
        
    }
