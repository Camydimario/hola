
/**
 * pre: se comienza el expendedor de pasajes realizando ventas 
 * segun el boleto de destino y el kilometro a realizar
 * 
 */

public class ExpendedorDePasajes {
    
    //atributos 
   
    private double precioPorKm;
    private int precio;
    private int DistanciaMaxima;
    private int pasajesVendidos;
    private int DistanciaTotal;


    //constructor    
    /* pre: Las ventas de pasajes tienen un precio segun
    el kilometro a realizar
    post: se asigno un pasaje con un kilomentro determinado
    */ 
    
    public ExpendedorDePasajes(double precioPorKm) {
        this.precioPorKm = precio;
        this.pasajesVendidos = 0;
        this.DistanciaTotal= 0;
        this.DistanciaMaxima = 0;
    }
    /*-
     * pre: la venta de pasajes se realiza segun la distancia 
     * en km establecidas, 
     * 
     * post: se vende el pasaje
     * @return el precio del pasaje
     * 
     */
    public double venderPasaje(double distanciaEnKm) {
        double precio = distanciaEnKm * precioPorKm;
        pasajesVendidos++;
        DistanciaTotal += distanciaEnKm;
        if (distanciaEnKm > DistanciaMaxima) {
           // DistanciaMaxima = distanciaEnKm;
        }
        return precio;
        
    } 
    /**
    * Vende una cantidad de pasajes para una distancia determinada.
    * 
    * @param cantidad La cantidad de pasajes.
    * @param distanciaEnKm La distancia en kilómetros.
    * @return El precio total de los pasajes.
    */
        
      public double venderPasajes(int cantidad, double distanciaEnKm) {
        double precioTotal = 0;
        for (int i = 0; i < cantidad; i++) {
            precioTotal += venderPasaje(distanciaEnKm);
        }
        return precioTotal;
        } 
        
        /**
     * Devuelve la cantidad de pasajes vendidos.
     * 
     * @return La cantidad de pasajes vendidos.
     */
        public int contarPasajesVendidos(){
            return pasajesVendidos;
        }
     /**
     * Devuelve la distancia máxima vendida.
     * 
     * @return La distancia máxima vendida.
     */
    
        public double obtenerDistanciaMaxima()
    {
        return DistanciaMaxima;
    }
       
    
    /**
     * Calcula la distancia promedio vendida.
     * 
     * @return La distancia promedio vendida.
     */
    public double calcularDistanciaPromedio(){
        if (pasajesVendidos == 0) {
            return 0;
        }
        return DistanciaTotal / pasajesVendidos;}


      /**
        * Calcula la venta total.
        * 
        * @return La venta total.
        */
      
        public double calcularVentaTotal(){
            return DistanciaTotal * precioPorKm;
        
        }
    
    
 
            public static void main(String[] args) {
                // Crear un expendedor de pasajes con un precio por kilómetro de 0.5
                ExpendedorDePasajes expendedor = new ExpendedorDePasajes(0.5);
           double precio = expendedor.venderPasaje(100);
           System.out.println("Precio del pasaje : " + precio );
           
           //precio total
          double precioTotal = expendedor.venderPasajes(2, 5000);
          System.out.println(" El total de los pasajes es " + precioTotal );
          //venta de pasajes 

          int pasajesVendidos = expendedor.contarPasajesVendidos();
          System.out.println("Pasajes Vendidos"+ pasajesVendidos);

        //cantidad de distancai maxima recorrida
          double DistanciaMaxima= expendedor.obtenerDistanciaMaxima();
          System.out.println("Distancia Maxima"+ DistanciaMaxima);
          
          //distancia promedio vendida
          double calcularDistanciaPromedio = expendedor.calcularDistanciaPromedio();
          System.out.println("Distancia Promedio"+ calcularDistanciaPromedio);
          
          //venta totales vendidas
          double calcularVentaTotal = expendedor.calcularVentaTotal();
          System.out.println("Venta Total"+ calcularVentaTotal);

            }
    
        }
    
