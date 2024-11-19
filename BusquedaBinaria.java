package testBusquedaBinaria;
public class BusquedaBinaria {
    public int buscar(int[] vector, int buscado) {
        int izquierda = 0;
        int derecha = vector.length - 1;
        int posicion = -1;
    
        while (izquierda <= derecha && posicion == -1) {
          int posMedio = (izquierda + derecha) / 2;
          int medio = vector[posMedio];
          
          if (medio < buscado) {
            izquierda = posMedio + 1;
          } else if (medio > buscado) {
            derecha = posMedio - 1;
          } else {
            posicion = buscado;
          }
        }
        return posicion;
      }
}