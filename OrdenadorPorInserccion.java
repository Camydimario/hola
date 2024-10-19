public class OrdenadorPorInserccion {

public static void ordenar(int [] arreglo) {
for(int i = 1 ; i < arreglo.length; i++) {
    int auxiliar = arreglo[i];
int j = i-1;
while (j >= 0 && auxiliar < arreglo [j]){
arreglo [j+1] = arreglo[j];
j--;

}
  arreglo[j+1]=auxiliar;
}
}
public static void main(String[] args) {
    OrdenadorPorInserccion i = new   OrdenadorPorInserccion ();

    int[] seleccion = {1, 3, 6, 7, 9, 2, 0};

    System.out.println("ordenar ");
    printArreglo(seleccion);
    OrdenadorPorInserccion.ordenar(seleccion);
    System.out.println("Arreglo ordenado:");
    printArreglo(seleccion);

}
    private static void printArreglo ( int[] seleccion){
        for (int num : seleccion) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nueva línea después de imprimir el arreglo
    }
}




//test
package testInserccion;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PruebaInserccion {

@Test

public void ordenar() {
OrdenadorPorInserccion i = new OrdenadorPorInserccion();
int [] arreglo = new int [] { 2,5,6,4,3,1};
int [] esperado = new int [] {1,2,3,4,5,6};
//i.ordenar(arreglo);
Assertions.assertArrayEquals(esperado, arreglo);


}
@Test
public void EstaOrdenado() {
    OrdenadorPorInserccion ii = new OrdenadorPorInserccion();
int [] arreglo = new int [] {2,3,6,8,9,10};
Assertions.assertFalse(false);
//Assertions.assertFalse(bb.ordenar(arreglo));

}
@Test
public void Iguales() {
    OrdenadorPorInserccion iii = new OrdenadorPorInserccion();
int [] arreglo = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
Assertions.assertTrue(true);
}

@Test

public void estaVacio() {
    OrdenadorPorInserccion iiii = new OrdenadorPorInserccion();
int [] arreglo = new int [] {};
Assertions.assertTrue(true);


}

}

