public class ListaDeNumeros {
    
    static private Integer[] juntarArreglos(Integer[] a, Integer[] b)
    {
        Integer[] c = new Integer[a.length+b.length];
        int i;
        for(i = 0; i<a.length; i++)
            c[i] = a[i];
        for(int j=0; j<b.length; j++, i++)
            c[i] = b[j];

        return c;
    }

    private static void printArray(Integer[] arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static public void main(String[] args)
    {
        Integer[] A = GeneradorNumeros.generarNumeros(0, 100, 100);
        Integer[] B = GeneradorNumeros.generarNumeros(0, 100, 60);

        System.out.println("Antes de Ordenar: ");

        System.out.print("A: ");
        printArray(A);

        System.out.print("\n B: ");
        printArray(B);

        MetodosOrdenamiento.insertionSort(A);
        MetodosOrdenamiento.selectionSort(B);

        System.out.println("\nDespues de Ordenar: ");

        Integer[] C = juntarArreglos(A, B);

        System.out.print("\nA: ");
        printArray(A);

        System.out.print("\n B: ");
        printArray(B);

        System.out.print("\n C: ");
        printArray(C);
    }
}
