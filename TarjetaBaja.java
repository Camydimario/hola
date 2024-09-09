public class TarjetaBaja {
 
 //atributos
 
    private double saldo;
 private int viajesTotales;
    private int viajesEnColectivo;
    private int viajesEnSubte;


/**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
        if (saldoInicial < 0) 
        this.saldo = saldoInicial;
        this.viajesTotales = 0;
        this.viajesEnColectivo = 0;
        this.viajesEnSubte = 0;
    //saldo = saldoInicial
    
    }

    
    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
        return this.saldo;

     } 

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {

        if (monto > 50 && monto < 100) {
            System.out.println( " el monto debe ser mayor a 5o y menos a 100");
        } this.saldo += monto;
    //solamente saldo +=monto
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() {
        if (this.saldo < 21.50){
            this.saldo -= 21.50;
        } 
        this.viajesTotales++;
        this.viajesEnColectivo++;
     }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() { 
        if (this.saldo < 19.50){
            this.saldo -= 19.50;
        } 
         this.viajesTotales++;
        this.viajesEnColectivo++;
    } 

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
        return this.viajesTotales;
     } //solamente return viajesEnSubte + viajesEnColectivo

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
        return this.viajesEnColectivo;
     }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() { 
        return this.viajesEnSubte;
    }

}
