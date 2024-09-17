import jdk.dynalink.CallSiteDescriptor;

public class Cadena {
    private char[] cadena;
    private boolean esVocal;

    public Cadena(char[] ac) {
        this.cadena = ac;
    }

    public Cadena(String string) {
        this.cadena = string.toCharArray();

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.longitud(); i++)
            s += this.cadena[i];
        return s;
    }

    public int longitud() {
        return this.cadena.length;
    }

    public boolean estaVacia() {
        return this.longitud() == 0;
    }

    public Cadena concatenar(Cadena c) {
        int newLength = c.longitud() + this.longitud();

        char[] nuevaCadena = new char[newLength];
        for (int i = 0; i < this.longitud(); i++) {
            nuevaCadena[i] = this.cadena[i];
            nuevaCadena[newLength - i - 1] = c.cadena[c.longitud() - 1 - i];
        }
        return new Cadena(nuevaCadena);
    }

    public boolean sonIguales(Cadena c) {
        if (this.cadena.length != c.longitud()) {
            return false;
        }
        if (this.cadena.length != c.longitud()) {
            return false;
        }
        return true;
    }

    /*
     * public boolean sonIguales(cadena otro) {
     * if(this.longitud() == otra.longitud())
     * {  for(int i = 0; i < this.longitud; i ++ ) {
     *  if(this.cadena[i] != otra.cadena[i]
     *      return false
     *  }
     * return true;
     * }
     *
     * return false;
     *
     * otra forma directo=
     * if(this.longitud () != otra.longitud()) {
     * return false;
     *
     * */
      public boolean contiene (char a) {
          for (int i = 0; i < this.longitud(); i++) {
              if (this.cadena[i] == 0) {
                  return true;
              }
          }
          return false;
      }

    public Cadena consonantes (Cadena c) {
       Cadena vocales = new Cadena("aeiou");
       int longitudNuevaCadena = 0;
        for (int i = 0; i < this.longitud(); i++) {
            if (!vocales.contiene(this.cadena[i])){
                longitudNuevaCadena++;
            }
        }
        char[] nuevaCadena = new char[longitudNuevaCadena];

        int nuevaCadenaIndice = 0;
        for (int i = 0; i < this.longitud(); i++) {
            if (!vocales.contiene(this.cadena[i])){
                nuevaCadena[nuevaCadenaIndice] = this.cadena[i];
                   nuevaCadenaIndice++;
            }

        }
        return new Cadena(nuevaCadena);
    }
  public Cadena invertir( Cadena c){
      char auxiliar;
      int tamaño= this.cadena.length;
    for(int i = 0; i < (tamaño/2)-1; i++){
        auxiliar = this.cadena[i];
        this.cadena[i] = this.cadena[tamaño - 1 - i];
        this.cadena[tamaño - 1 - i] = auxiliar;
    }

      return c;
  }

  public boolean TrasliterarContiene ( char acentos){
      for (int i = 0; i < this.longitud(); i++) {
          if (this.cadena[i] == acentos) {
              return true;
          }
      }
      return false;
  }

  public Cadena Trasliterar (Cadena c ) {
       Cadena acentos = new Cadena("Sin acentos");
      int longitudNuevaCadena = 0;
      for (int i = 0; i < this.longitud(); i++) {
          if (!acentos.contiene(this.cadena[i])){
              longitudNuevaCadena++;
          }
      }
      char[] nuevaCadena = new char[longitudNuevaCadena];

      int nuevaCadenaIndice = 0;
      for (int i = 0; i < this.longitud(); i++) {
          if (!acentos.contiene(this.cadena[i])){
              nuevaCadena[nuevaCadenaIndice] = this.cadena[i];
              nuevaCadenaIndice++;
          }

      }
      return new Cadena(nuevaCadena);
      }


    /*public Cadena consonantes(Cadena c) {
        char[] nuevaCadena = new char[c.longitud()];
        int indice = 0;
        for (int i = 0; i < c.longitud(); i++) {
            char caracter = c.cadena[i];
            if (!esVocal(caracter)) {
                nuevaCadena[indice++] = caracter;
            }
        }
        char[] resultado = new char[indice];
       return new Cadena(resultado);
}
*/

public boolean esPalindromo (Cadena c){
   char auxiliar;
    int palindromo = this.cadena.length;

    for (int i = 0; i < (palindromo/2)-1; i++) {
        auxiliar = this.cadena[i];
        this.cadena[i] = this.cadena[palindromo - 1 - i]; {
            this.cadena[palindromo - 1 - i] = auxiliar;
             return true;
        }
    }
return false;
}
public boolean esPalindromo2 (Cadena c) {
    Cadena Palindromo = new Cadena("Palindromo");
    int longitudNuevaCadena = 0;
    for (int i = 0; i < this.longitud(); i++) {
        if (Palindromo.contiene(this.cadena[i])) {
            longitudNuevaCadena++;
        return true;
        } else {
            return false;
        }


    }
    return true;
}


    public static void main (String[]args){
       Cadena x = new  Cadena("osos");
        Cadena y = new  Cadena("gato");
       Cadena otra = new Cadena("hola");
        Cadena otra2 = new Cadena("holaa");
        Cadena otra3 = new Cadena("gato");
        Cadena otra4 = new Cadena("Nicolás");
        Cadena otra5 = new Cadena("radar");
        Cadena otra6 = new Cadena("reconocer");
        System.out.println(x.concatenar(y));
        System.out.println(x.sonIguales(y));
        System.out.println(x.estaVacia());
        System.out.println(x.longitud());
        System.out.println(x.esVocal);
        System.out.println(otra.sonIguales(otra2));
        System.out.println(otra.sonIguales(otra3));
        System.out.println(x.consonantes(x));
        System.out.println(otra3.invertir(otra3));
        System.out.println(otra4.Trasliterar(otra4));
        System.out.println(otra5.esPalindromo(otra5));
        System.out.println(otra6.esPalindromo2(otra6));
    }


}


