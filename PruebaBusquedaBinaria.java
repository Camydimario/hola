package testBusquedaBinaria;
//secuencial
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestClassOrder;

public class PruebaBusquedaBinaria {

@Test
public void buscar () {
   BusquedaSecuencial  busqueda = new BusquedaSecuencial();
   
    int[] vector = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
    int buscado = 65;
    int resultado = busqueda.buscar(vector, buscado);

assertEquals(4, resultado);
}

@Test

public void buscar2() {
    BusquedaSecuencial  busqueda = new BusquedaSecuencial();
     int[] vector = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int buscado = 9;
  // Ejecutar la búsqueda
   int resultado = busqueda.buscar(vector, buscado);
  
// Verificar que el resultado es el índice correcto
  assertEquals(8, resultado); // 9 está en el índice 8
}

@Test

public void busqueda3 () {
BusquedaSecuencial  busqueda = new BusquedaSecuencial();
 int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
int buscado = 10;

int resultado = busqueda.buscar(vector, buscado);
Assertions.assertEquals(0, resultado); // esta en posicion 0

}
public void busqueda4 () {
 BusquedaSecuencial  busqueda = new BusquedaSecuencial();

int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
int buscado = 8;

int resultado = busqueda.buscar(vector, buscado);
Assertions.assertEquals(-1, resultado); // esta en posicion que no existe

}

}