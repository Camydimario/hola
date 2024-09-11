//ver lo de recuperar y terminar el main
public class PlanillaDeNotas {
    private int[] alumnos;
    private int[] notas;
    private boolean estaAprobado;

    //atributo
    public PlanillaDeNotas() {
        this.alumnos = new int[30];
        this.notas = new int[30];
    }
    /* pre: se realiza una clase que eztablezca la cantidad de
        alumnos dentro de un aula.
    * post: la cantidad es de 30 personas
    *  @return cantidad.
    * *
    */

    public int CantidadDeAlumnos() {
        return alumnos.length;
    }


    /*
     * pre: se pretende cargar las notas de los alumnos,
     * las notas deben ser  mayores a cero y menores a 10
     *
     * post: los alumnos aprobados son aquellos que la nota sean mayor a 4
     *
     * */

    public void CargarNotas(int[] notas, boolean estaAprobado) {
        for (int i = 0; i < notas.length; i++) {
            if ((notas[i] > 0) || (notas[i] < 10)) {
                if (notas[i] > 4) {
                    estaAprobado = true;
                } else {
                    estaAprobado = false;
                }

            }
        }
    }

    /*
     * pre: los alumnos que hayan desaprobados, necesitan recuperar
     * post : ña nota para aprobar el recuepratorio debe ser mayor a 7
     *
     * */

       public int RecuperarNotas ( int[] notas){
            int recuperar = 7;
            for (int i = 0; i < notas.length; i++) {

                if (notas[i] > recuperar) {
                    notas[i] = recuperar;
                    recuperar++;
                }

            }
            return recuperar;
        }


    /*
     * pre: Se necesita buscar la nota maxima
     * post: se obtiene la nota maxima
     * */
    public int NotaMaxima(int[] notas) {
        int maximo = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];
            }
        }
        return maximo;

    }

    /*
     * pre: Se necesita buscar la nota minima
     * post: se obtiene la nota minima
     * */
    public int NotaMinima(int[] notas) {
        int minima = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < minima) {
                minima = notas[i];
            }
        }
        return minima;
    }

    public double NotaPromedio(int[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    /*
     * pre: se propone contar la canidad de alumnos aprobados
     * post: se obtiene la cantidad de alumnos aprobados
     *
     *
     *  */
    public int ContarAprobados(int[] alumnos) {
        int aprobados = 0;

        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i] > 4) {
                aprobados++;
            }
        }

        return aprobados++;
    }


    public static void main(String[] args) {
        int[] Nota = {4, 7, 5, 8, 3};
        int[] alumnos = {25};

        PlanillaDeNotas plani = new PlanillaDeNotas();


    }
}

//ver si esto va o no
/*
*   public int RecuperarNotas(int indice) {
        if (indice < 0 || indice >= this.notas.length) {
            throw new RuntimeException("Índice fuera de rango");
        }
        return this.notas[indice];
    }
*
*
* */
