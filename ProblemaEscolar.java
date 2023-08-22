public class ProblemaEscolar {

    static private float promedioAsignatura(int numeroAsignatura, Alumno[] alumnos)
    {
        float promedio = 0;
        for(int i=0; i<alumnos.length; i++)
            promedio += alumnos[i].getNotaAsignatura(numeroAsignatura);
        return promedio/alumnos.length;
    }


    static private float promedioDeCurso(Alumno[] alumnos)
    {
        float media = 0;
        for(int i=0; i<alumnos.length; i++)
            media += alumnos[i].getMedia();
        return media/alumnos.length;
    }

    static public void main(String[] args)
    {
        final int CANTIDAD_ALUMNOS = 20;
        final int CANTIDAD_NOTAS = 5;
        Alumno[] alumnos = new Alumno[CANTIDAD_ALUMNOS];

        for(int i=0; i<CANTIDAD_ALUMNOS; i++)
            alumnos[i] = new Alumno(GeneradorPalabras.nextWord(6), GeneradorNumeros.generarNumeros(1, 11, CANTIDAD_NOTAS));

        /* Cualquier metodo de ordenamiento simple es eficaz con colecciones tan pequeñas,
         * no es necesario incrementar la complejidad con métodos subcuadraticos
         */
        MetodosOrdenamiento.selectionSort(alumnos);
      //  MetodosOrdenamiento.insertionSort(alumnos);
      //  MetodosOrdenamiento.bubbleSort(alumnos);

        for(int i=0; i<CANTIDAD_ALUMNOS; i++) 
            System.out.println(alumnos[i]);

        for(int i=0; i<CANTIDAD_NOTAS; i++)
            System.out.printf("Notas promedio de la asignatura %d: %f\n", i, promedioAsignatura(i, alumnos));
        
        
        System.out.println("El promedio del curso es: " + promedioDeCurso(alumnos));


    }
}