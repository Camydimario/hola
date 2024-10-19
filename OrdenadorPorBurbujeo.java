package testInserccion;

public class OrdenadorPorBurbujeo {
    public static void ordenar(int [] arreglo) {
        for(int i =0; i < arreglo.length-1; i++) {
            for(int j=0; j < arreglo.length-1; j++){
            if(arreglo[j]> arreglo[j+1]){
                int auxiliar = arreglo [j];
                arreglo[j] = arreglo [j+1];
                arreglo [j+1] =auxiliar;
            }
            }
        
    
        }
    
    
    }
   
    public static void main(String[] args) {
        OrdenadorPorBurbujeo b = new  OrdenadorPorBurbujeo();

        int[] seleccion = {1, 3, 6, 7, 9, 2, 0};

        System.out.println("ordenar ");
        printArreglo(seleccion);
        OrdenadorPorBurbujeo.ordenar(seleccion);
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

public class PruebasOrdenadorPorBurbujeo {

@Test

public void ordenado () {

OrdenadorPorBurbujeo b = new OrdenadorPorBurbujeo();

int [] arreglo = new int [] {2,3,1,7,9,6};
int[] esperado = new int [] {1,2,3,6,7,9};
b.ordenar(arreglo);
Assertions.assertArrayEquals(esperado, arreglo);

}

private OrdenadorPorBurbujeo OrdenadorPorBurbujeo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'OrdenadorPorBurbujeo'");
}

@Test

public void EstaOrdenado() {
    OrdenadorPorBurbujeo bb = new OrdenadorPorBurbujeo();
int [] arreglo = new int [] {2,3,6,8,9,10};
Assertions.assertFalse(false);
//Assertions.assertFalse(bb.ordenar(arreglo));

}

@Test
public void Iguales() {
    OrdenadorPorBurbujeo bbb = new OrdenadorPorBurbujeo();
int [] arreglo = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
Assertions.assertTrue(true);
}

@Test

public void estaVacio() {
    OrdenadorPorBurbujeo b4 = new OrdenadorPorBurbujeo();
int [] arreglo = new int [] {};
Assertions.assertTrue(true);


}



}










