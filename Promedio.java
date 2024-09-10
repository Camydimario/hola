public class Promedio {
    
    public int PromediarTodos(int [] a ) {
        int promedio = 0;
        for (int i = 0; i < a.length; i++) {
            promedio += a[i];
        }
        return promedio;
    }
       
    public int promediarValoresPares(int [] a ) {
        int promedio = 0;
       for (int i = 0; i< a.length; i++) {
       if (a [i] % 2 == 0) {
           promedio++;
       } 
   }
   return  promedio++;
   }
   // dps del for poner suma += a[i]
   
   public int promediarValoresPositivos(int [] a ) {
    int promedio = 0;
      for (int i = 0; i< a.length; i++) {
      if (a [i]  > 0) {
       promedio++;
      } 
   }
   return  promedio++;
   }
   
   
   
   public int promediarValoresEnPosicionPar(int [] a ) {
      int resultado= 0;
       for (int i = 0; i< a.length; i+=2) {
           resultado += a[i];
       } 
       return resultado;
   }


   public static void main(String[] args){
    int [] a = {2, 5 , 6, 9, 4, 10};
    int [] b = {3, 5 , 6, 8, 4, 7};
    
    Promedio prome = new Promedio();
    System.out.println(prome.PromediarTodos(a));
    System.out.println(prome.PromediarTodos(b));
    System.out.println(prome.promediarValoresPares(a));
    System.out.println(prome.promediarValoresPositivos(a));
    System.out.println(prome.promediarValoresEnPosicionPar(a));

}

}
