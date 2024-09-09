public class Ticket {
  // atributo
    /**
     * post: el Ticket se inicializa con importe 0.
     */
    private double precio;
    private int cantidadProductos;
    private boolean abierto;
    
    //constructor
    public Ticket() { 
       if (cantidadProductos > 0 && precio > 0) {
        System.out.println ("el tickets se abrio con exito");
       }
       this.precio = 0;
       this.cantidadProductos= 0;
       this.abierto = true;

    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     *       de productos y su precio unitario.
     */
    //metodos
    public void agregarItem(int cantidad, double precioUnitario) {
        if(cantidad < 0 || precioUnitario < 0 ) {
            
        } 
        
        if (!this.abierto) {
            throw new IllegalStateException("El ticket está cerrado");
        }
        this.precio += cantidad * precioUnitario;
        this.cantidadProductos += cantidad;
    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) { 
        if (porcentaje < 0 || porcentaje > 100) {
            this.precio *= (1 - porcentaje / 100);
        }

      }
    
    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() { 
        return this.precio;
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
        return this.precio;
    
     }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
        return this.cantidadProductos;
     } 
}
