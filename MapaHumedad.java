//arreglar dimension

public class MapaHumedad {
//atributos

    private double[][] humedad;
    private int i;
    private int j;
    private double terreno;

    private int dimencionTerreno;

    public MapaHumedad() {
        this.dimencionTerreno = dimencionTerreno;
        this.i = i;
        this.j = j;
    }

    public void DimencionTerreno(double[][] humedad) {

        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                if (terreno > 0 && terreno < 100) {
                    if (humedad[i][j] == terreno) {
                        terreno = humedad[i][j];
                    }

                }
            }

        }

    }

    public int AlmacenarMuetras(double[][] humedad) {
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                return humedad.length;
            }

        }
        return 0;
    }

    public double Promedio(double [] [] humedad) {

        double suma = 0;
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                suma += humedad[i][j];
            }

        }
        return suma / humedad.length;
    }


    public double MinimoHumedad(double [] [] humedad) {
        double minimo = humedad[0][0];
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                if (humedad[i][j] < minimo) {
                    minimo = humedad[i][j];
                }

            }

        }
        return minimo;
    }

    public double MaximoHumedad( double [] [] humedad) {
        double maximo = humedad[0][0];
        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                if (humedad[i][j] > maximo) {
                    maximo = humedad[i][j];
                }

            }

        }
        return maximo;
    }

    public double PromedioHumedadTerreno(double [] [] humedad) {
        double suma = 0;

        for (int i = 0; i < humedad.length; i++) {
            suma += humedad[i][0];
        }
        for (int j = 0; j < humedad[i].length; j++) {
            suma += humedad[0][j];
        }
        return suma / humedad.length;

    }

    public double CantidadMuestrasRango(double [] [] humedad) {
        double rango = 0;

        for (int i = 0; i < humedad.length; i++) {
            for (int j = 0; j < humedad[i].length; j++) {
                if (humedad[i][j] == rango) {
                    rango++;
                }
            }

        }
        return rango;
    }

/*
    public double CantidadMuestrasRango(double minimo, double maximo) {
          double rango = 0;

          for (int i = 0; i < humedad.length; i++) {
              for (int j = 0; j < humedad[i].length; j++) {
                  if (humedad[i][j] < minimo && humedad [i][j] > maximo) {
                      rango++;
                  }
              }

          }
          return rango;
      }
*/

      public static void main (String [] args) {

    MapaHumedad mapita = new MapaHumedad();
    double [] [] mapa = {
            {1, 2, 0, 5},
            {2, 3, 0, 7},
            {1, 22, 3,9 },
            {1, 22, 2 , 10},
            {1, 22, 33, 3},
            {1, 22, 5, 5},


    };



    System.out.println(mapita.AlmacenarMuetras(mapa));
    System.out.println(mapita.dimencionTerreno);
    System.out.println(mapita.CantidadMuestrasRango(mapa));
    System.out.println(mapita.MaximoHumedad(mapa));
    System.out.println(mapita.MinimoHumedad(mapa));
    System.out.println(mapita.Promedio(mapa));
    System.out.println(mapita.PromedioHumedadTerreno(mapa));




}

    // test
package testHumedad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebasHumedad {

@Test

public void LasMuestrasSonNegativas (){

double [] [] muestras = {

{1,1,1,1},
{1,1,1,1},
{1,1,1,1},
};

MapaHumedad a = new MapaHumedad ();
 Assertions.assertEquals(a.AlmacenarMuetras(muestras), -1);
}
//dara error

@Test 

public void ElMinimoDeHumedadNoPuedeSerNegativo () {

double [] [] minimo = {

{1,0,2},
{2,6,3},
{5,1,10},

};

MapaHumedad b = new MapaHumedad ();
Assertions.assertEquals (b.MinimoHumedad(minimo), -1);
Assertions.assertTrue(b.MinimoHumedad(minimo), -1);
}
//daria falso






}
    




}
