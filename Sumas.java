public class Sumas {
    
    public int sumarTodos(int [] a ) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }
       
public int sumarValoresPares(int [] a ) {
     int suma = 0;
    for (int i = 0; i< a.length; i++) {
    if (a [i] % 2 == 0) {
        suma++;
    } 
}
return  suma++;
}
// dps del for poner suma += a[i]

public int sumarValoresPositivos(int [] a ) {
    int  suma= 0;
   for (int i = 0; i< a.length; i++) {
   if (a [i]  > 0) {
    suma++;
   } 
}
return  suma++;
}



public int sumarValoresEnPosicionPar(int [] a ) {
   int resultado= 0;
    for (int i = 0; i< a.length; i+=2) {
        resultado += a[i];
    } 
    return resultado;
}
public int sumarValoresEnPosicionImpar(int [] a ) {
    int resultado= 0;
    for (int i = 1; i< a.length; i+=2) {
        resultado += a[i];
    } 
    return resultado;
}

public static void main(String[] args){
    int [] a = {2, 5 , 6, 9, 4, 10};
    int [] b = {3, 5 , 6, 8, 4, 7};
    
    Sumas sumita = new Sumas();
    System.out.println(sumita.sumarTodos(a));
    System.out.println(sumita.sumarTodos(b));
    System.out.println(sumita.sumarValoresPositivos(a));
    System.out.println(sumita.sumarValoresPares(a));
    System.out.println(sumita.sumarValoresEnPosicionPar(a));

}

}
