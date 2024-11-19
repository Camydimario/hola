package testMezcla;

import java.util.Arrays;

public class AlgoritmoDeMezcla {

public static int[] mezclar(int[] A, int[] B) {
                
int[] V = new int[A.length + B.length];
int i = 0;
int j = 0;
int k = 0;

while (i < A.length && j < B.length) {
if (A[i] <= B[j]) {
    V[k] = A[i];
    i++;
} 
else {
    V[k] = B[j];
    j++;
}
k++;

while (i < A.length) {
    V[k] = A[i];
    i++;
    k++;
}

while (j < B.length) {
    V[k] = B[j];
    j++;
    k++;
}
}
return V;
}


public static void main(String[] args) {
AlgoritmoDeMezcla algoritmo = new AlgoritmoDeMezcla();

int[] A = {1, 3, 5, 7};
    
   
int[] B = {2, 4, 6, 8};

System.out.println("Arreglo A: ");
for (int num : A) {
    System.out.print(num + " ");
}
System.out.println();

System.out.println("Arreglo B: ");
for (int num : B) {
    System.out.print(num + " ");
}
System.out.println();
 
System.out.println();

int[] resultado = mezclar(A,B);

System.out.println("Arreglo mezclado: ");
for (int num : resultado) {
System.out.print(num + " ");
}
}

}
