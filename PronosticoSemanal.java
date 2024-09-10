/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {

    private double[] temperaturas;

    /**
     * post: deja inicializadas las temperaturas del pronóstico en 25 ºC.
     */

     //constructor
    public PronosticoSemanal() {

   	 temperaturas = new double[7];
   	 for (int i = 0; i < temperaturas.length; i++) {
   		 temperaturas[i] = 25.0;
   	 }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7, 
     *       siendo 1 lunes y 7 domingo. 
     * post: devuelve la temperatura pronosticada para el día indicado.
     */
    public double obtenerTemperatura(int dia) {
        //es o no &&
        if(dia < 1 && dia > 7 ){
            throw new Error ( "dia invalido"); }
        return temperaturas [dia - 1];
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7, 
     *       siendo 1 lunes y 7 domingo.
     * post: cambia la temperatura pronosticada para el día indicado.
     */
    public void pronosticarTemperatura(int dia, double temperatura) {
          if(dia < 1 && dia > 7 ){ 
            temperaturas[dia - 1] = temperatura;
    }
    }

    /**
     * post: devuelve el promedio de las temperaturas pronosticadas.
     */
    public double calcularPromedioDeTemperaturas() {
        double suma= 0;
      for (int i = 0; i < temperaturas.length; i++) {
    suma += temperaturas[i];
    }
        return suma / temperaturas.length;
    
    }

    /**
     * post: devuelve la máxima temperatura pronosticada.
     */
    public double buscarMaximaTemperatura() {
     
       double maxima = temperaturas[0];

     for (int i = 0; i < temperaturas.length; i++) {
        if ( temperaturas [i]> maxima) {
            maxima = temperaturas[i];
        }
             
    }
        return maxima;
    }
   

  
    /**
     * post: devuelve la mínima temperatura pronosticada.
     */
    public double buscarMinimaTemperatura() {
        double minima = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {
           if ( temperaturas [i] < minima) {
               minima = temperaturas[i];
           }
         }
           return minima;
       }

    public static void main(String[] args){
        PronosticoSemanal semanita = new PronosticoSemanal();
        
        semanita.pronosticarTemperatura(4, 30);
        System.out.println(semanita.obtenerTemperatura(4));
    
    
        //promedio
    semanita.calcularPromedioDeTemperaturas();
     System.out.println("calcular promedio" + semanita.calcularPromedioDeTemperaturas());
    

//maximo
System.out.println(" maxima temperatura" +  semanita.buscarMaximaTemperatura());
//minimo
System.out.println("minima temperatura" +  semanita.buscarMinimaTemperatura());
}
}
