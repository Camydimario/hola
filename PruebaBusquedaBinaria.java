package testBusquedaBinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PruebaBusquedaBinaria {
@Test
public void buscar () {
   BusquedaBinaria  busqueda = new  BusquedaBinaria();
   
    int[] vector = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
    int buscado = 65;
    int resultado = busqueda.buscar(vector, buscado);
    //Arrays.sort(vector);
   assertEquals(65, resultado);
}


@Test
public void buscar2 () {
   BusquedaBinaria  busqueda = new  BusquedaBinaria();
   
   int[] vector = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   int buscado = 9;
   int resultado = busqueda.buscar(vector, buscado);
    //Arrays.sort(vector);
   assertEquals(9, resultado);
}


@Test
public void buscar3() {
   BusquedaBinaria  busqueda = new  BusquedaBinaria();
   int[] vector = new int[] {1, 2, 14, 25, 26, 50, 65, 74, 85, 98, 102, 125 };
   int buscado = 3;

   int resultado = busqueda.buscar(vector, buscado);
    //Arrays.sort(vector);
   assertEquals(-1, resultado);
}

@Test
public void buscar4() {
   BusquedaBinaria  busqueda = new  BusquedaBinaria();
   int[] vector = new int[] {1, 2, 14, 25, 26, 50, 65, 74, 85, 98, 102, 125 };
   int buscado = 3;

   int resultado = busqueda.buscar(vector, buscado);
    //Arrays.sort(vector);
   assertEquals(-1, resultado);
}

int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
int buscado = 8;
@Test
public void buscar5() {
   BusquedaBinaria  busqueda = new  BusquedaBinaria();
   int[] vector = new int[] { 10, 5, 3, 2, 10, 3, 1, 6, 2, 0 };
  int buscado = 8;
int resultado = busqueda.buscar(vector, buscado);
    //Arrays.sort(vector);
     assertEquals(-1, resultado);
}


}
