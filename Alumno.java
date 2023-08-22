public class Alumno implements Comparable<Alumno> {
    
    final private String nombre;
    final private Integer[] notas;
    final private float promedio;

    static private float calcularMedia(Integer[] array)
    {   
        float media = 0;
        for(int i=0; i<array.length; i++)
            media += array[i];
        return media/array.length;
    }

    public Alumno(String nombre, Integer[] notas)
    {
        this.nombre = nombre;
        this.notas = notas;
        this.promedio = calcularMedia(notas);
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public Integer[] getNotas()
    {
        return this.notas;
    }

    public float getMedia()
    {
        return this.promedio;
    }

    public float getNotaAsignatura(int numeroAsignatura)
    {
        return notas[numeroAsignatura];
    }

    @Override
    public String toString()
    {
        String string = nombre + ": ";
        for(int i=0; i<notas.length; i++)
            string = string.concat(String.valueOf(notas[i]) + ", ");
        string = string.concat("Promedio: " + promedio);
        return string;
    }

    @Override
    public int compareTo(Alumno o) 
    {
        return o.getMedia() - this.getMedia() > 0 ? 1 : -1;
    }
}
