import java.util.Arrays;

import static java.lang.System.*;

public class Estacionamiento3 {

    private int [] capacidad = {10};
    boolean estaLibre = true;
    private int numero;
    private int Lugaresdisponible;
 private int ocupado;
 private int desocupado;
private boolean [] lugar;
    private int LiberarEspacio;
 private double TotalOcupaciones;
    public void Estacionamiento3() {

        this.capacidad = capacidad;
        this.estaLibre = true;
        this.numero = numero;
        this.Lugaresdisponible = Lugaresdisponible;
  this.ocupado=ocupado;
  this.desocupado=desocupado;
  this.TotalOcupaciones=TotalOcupaciones;
this.LiberarEspacio=LiberarEspacio;
    this.lugar=lugar;

    }

    public int CantidadDeLugaresDisponibles() {
        int lugaresdisponible = 0;
        int i = 0;
        if ((capacidad[i] > 0) && (capacidad[i] < 10)) {
            capacidad[i] = Lugaresdisponible;

        }
        return lugaresdisponible;
    }

    public void OcuparEspacio(int numero) {

        for (int i = 0; i < capacidad.length; i++) {
            if (Lugaresdisponible == desocupado) {
                estaLibre = true;
                ocupado++;
            }

            out.println("ocupar el numero" + " = " +  ocupado );
        }
    }

public void DesocuparEspacio(int numero) {
    for (int i = 0; i < capacidad.length; i++) {
        if(Lugaresdisponible  < ocupado){
            estaLibre = true;
            desocupado++;
        }
    }
    out.println("desocupar el numero" + " = " +  desocupado);
}
    public double PorcentajeDeLugaresOcupados(){

        for (int i = 0; i < capacidad.length; i++) {
            TotalOcupaciones += capacidad[i];
        }
        return TotalOcupaciones/ capacidad.length * 100;
    }

    public int contarVecesOcupados() {
        int ocupado = 0;
        for (int i = 0; i <capacidad.length; ++i) {
            if(capacidad[i] == ocupado ) {
                ocupado ++;
            }
        }


        return ocupado;
    }


    public int ContarVecesDesocupados() {
        int desocupado = 0;
        for (int i = 0; i <capacidad.length; ++i) {
            if(capacidad[i] == desocupado ) {
                desocupado ++;
            }
        }

        return desocupado;
    }



    public int DevolverLugaresUsados(){
        for (int i = 0; i < capacidad.length; i++) {
            if(ocupado == LiberarEspacio) {
                LiberarEspacio ++;

            }
        }
        return LiberarEspacio;

    }


    public static void main(String[] args) {

        int [] c = {10};
        int [] numero = {1, 2 ,3, 4, 5, 6,7,8 ,9,10 };
        Estacionamiento3 estacionamientito = new Estacionamiento3();
        estacionamientito.CantidadDeLugaresDisponibles();
        System.out.println("Cantidad De Lugares Disponible");
         System.out.println(Arrays.toString(c) + estacionamientito.CantidadDeLugaresDisponibles());
        System.out.println("numeros" + Arrays.toString(numero));
        estacionamientito.OcuparEspacio(10);
        estacionamientito.OcuparEspacio(1);
        estacionamientito.OcuparEspacio(5);
        estacionamientito.DesocuparEspacio(7);
        estacionamientito.DesocuparEspacio(6);
        estacionamientito.DesocuparEspacio(2);
        estacionamientito.DesocuparEspacio(1);
        out.println("Veces ocupado" + "= "+ estacionamientito.contarVecesOcupados() + estacionamientito.ocupado);
        out.println("porcentaje " + estacionamientito.PorcentajeDeLugaresOcupados());
        out.println( "Devolver Lugares " + estacionamientito.DevolverLugaresUsados()+ estacionamientito.ocupado);
        out.println("Veces Desocupados" + "= "+ estacionamientito.ContarVecesDesocupados() + estacionamientito.desocupado);

    }





}
