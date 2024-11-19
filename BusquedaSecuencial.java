package testBusquedaBinaria;
public class BusquedaSecuencial {


/**
 * Buscador que utiliza el algoritmo de búsqueda secuencial.
 */

 /**
     * post: devuelve la posición de vector en la que se localizó la primera
     *       ocurrencia del elemento buscado. 
     *       Si no lo encuentra devuelve -1.
     */
    public int buscar(int[] vector, int buscado) {
    int posicion = -1;
    int i = 0;

    while(i< vector.length && posicion == -1){
        if(vector[i]== buscado) {
            posicion = i;
        
        }
    i++;
    }
return posicion;
}
}




