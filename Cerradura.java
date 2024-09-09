public class Cerradura {
  //atributos 
private int claveDeApertura; 
private int cantidadDeFallosConsecutivosQueLaBloquean;
private boolean abierta;
private boolean bloqueada;
private int aperturasExitosas;
private int aperturasFallidas;
private int fallosConsecutivos;

/** pre: La cerradura que deseamos tener esta compuesta por una clave
 * de apertura con una cantidad de fallos que la bloquean
 * @param clave que la bloquean
 * 
 * post: 
 * 
 * 
 * 
 * @param claveDeApertura
 * @param cantidadDeFallosConsecutivosQueLaBloquean
 */
  //constructor
  public Cerradura(int claveDeApertura,
    int cantidadDeFallosConsecutivosQueLaBloquean) {
        this.claveDeApertura = claveDeApertura;
       this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
         this.abierta = false;
         this.bloqueada = false;
         this.aperturasExitosas = 0;
        this.aperturasFallidas = 0;
        this.fallosConsecutivos = 0;
    }
/**
 * pre: introducir la calve de apertura para poder abrir la cerradura
 * post: la cerradura se abre
 * 
 * @param clave
 * @return
 */
     public boolean abrir (int clave) {
        
        if(clave == claveDeApertura) {
        this.abierta = true;
        this.aperturasExitosas++;
        this.fallosConsecutivos = 0;
        return true;
       } else {
        this.aperturasFallidas++;
        this.fallosConsecutivos++;
        if (this.fallosConsecutivos == this.cantidadDeFallosConsecutivosQueLaBloquean) {
            this.bloqueada = true;
        }
    } return false;
}

/**
 * pre: la calve de apertura introducida fue incorrecta 
 * post: la cerradura se cerro
 * 
 */
    //   if (cantidadDeFallosConsecutivosQueLaBloquean < 2 ) {
        //this.bloqueada = true;}
         public void cerrar(){
        if (this.bloqueada) 
            this.abierta = false;
    }
/**
 * pre: se verifica si la cerradura esta abierta 
 * @return la cerradura esta abierta
 * 
 */
    
     public boolean estaAbierta(){
        return this.abierta;
    }

/**
 * pre: se verifica si la cerradura esta cerrada
 * @return la cerradura esta cerrada
 * 
 */

public boolean estaCerrada(){
    return !this.bloqueada;
}
/**
 * pre: se verifica si la cerradura fue bloqueada
 * @return la cerradura  fue bloqueada
 * 
 */

public boolean fueBloqueada(){
    return this.bloqueada;
}

/**
 * pre: se verifica  la cantidad de aperturas sin bloquear la cerradura
 * @return la cantidad de aperturas Exitosas
 * 
 */
public int contarAperturasExitosas(){
    return this.aperturasExitosas;
}
/**
 * pre: se verifica  la cantidad de aperturas fallidas
 * @return la cantidad de aperturas fallidas
 * 
 */
 

public int contarAperturasFallidas(){
    return this.aperturasFallidas;
}
public static void main(String[] args){
    
        Cerradura cerradura = new Cerradura(123, 2);
        
        // Intento de apertura exitosa
        if (cerradura.abrir(123)) {
            System.out.println("La cerradura se abrió");
        } else {
            System.out.println("La cerradura no se abrió");
        }
        
        // Verificar estado
        System.out.println("¿La cerradura está abierta? " + cerradura.estaAbierta());
        System.out.println("¿La cerradura fue bloqueada? " + cerradura.fueBloqueada());
       

     
}

}
