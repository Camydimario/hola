package testOrdenador;



import java.util.Arrays;
import java.util.function.BooleanSupplier;

/**
 * Ordenador que utiliza el algoritmo de ordenamiento por Selección.
 */
public class OrdenadorPorSeleccion {
    /* * post: reorganiza los elementos de vector de acuerdo al orden lineal <
         *   	definido para los números enteros.
         */
    // public void ordenar (int[] arreglo){
      // Arrays.fill(arreglo, 0);
    // }
    
    public static void ordenar(int [] arreglo){
   for(int i =0 ; i < arreglo.length- 1 ; i++ ){
    for(int j = i + 1 ; j < arreglo.length; j++ ){
   if(arreglo[i]> arreglo[j]){
    int auxiliar = arreglo[i];
    arreglo[i] = arreglo[j];
    arreglo[j] = auxiliar;
   }
    }

    }
    
    }

/**
 * @param args
 */
public static void main ( String [] args) {
 OrdenadorPorSeleccion s = new OrdenadorPorSeleccion();
 
    int [] seleccion = {1,3,6,7,9,2,0};
    
    System.out.println( "ordenar " );
    printArreglo(seleccion);
    OrdenadorPorSeleccion.ordenar(seleccion);
    System.out.println("Arreglo ordenado:");
        printArreglo(seleccion);
    }

    public static void printArreglo(int[] arreglo) {
      for (int i = 0; i < arreglo.length; i++) {
          System.out.print(arreglo[i] + " ");
      }
      System.out.println();
  }

    public BooleanSupplier OrdenadorPorSeleccion(int[] arreglo2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'OrdenadorPorSeleccion'");
    }

  
}



//test

package testOrdenador;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PruebaOrdenador {

@Test

public void ordenado() {
    OrdenadorPorSeleccion arreglo= new OrdenadorPorSeleccion ();
    int[] arreglo0 = new  int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   Assertions.assertFalse(arreglo.OrdenadorPorSeleccion(arreglo0)); 
 
}

   @Test
    public void testOrdenarArregloDesordenado() {
        OrdenadorPorSeleccion arreglo = new OrdenadorPorSeleccion ();
        
        int[] arreglo1 = { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
        OrdenadorPorSeleccion.ordenar(arreglo1);
        int[] arregloEsperado = {1, 12, 25, 54, 65,68 , 76 ,76 ,86 ,87};
        assertArrayEquals(arregloEsperado, arreglo1);
    }
   
    @Test

    public void ordenados() {
        OrdenadorPorSeleccion arreglo = new OrdenadorPorSeleccion ();
        int [] arreglo2 = new int [] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      Assertions.assertTrue( arreglo.OrdenadorPorSeleccion(arreglo2));
 }

 @Test

    public void deordenados() {
        OrdenadorPorSeleccion arreglo = new OrdenadorPorSeleccion ();
        int [] arreglo2 = new int [] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
      Assertions.assertFalse( arreglo.OrdenadorPorSeleccion(arreglo2));
 }


@Test
    public void testOrdenarArregloDesordenados() {
        OrdenadorPorSeleccion arreglo = new OrdenadorPorSeleccion ();
        
        int[] arreglo1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        OrdenadorPorSeleccion.ordenar(arreglo1);
        int[] arregloEsperado = {1, 2, 3, 4, 5,6 , 7, 8 , 9, 10};
        assertArrayEquals(arregloEsperado, arreglo1);
    }
   




}
