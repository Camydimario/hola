package testMesclav2;
public class AlgoritmoMezclav2 {
public static int[] mezclar(int [] A , int [] B) {  
// Crear nuevos arreglos C y D
 int[] C = new int[A.length + B.length];
int[] D = new int[A.length + B.length];

for (int i = 0; i < A.length; i++) {
    C[i] = A[i];
}
for (int i = 0; i < B.length; i++) {
    C[A.length + i] = B[B.length - 1 - i];
}

int i = 0;
        
       
int j = C.length - 1;
        
       
int k = 0;

  
while (k < C.length) {
 if (C[i] < C[j]) {
 D[k] = C[i];
 i++;
} else {
D[k] = C[j];
j--;}
k++; 
}
            
return D;
}

public static void main(String[] args) {
        
       
    int[] A = {1, 3, 5, 7};
            
           
    int[] B = {2, 4, 6, 8};
    
            
    
    int[] resultado = mezclar(A, B);
    System.out.println(
        "Arreglo combinado y ordenado: ");
        for (int num : resultado) {
            System.out.print(num + " ");


}

}
}





    
