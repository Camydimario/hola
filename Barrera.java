
public class Barrera extends Actor {
    public Barrera() {
       // imagen de la barrera
       super(540, 540, 1); // Tamaño del mundo (9x9 celdas de 60x60)
      setImage(new GreenfootImage(60, 60)); // Tamaño de la barrera
        getImage().fill(); 
    }
}

  // Crear barreras fijas en posiciones específicas
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                Barrera barrera = new Barrera(); //  nueva barrera
                addObject(barrera, col * 60 + 30, row * 60 + 30); // Posicion barrera
            }
        }
    }
}
 public TPMundo() {    
        super(540, 540, 1); // Tamaño del mundo (9x9 celdas de 60x60)
  // Crear la barrera y añadirla al mundo
        Barrera barrera = new Barrera();
        addObject(barrera, 0, 0); // Posición inicial
    }
