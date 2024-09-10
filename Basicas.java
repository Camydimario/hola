public class Basicas {
    
    public int contarValores(int [] a ) {
     return a.length;
    
    }
  
    public int contarValoresPares(int [] a ) {
      int contador = 0;
      for (int i = 0; i< a.length; i++) {
        if (a [i] % 2 == 0) {
            contador++;

        }
      }
       return contador++;
       }

       public int contarValoresPositivos(int [] a ) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    public int contarValoresEnPosicionesPares(int [] a ) {
        int contador = 0;
        for (int i = 0; i < a.length; i += 2) {
            contador++;
        }
        return contador;
    }

//int resultado = a.leng /2
// if ( a.length % 2 != 0) 
// resultado += 1
//return resultado 
//int resultado = a.leng /2


public void InvertirArreglo( int [] a) {
    int auxiliar;
    int tam = a.length;
    for (int i = 0;   i <(tam/2) - 1 ; i++) {
        auxiliar = a[i];
        a[i] = a [tam -1 - i];
        a[tam - 1 - i] = auxiliar;
    }
}
// siempre es asi el intercambio  
 
// para buscar extremos siempre tendo que recorrer el
//arreglo desdde cero por eso utilizo a[0];
public int BuscarMinimo( int [] a) {
 int minimo = a[0];
 
 for(int i = 0 ; i < a.length; i++){
    if(a[i]< minimo) {
        minimo = a[i];
    }
    
 } 
     return minimo;
}

public int BuscarMaximo( int [] a) {
    int maximo = a[0];
    
    for(int i = 0 ; i < a.length; i++){
       if(a[i] > maximo) {
        maximo = a[i];
       }
   
    } 
    return maximo;
   }
   



public static void main(String[] args){
    int [] v = {23, 5 , 6, 9, 4, 43};
    
    Basicas ba = new Basicas();
    System.out.println(ba.contarValores(v));
    System.out.println(ba.contarValoresPares(v));
    System.out.println (ba.contarValoresPositivos(v));
    System.out.println( ba.contarValoresEnPosicionesPares(v));
    System.out.println("Contar valores" + ba.contarValores(v));
    
    //invertir 
    ba.InvertirArreglo(v);
    System.out.println (java.util.Arrays.toString(v));
    
    //buscar minimo 
    ba.BuscarMinimo(v);
    System.out.println("buscar minimo" + ba.BuscarMinimo(v));

     //buscar maximo

       ba.BuscarMaximo(v);
      System.out.println("buscar maximo" + ba.BuscarMaximo(v));

}
}
