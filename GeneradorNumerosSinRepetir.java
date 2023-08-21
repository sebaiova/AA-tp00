import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumerosSinRepetir {

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //Fisher-Yates
    private static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swap(array, i, j);
        }
    }

    static private int[] numerosSinRepetir(int cantidad)
    {
        int[] array = new int[cantidad];

        final int[] batch = new int[1000];
        for(int i=0; i<1000; i++)   // [0, 1, 2, 3, ..., 999]
            batch[i]=i; 

        shuffleArray(batch);
        System.arraycopy(batch, 0, array, 0, cantidad);
        return array;
    } 


    static public void main(String[] args)
    {
        final String outFileName = "sinRepetirRandom.txt";

        int[] numeros = numerosSinRepetir(100);

        try {
            FileWriter fileWriter = new FileWriter(outFileName);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    bufferWriter.write(String.valueOf(numeros[i+j*10] + 1));
                    bufferWriter.write("\t");
                }
                bufferWriter.newLine();
            }
            bufferWriter.close();
        }

        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
}
