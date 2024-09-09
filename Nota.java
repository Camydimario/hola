public class Nota {
 /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */

     private int valor;
    //constructor
    public Nota(int valorInicial) {
        if (valorInicial <0 || valorInicial > 10);
    
        this.valor = valorInicial;
    }
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */

     //metodos
    public int obtenerValor() { 
        return this.valor ;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
        return this.valor > 4;
    } 
      
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
        return this.valor < 4;
     }
    }

