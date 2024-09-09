public class Tragamonedas {
    class Tambor {

        private int posicion;
    
        /**
         * post: inicialmente el Tambor está en la posición 1.
         */
        public Tambor() {
    
            posicion = 1;
        }
    
        /**
         * post: devuelve el número de posición en la que se
         *       encuentra el Tambor. Es un valor comprendido
         *       entre 1 y 8.
         */
        public int obtenerPosicion() { 
    
            return posicion;
        }
    
        /**
         * post: hace girar el tambor y luego se detiene en
         *       una posición comprendida entre 1 y 8.
         */
        public void girar() { 
    
            /* provee un número aleatorio en el rango [0.0, 1.0) */
            double aleatorio = Math.random();
    
            posicion = (int) (aleatorio * 8) + 1;
        }
    }
    
    class Tragamonedas {

        /**
         * post: los 3 Tambores del Tragamonedas están en la posición 1.
         */
        public Tragamonedas() {
            this.posicion = 1;
            for(int i = 0; i < posicion; i ++){
                this.tambores[i] = new Tambor();
            }
        
        }
    
        /**
         * post: activa el Tragamonedas haciendo girar
         *       sus 3 Tambores.
         */
        public void activar(double aleatorio) {
           if( aleatorio == posicion ) {
            for (int i =0; i < posicion ; i ++) {
                this.tambores[i].girar();
                }
            }
           }

         }
    
        /**
         * post: indica si el Tragamonedas entrega un premio
         *       a partir de la posición de sus 3 Tambores.
         */
        public  boolean entregaPremio() { 
            boolean entregaPremio= true;
            if(entregaPremio == posicion){
                for (int i =0; i < posicion ; i ++) {
                    if (this.tambores[i].posicion !=1){
                        entregaPremio = false;
                    }
                }
            }
        }
    /**
         * post: obtiene la posición del iésimo tambor del Tragamonedas
           pre:  i => 0; i < n (n = cantidad de tambores)
         */
        public int obtenerPosicionDelTambor(int i) {
            for( i = 0; i <posicion (posicion = tambores); i++){
               return tambores[i].posicion;
            }
    }
    public static void main(String[] args){
    
      Tragamoneda monedita = new Tragamonedas();
      monedita.activar(3);
      

      monedita.girar(3);
      System.out.prin("los tambores giraros" + girar());

      boolean entregaPremio = monedita.entregaPremio();
      System.out.prin("entregar premio");

      int obtenerPosicionDelTambor= monedita.obtenerPosicionDelTambor();
      System.out.prin("Obtener posicion del tambor" + posición);




    }

}


